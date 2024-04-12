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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vacunar24.Entidades.RegistroVacunados;
import vacunar24.Entidades.Reporte;

/**
 *
 * @author Jose
 */
public class ReporteData {
    
    private Connection con = null;
     private Reporte rep;

    public ReporteData() {
        this.con = Conexion.getConexion();
        rep = new Reporte();
    }

    public void guardarReporte(Reporte rep) {
        String query = "INSERT INTO Reporte( asunto, descr, fech,revisado) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, rep.getAsunto());
            ps.setString(2, rep.getDescr());
            ps.setDate(3,Date.valueOf(rep.getFech()));
            ps.setBoolean(4, false);
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                rep.setIdReporte(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo tener el ID...");
            }
            ps.close();
            JOptionPane.showMessageDialog(null, "Guardado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public void revisarReporte(int id) {
        String query = "UPDATE Reporte SET revisado = 1 WHERE idReporte = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }
    
    public void eliminarReporte(int id) {
        String query = "DELETE FROM Reporte WHERE idReporte = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Reporte eliminado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }
    
    public Reporte buscarRepId(int id) {
        String sql = "SELECT asunto, descr, fech,revisado FROM Reporte WHERE idReporte = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                rep = new Reporte();
                rep.setIdReporte(id);
                rep.setAsunto(rs.getString("asunto"));
                rep.setDescr(rs.getString("descr"));
                rep.setFech(rs.getDate("fech").toLocalDate());
                rep.setRev(rs.getBoolean("revisado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Conexion..." + ex.getMessage());
        }
        return rep;
    }
    public ArrayList<Reporte> listarReportes() {
        
        String sql = "SELECT idReporte, asunto, descr, fech,revisado FROM Reporte";
        ArrayList<Reporte> reportes = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                rep = new Reporte();
                rep.setIdReporte(rs.getInt("idReporte"));
                rep.setAsunto(rs.getString("asunto"));
                rep.setDescr(rs.getString("descr"));
                rep.setFech(rs.getDate("fech").toLocalDate());
                rep.setRev(rs.getBoolean("revisado"));
                reportes.add(rep);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Conexion..." + ex.getMessage());
        }
        return reportes;
    }
}
