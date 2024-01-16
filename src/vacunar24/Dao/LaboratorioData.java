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
import vacunar24.Entidades.Laboratorio;

/**
 *
 * @author Jose
 */
public class LaboratorioData {

    private Connection con = null;
    private Laboratorio lab;

    public LaboratorioData() {
        this.con = Conexion.getConexion();
        lab = new Laboratorio();
    }

    public void guardarLaboratorio(Laboratorio lab) {
        String query = "INSERT INTO Laboratorio( cuit, nombLaboratorio, pais, domComercial,"
                + " estado) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, lab.getCuit());
            ps.setString(2, lab.getNomLaboratorio());
            ps.setString(3, lab.getPais());
            ps.setString(4, lab.getDomComercial());
            ps.setBoolean(5, true);
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                lab.setIdLaboratorio(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo tener el ID...");
            }
            ps.close();
            JOptionPane.showMessageDialog(null, "Guardado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public void modificarLaboratorio(Laboratorio lab) {
        String query = "UPDATE Laboratorio SET cuit=?, nomLaboratorio=?, pais=?, domComercial=?,"
                + " estado= ?  WHERE idLaboratorio=? ";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, lab.getCuit());
            ps.setString(2, lab.getNomLaboratorio());
            ps.setString(3, lab.getPais());
            ps.setString(4, lab.getDomComercial());
            ps.setBoolean(5, true);
            ps.setInt(8, lab.getIdLaboratorio());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Laboratorio Modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public void eliminarLaboratorio(int id) {
        String query = "UPDATE Laboratorio SET estado = 0 WHERE idLaboratorio = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Laboratorio eliminado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public Laboratorio buscarLaboratorioId(int id) {
        String sql = "SELECT cuit, nombLaboratorio, pais, domComercial FROM Laboratorio"
                + " WHERE idLaboratorio=? AND estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lab = new Laboratorio();
                lab.setIdLaboratorio(id);
                lab.setCuit(rs.getInt("cuit"));
                lab.setNomLaboratorio(rs.getString("nombLaboratorio"));
                lab.setPais(rs.getString("pais"));
                lab.setDomComercial(rs.getString("domComercial"));
                lab.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "no existe el Laboratorio");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Conexion..." + ex.getMessage());
        }
        return lab;
    }

    public ArrayList<Laboratorio> listarLaboratorios() {

        String sql = "SELECT idLaboratorio, cuit, nombLaboratorio, pais, domComercial FROM Laboratorio WHERE estado = 1";
        ArrayList<Laboratorio> laboratorios = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lab = new Laboratorio();
                lab.setIdLaboratorio(rs.getInt("idLaboratorio"));
                lab.setCuit(rs.getInt("cuit"));
                lab.setNomLaboratorio(rs.getString("nombLaboratorio"));
                lab.setPais(rs.getString("pais"));
                lab.setDomComercial(rs.getString("domComercial"));
                lab.setEstado(true);
                laboratorios.add(lab);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Conexion..." + ex.getMessage());
        }
        return laboratorios;
    }

}
