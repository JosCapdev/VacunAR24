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

    public VacunaData() {
        this.con = Conexion.getConexion();
        vac = new Vacuna();
    }

    public void guardarLaboratorio(Vacuna vac) {
        String query = "INSERT INTO Vacuna( numSerieDosis, marca, medida, fechaVto, colocada,"
                + " estado) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, vac.getNumSerieDosis());
            ps.setString(2, vac.getMarca());
            ps.setDouble(3, vac.getMedida());
            ps.setDate(4, Date.valueOf(vac.getFechaVto()));
            ps.setBoolean(5, vac.isColocada());
            ps.setBoolean(6, true);
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
        String query = "UPDATE Laboratorio SET numSerieDosis=?, marca=?, medida=?, fechaVto=?,"
                + " ,colocada=?, estado= ?  WHERE idLaboratorio=? ";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, vac.getNumSerieDosis());
            ps.setString(2, vac.getMarca());
            ps.setDouble(3, vac.getMedida());
            ps.setDate(4, Date.valueOf(vac.getFechaVto()));
            ps.setBoolean(5, vac.isColocada());
            ps.setBoolean(6, true);
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
        String sql = "SELECT numSerieDosis, marca, medida, fechaVto, colocada FROM Vacuna"
                + " WHERE idVacuna=? AND estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                vac = new Vacuna();
                vac.setIdVacuna(id);
                vac.setNumSerieDosis(rs.getInt("numSerieDosis"));
                vac.setMarca(rs.getString("marca"));
                vac.setMedida(rs.getDouble("medida"));
                vac.setFechaVto(rs.getDate("fechaVto").toLocalDate());
                vac.setColocada(rs.getBoolean("colocada"));
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

        String sql = "SELECT idVacuna, numSerieDosis, marca, medida, fechaVto, colocada FROM Vacuna WHERE estado = 1";
        ArrayList<Vacuna> vacunas = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vac = new Vacuna();
                vac.setIdVacuna(rs.getInt("idVacuna"));
                vac.setNumSerieDosis(rs.getInt("numSerieDosis"));
                vac.setMarca(rs.getString("marca"));
                vac.setMedida(rs.getDouble("medida"));
                vac.setFechaVto(rs.getDate("fechaVto").toLocalDate());
                vac.setColocada(rs.getBoolean("colocada"));
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
