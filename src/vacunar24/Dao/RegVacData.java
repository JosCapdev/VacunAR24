/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunar24.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vacunar24.Entidades.RegistroVacunados;

/**
 *
 * @author Jose
 */
public class RegVacData {
     private Connection con = null;
     private RegistroVacunados regVac;
     private CiudadanoData cd;
     private VacunaData vacD;
     private ProfesionalData profD;
     

    public RegVacData() {
        this.con = Conexion.getConexion();
        regVac = new RegistroVacunados();
        cd = new CiudadanoData();
        vacD = new VacunaData();
    }
    
    public void guardarRegVac(RegistroVacunados regVac) {
        String query = "INSERT INTO RegistroVacunados(idCiudadano,codRefuerzo,centroVacunacion,fechaHoraColocada,"
                + "idVacuna,idProfesional,numSerieDosis) VALUES (?,?,?,?,?,?,?)";

        try {
             PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, regVac.getPersona().getIdCiudadano());
            ps.setInt(2,regVac.getCodRefuerzo());
            ps.setString(3, regVac.getCentroVacunacion());
            ps.setString(4,regVac.getFechaHoraColoc());
            ps.setInt(5,regVac.getDosis().getIdVacuna());
            ps.setInt(6,regVac.getProf().getIdProfesional());
            ps.setInt(7, regVac.getNumSerieDosis());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                regVac.setIdRegistroVacunados(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo tener el ID...");
            }
            ps.close();
            JOptionPane.showMessageDialog(null, "Guardado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }
    public void modificarRegistro(RegistroVacunados reg){
         String query = "UPDATE RegistroVacunados SET idCiudadano=?,codRefuerzo=?,centroVacunacion=?,fechaHoraColocada=?,"
                + "idVacuna=?,idProfesional=?,numSerieDosis=? WHERE idRegistroVacunados=?";
         try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, regVac.getPersona().getIdCiudadano());
            ps.setInt(2,regVac.getCodRefuerzo());
            ps.setString(3, regVac.getCentroVacunacion());
            ps.setString(4,regVac.getFechaHoraColoc());
            ps.setInt(5,regVac.getDosis().getIdVacuna());
            ps.setInt(6,regVac.getProf().getIdProfesional());
            ps.setInt(7, regVac.getNumSerieDosis());
            ps.setInt(8,regVac.getIdRegistroVacunados());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }
    public void eliminarCita(int id) {
        String query = "DELETE FROM RegistroVacunados WHERE idRegistroVacunados = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Registro eliminado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public RegistroVacunados buscarRegId(int id) {
        String sql = "SELECT idCiudadano, codRefuerzo,centroVacunacion,fechaHoraColocada,"
                + "idVacuna,idProfesional,numSerieDosis FROM RegistroVacunados WHERE idRegistroVacunados = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                regVac = new RegistroVacunados();
                profD = new ProfesionalData();
                regVac.setIdRegistroVacunados(id);
                regVac.setPersona(cd.buscarCiudadanoId(rs.getInt("idCiudadano")));
                regVac.setCodRefuerzo(rs.getInt("codRefuerzo"));
                regVac.setCentroVacunacion(rs.getString("centroVacunacion"));
                regVac.setFechaHoraColoc(rs.getString("fechaHoraColocada"));
                regVac.setDosis(vacD.buscarVacunaId(rs.getInt("idVacuna")));
                regVac.setProf(profD.buscarProfesionalId(rs.getInt("idProfesional")));
                regVac.setNumSerieDosis(rs.getInt("numSerieDosis"));

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Conexion..." + ex.getMessage());
        }
        return regVac;
    }
    public ArrayList<RegistroVacunados> listarRegistros() {

        String sql = "SELECT idRegistroVacunados,idCiudadano,codRefuerzo,centroVacunacion,fechaHoraColocada,"
                + "idVacuna,idProfesional,numSerieDosis FROM RegistroVacunados";
        ArrayList<RegistroVacunados> registro = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                regVac = new RegistroVacunados();
                cd= new CiudadanoData();
                profD = new ProfesionalData();
                regVac.setIdRegistroVacunados(rs.getInt("idRegistroVacunados"));
                regVac.setPersona(cd.buscarCiudadanoId(rs.getInt("idCiudadano")));
                regVac.setCodRefuerzo(rs.getInt("codRefuerzo"));
                regVac.setCentroVacunacion(rs.getString("centroVacunacion"));
                regVac.setFechaHoraColoc(rs.getString("fechaHoraColocada"));
                regVac.setDosis(vacD.buscarVacunaId(rs.getInt("idVacuna")));
                regVac.setProf(profD.buscarProfesionalId(rs.getInt("idProfesional")));
                regVac.setNumSerieDosis(rs.getInt("numSerieDosis"));
                registro.add(regVac);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Conexion..." + ex.getMessage());
        }
        return registro;
    }
    
public int buscarUltCod(int id) {
        String sql = "SELECT MAX(idRegistroVacunados) idRegistroVacunados FROM RegistroVacunados WHERE idCiudadano = ?";
        int idF=0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                idF= rs.getInt("idRegistroVacunados");     
            } else {
                JOptionPane.showMessageDialog(null, "Nuevo Paciente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Conexion..." + ex.getMessage());
        }
        return idF;
    }
}
