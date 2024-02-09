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
import vacunar24.Entidades.Profesional;

/**
 *
 * @author Jose
 */
public class ProfesionalData {

    private Connection con = null;
    private Profesional prof;

    public ProfesionalData() {
        this.con = Conexion.getConexion();
        prof = new Profesional();
    }

    public void guardarProfesional(Profesional prof) {
        String query = "INSERT INTO Profesional( dni, nombre, apellido, email, celular, matricula,"
                + " estado) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, prof.getDni());
            ps.setString(2, prof.getNombre());
            ps.setString(3, prof.getApellido());
            ps.setString(4, prof.getEmail());
            ps.setString(5, prof.getCelular());
            ps.setInt(6, prof.getMatricula());
            ps.setBoolean(7, true);
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                prof.setIdProfesional(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo tener el ID...");
            }
            ps.close();
            JOptionPane.showMessageDialog(null, "Guardado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public void modificarProfesional(Profesional prof) {
        String query = "UPDATE Profesional SET dni=?, nombre=?, apellido=?, email=?, celular=?, matricula=?,"
                + " estado= ?  WHERE idProfesional=? ";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, prof.getDni());
            ps.setString(2, prof.getNombre());
            ps.setString(3, prof.getApellido());
            ps.setString(4, prof.getEmail());
            ps.setString(5, prof.getCelular());
            ps.setInt(6, prof.getMatricula());
            ps.setBoolean(7, true);
            ps.setInt(8, prof.getIdProfesional());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Profesional Modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public void eliminarProfesional(int id) {
        String query = "UPDATE Profesional SET estado = 0 WHERE idProfesional = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Profesional eliminado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public Profesional buscarProfesionalId(int id) {
        String sql = "SELECT dni, nombre, apellido, email, celular, matricula FROM Profesional"
                + " WHERE idProfesional=? AND estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                prof = new Profesional();
                prof.setIdProfesional(id);
                prof.setDni(rs.getInt("dni"));
                prof.setNombre(rs.getString("nombre"));
                prof.setApellido(rs.getString("apellido"));
                prof.setEmail(rs.getString("email"));
                prof.setCelular(rs.getString("celular"));
                prof.setMatricula(rs.getInt("matricula"));
                prof.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "no existe el Profesional");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Conexion..."+ex.getMessage());
        }
        return prof;
    }

    public ArrayList<Profesional> listarProfesionales() {

        String sql = "SELECT idProfesional, dni, nombre, apellido, email, celular, matricula FROM Profesional WHERE estado = 1";
        ArrayList<Profesional> profesionales = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                prof = new Profesional();
                prof.setIdProfesional(rs.getInt("idProfesional"));
                prof.setDni(rs.getInt("dni"));
                prof.setNombre(rs.getString("nombre"));
                prof.setApellido(rs.getString("apellido"));
                prof.setEmail(rs.getString("email"));
                prof.setCelular(rs.getString("celular"));
                prof.setMatricula(rs.getInt("matricula"));
                prof.setEstado(true);
                profesionales.add(prof);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Conexion..."+ex.getMessage());
        }
        return profesionales;
    }

}
