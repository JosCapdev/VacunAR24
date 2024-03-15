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
import java.sql.Date;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vacunar24.Entidades.Vacuna;

/**
 *
 * @author Jose
 */
public class VacunaData {
     private Connection con = null;
     private Vacuna vac;
     private LaboratorioData labD;

    public VacunaData() {
        this.con = Conexion.getConexion();
        vac = new Vacuna();
    }

    public void guardarVacuna(Vacuna vac) {
        String query = "INSERT INTO Vacuna( marca, medida, fechaVto, colocada,"
                + " cantidad, idLaboratorio, estado) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, vac.getMarca());
            ps.setDouble(2, vac.getMedida());
            ps.setDate(3, Date.valueOf(vac.getFechaVto()));
            ps.setBoolean(4, vac.isColocada());
            ps.setInt(5, vac.getCantidad());
            ps.setInt(6, vac.getLab().getIdLaboratorio());
            ps.setBoolean(7, true);
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                vac.setIdVacuna(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo tener el ID...");
            }
            ps.close();
            JOptionPane.showMessageDialog(null, "Guardado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public void modificarVacuna(Vacuna vac) {
        String query = "UPDATE Vacuna SET marca=?, medida=?, fechaVto=?,"
                + " colocada=?, cantidad=?, idLaboratorio=?, estado=?  WHERE idVacuna=? ";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, vac.getMarca());
            ps.setDouble(2, vac.getMedida());
            ps.setDate(3, Date.valueOf(vac.getFechaVto()));
            ps.setBoolean(4, vac.isColocada());
            ps.setInt(5, vac.getCantidad());
            ps.setInt(6, vac.getLab().getIdLaboratorio());
            ps.setBoolean(7, true);
            ps.setInt(8, vac.getIdVacuna());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Vacuna Modificada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public void eliminarVacuna(int id) {
        String query = "UPDATE Vacuna SET estado = 0 WHERE idVacuna = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Vacuna eliminada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public Vacuna buscarVacunaId(int id) {
        String sql = "SELECT marca, medida, fechaVto, colocada, cantidad, idLaboratorio FROM Vacuna"
                + " WHERE idVacuna=? AND estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                vac = new Vacuna();
                vac.setIdVacuna(id);
                vac.setMarca(rs.getString("marca"));
                vac.setMedida(rs.getDouble("medida"));
                vac.setFechaVto(rs.getDate("fechaVto").toLocalDate());
                vac.setColocada(rs.getBoolean("colocada"));
                vac.setCantidad(rs.getInt("cantidad"));
                vac.setLab(labD.buscarLaboratorioId(rs.getInt("idLaboratorio")));
                vac.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "no existe la Vacuna");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Conexion..." + ex.getMessage());
        }
        return vac;
    }
    
    public ArrayList<Vacuna> listarVacunas() {

        String sql = "SELECT idVacuna, marca, medida, fechaVto, colocada, cantidad, idLaboratorio FROM Vacuna WHERE estado=1";
        ArrayList<Vacuna> vacunas = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vac = new Vacuna();
                labD = new LaboratorioData();
                vac.setIdVacuna(rs.getInt("idVacuna"));
                vac.setMarca(rs.getString("marca"));
                vac.setMedida(rs.getDouble("medida"));
                vac.setFechaVto(rs.getDate("fechaVto").toLocalDate());
                vac.setColocada(rs.getBoolean("colocada"));
                vac.setCantidad(rs.getInt("cantidad"));
                vac.setLab(labD.buscarLaboratorioId(rs.getInt("idLaboratorio")));
                vac.setEstado(true);
                vacunas.add(vac);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Conexion..." + ex.getMessage());
        }
        return vacunas;
    }
   
}
