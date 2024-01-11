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
import vacunar24.Entidades.Ciudadano;

/**
 *
 * @author Jose
 */
public class CiudadanoData {

    private Connection con = null;
    private Ciudadano ciud;

    public CiudadanoData() {
        this.con = Conexion.getConexion();
        ciud = new Ciudadano();
    }

    public void guardarCiudadano(Ciudadano ciud) {
        String query = "INSERT INTO ciudadano( dni, nombre, apellido, email, celular, patologia,"
                + " ambitoLab, domicilio, localidad, Provincia, estado) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ciud.getDni());
            ps.setString(2, ciud.getNombre());
            ps.setString(3, ciud.getApellido());
            ps.setString(4, ciud.getEmail());
            ps.setString(4, ciud.getCelular());
            ps.setString(6, ciud.getPatologia());
            ps.setString(7, ciud.getAmbitoLab());
            ps.setString(8, ciud.getDomicilio());
            ps.setString(9, ciud.getLocalidad());
            ps.setString(10, ciud.getProvincia());
            ps.setBoolean(11, true);
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                ciud.setIdCiudadano(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo tener el ID...");
            }
            ps.close();
            JOptionPane.showMessageDialog(null, "Guardado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public void modificarCiudadano(Ciudadano ciud) {
        String query = "UPDATE ciudadano SET dni=?, nombre=?, apellido=?, email=?, celular=?, patologia=?,"
                + " ambitoLab=?, domicilio=?, localidad=?, Provincia=?, estado= ?  WHERE idCiudadano=? ";
                
        try {
            PreparedStatement ps = con.prepareStatement(query);
             ps.setInt(1, ciud.getDni());
            ps.setString(2, ciud.getNombre());
            ps.setString(3, ciud.getApellido());
            ps.setString(4, ciud.getEmail());
            ps.setString(4, ciud.getCelular());
            ps.setString(6, ciud.getPatologia());
            ps.setString(7, ciud.getAmbitoLab());
            ps.setString(8, ciud.getDomicilio());
            ps.setString(9, ciud.getLocalidad());
            ps.setString(10, ciud.getProvincia());
            ps.setBoolean(11, true);
            ps.setInt(12, ciud.getIdCiudadano());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Ciudadano Modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }
    
    public void eliminarCiudadano(int id) {
        String query = "UPDATE ciudadano SET estado = 0 WHERE idCuidadano = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Ciudadano eliminado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public Ciudadano buscarCiudadanoId(int id) {
        String sql = "SELECT dni, nombre, apellido, email, celular, patologia,ambitoLab, domicilio, localidad,"
                + " Provincia FROM Ciudadano WHERE idCiudadano=? AND estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ciud = new Ciudadano();
                ciud.setIdCiudadano(id);
                ciud.setDni(rs.getInt("dni"));
                ciud.setNombre(rs.getString("nombre"));
                ciud.setApellido(rs.getString("apellido"));
                ciud.setEmail(rs.getString("email"));
                ciud.setCelular(rs.getString("celular"));
                ciud.setPatologia(rs.getString("patologia"));
                ciud.setAmbitoLab(rs.getString("ambitoLab"));
                ciud.setDomicilio(rs.getString("domicilio"));
                ciud.setLocalidad(rs.getString("localidad"));
                ciud.setProvincia(rs.getString("Provincia"));
                ciud.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "no existe el Ciudadano");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ciudadano");
        }
        return ciud;
    }

    public ArrayList<Ciudadano> listarCiudadanos() {

        String sql = "SELECT idCiudadano, dni, nombre, apellido, email, celular, patologia,ambitoLab, domicilio, localidad,"
                + "Provincia FROM Ciudadano WHERE estado = 1 ";
        ArrayList<Ciudadano> ciudadanos = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ciud = new Ciudadano();
                ciud.setIdCiudadano(rs.getInt("idCiudadano"));
                ciud.setDni(rs.getInt("dni"));
                ciud.setNombre(rs.getString("nombre"));
                ciud.setApellido(rs.getString("apellido"));
                ciud.setEmail(rs.getString("email"));
                ciud.setCelular(rs.getString("celular"));
                ciud.setPatologia(rs.getString("patologia"));
                ciud.setAmbitoLab(rs.getString("ambitoLab"));
                ciud.setDomicilio(rs.getString("domicilio"));
                ciud.setLocalidad(rs.getString("localidad"));
                ciud.setProvincia(rs.getString("Provincia"));
                ciud.setEstado(true);
                ciudadanos.add(ciud);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ciudadano");
        }
        return ciudadanos;
    }
}
