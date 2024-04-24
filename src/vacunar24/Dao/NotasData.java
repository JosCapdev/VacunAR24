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
import javax.swing.JOptionPane;
import vacunar24.Entidades.Notas;

/**
 *
 * @author Jose
 */
public class NotasData {
    
    private Connection con = null;
     private Notas nota;

    public NotasData() {
        this.con = Conexion.getConexion();
        nota = new Notas();
    }

    public void guardarNot(Notas not) {
        String query = "INSERT INTO Notas( not1,not2,not3,not4,not5,not6,not7) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, not.getNot1());
            ps.setString(2, not.getNot2());
            ps.setString(3, not.getNot3());
            ps.setString(4, not.getNot4());
            ps.setString(5, not.getNot5());
            ps.setString(6, not.getNot6());
            ps.setString(7, not.getNot7());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            ps.close();
            JOptionPane.showMessageDialog(null, "Aviso enviado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public void eliminarNot() {
        String query = "DELETE FROM notas ";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }
    
    public Notas traerNotas() {
        
        String sql = "SELECT not1,not2,not3,not4,not5,not6,not7 FROM Notas";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                nota = new Notas();
                nota.setNot1(rs.getString("not1"));
                nota.setNot2(rs.getString("not2"));
                nota.setNot3(rs.getString("not3"));
                nota.setNot4(rs.getString("not4"));
                nota.setNot5(rs.getString("not5"));
                nota.setNot6(rs.getString("not6"));
                nota.setNot7(rs.getString("not7"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Conexion..." + ex.getMessage());
        }
        return nota;
    }
}
