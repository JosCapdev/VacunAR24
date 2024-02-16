/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunar24.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vacunar24.Entidades.CitaVacunacion;
import vacunar24.Entidades.Ciudadano;

/**
 *
 * @author Jose
 */
public class CitaVacData {
     private Connection con = null;
     private CitaVacunacion citaV;
     private Ciudadano c;
     private CiudadanoData cd;
     private VacunaData vacD;

    public CitaVacData() {
        this.con = Conexion.getConexion();
        citaV = new CitaVacunacion();
        c = new Ciudadano();
        cd = new CiudadanoData();
        vacD = new VacunaData();
    }

    public void guardarCita(CitaVacunacion citaV) {
        String query = "INSERT INTO CitaVacunacion( idCiudadano, codRefuerzo, fechaHoraCita,centroVacunacion,fechaHoraColocada,"
                + " numSerieDosis) VALUES (?,?,?,?,?,?)";
        try {           
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,citaV.getPersona().getIdCiudadano());
            ps.setInt(2,citaV.getCodRefuerzo());
            ps.setString(3,citaV.getFechaHoraCita());
            ps.setString(4,citaV.getCentroVacunacion());
            ps.setDate(5,Date.valueOf(citaV.getFechaHoraColoc()));
            ps.setInt(6, citaV.getDosis().getNumSerieDosis());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                citaV.setIdCitaVacunacion(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo tener el ID...");
            }
            ps.close();
            JOptionPane.showMessageDialog(null, "Guardado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public void modificarCitaVac(CitaVacunacion citaV) {
        String query = "UPDATE CitaVacunacion SET idCiudadano = ?, codRefuerzo = ?, fechaHoraCita = ?,"
                + "centroVacunacion = ?,fechaHoraColocada = ?,numSerieDosis = ? WHERE idCitaVacunacion = ?";

        try {
             PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,citaV.getPersona().getIdCiudadano());
            ps.setInt(2,citaV.getCodRefuerzo());
            ps.setString(3,citaV.getFechaHoraCita());
            ps.setString(4,citaV.getCentroVacunacion());
            ps.setDate(5,Date.valueOf(citaV.getFechaHoraColoc()));
            ps.setInt(6, citaV.getDosis().getNumSerieDosis());
            ps.setInt(7, citaV.getIdCitaVacunacion());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Cita Modificada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public void eliminarCita(int id) {
        String query = "UPDATE CitaVacunacion SET estado = 0 WHERE idCitaVacunacion = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Cita eliminada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public CitaVacunacion buscarCitaId(int id) {
        String sql = "SELECT idCiudadano, codRefuerzo, fechaHoraCita,centroVacunacion,fechaHoraColocada,"
                + " numSerieDosis FROM CitaVacunacion WHERE idCitaVacunacion = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                citaV = new CitaVacunacion();
                citaV.setIdCitaVacunacion(id);
                citaV.setPersona(cd.buscarCiudadanoId(rs.getInt("idCiudadano")));
                citaV.setCodRefuerzo(rs.getInt("codRefuerzo"));
                citaV.setFechaHoraCita(rs.getString("fechaHoraCita"));
                citaV.setCentroVacunacion(rs.getString("centroVacunacion"));
                citaV.setFechaHoraColoc(rs.getDate("fechaHoraColocada").toLocalDate());
                citaV.setDosis(vacD.buscarVacunaSerie(rs.getInt("numSerieDosis")));

            } else {
                JOptionPane.showMessageDialog(null, "Nuevo Paciente...");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Conexion..." + ex.getMessage());
        }
        return citaV;
    }
    public int buscarUltCitaCiud(int id) {
        String sql = "SELECT MAX(idCitaVacunacion) idCitaVacunacion FROM CitaVacunacion WHERE idCiudadano = ?";
        int idF=0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                idF= rs.getInt("idCitaVacunacion");     
            } else {
                JOptionPane.showMessageDialog(null, "Nuevo Paciente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Conexion..." + ex.getMessage());
        }
        return idF;
    }
        public int buscarUltFech(int id) {
        String sql = "SELECT MAX(idCitaVacunacion) idCitaVacunacion FROM CitaVacunacion WHERE idCiudadano = ?";
        int idF=0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                idF= rs.getInt("idCitaVacunacion");     
            } else {
                JOptionPane.showMessageDialog(null, "Nuevo Paciente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Conexion..." + ex.getMessage());
        }
        return idF;
    }
        public int buscarUltTurno() {
        String sql = "SELECT MAX(idCitaVacunacion) idCitaVacunacion FROM CitaVacunacion";
        int idF=0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                idF= rs.getInt("idCitaVacunacion");     
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro ningun turno agendado..");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Conexion..." + ex.getMessage());
        }
        return idF;
    }
    public ArrayList<CitaVacunacion> listarCitas() {

        String sql = "SELECT idCitaVacunacion, idCiudadano, codRefuerzo, fechaHoraCita,centroVacunacion,fechaHoraColocada,"
                + " numSerieDosis FROM CitaVacunacion";
        ArrayList<CitaVacunacion> citas = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                citaV = new CitaVacunacion();
                cd= new CiudadanoData();
                citaV.setIdCitaVacunacion(rs.getInt("idCitaVacunacion"));
                citaV.setPersona(cd.buscarCiudadanoId(rs.getInt("idCiudadano")));
                citaV.setCodRefuerzo(rs.getInt("codRefuerzo"));
                citaV.setFechaHoraCita(rs.getString("fechaHoraCita"));
                citaV.setCentroVacunacion(rs.getString("centroVacunacion"));
                citaV.setFechaHoraColoc(rs.getDate("fechaHoraColocada").toLocalDate());
                citaV.setDosis(vacD.buscarVacunaSerie(rs.getInt("numSerieDosis")));
                citas.add(citaV);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Conexion..." + ex.getMessage());
        }
        return citas;
    }
    
}
