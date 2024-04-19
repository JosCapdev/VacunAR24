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
import vacunar24.Entidades.Insumos;

/**
 *
 * @author Jose
 */
public class InsumoData {
    
    private Connection con = null;
     private Insumos ins;
     private VacunaData vacD;

    public InsumoData() {
        this.con = Conexion.getConexion();
        ins = new Insumos();
    }

    public void guardarInsumo(Insumos ins) {
        String query = "INSERT INTO Insumos( idVacuna, otros, centroVacunacion, alcohol,"
                + " fech, enviado) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            if(ins.getVac()!=null){
                ps.setInt(1, ins.getVac().getIdVacuna());
            }else{
                ps.setObject(1, null);
            }
            ps.setString(2, ins.getOtros());
            ps.setString(3, ins.getCentroVacunacion());
            ps.setInt(4, ins.getAlcohol());
            ps.setDate(5, Date.valueOf(ins.getFech()));
            ps.setBoolean(6, false);
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                ins.setIdInsumo(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo tener el ID...");
            }
            ps.close();
            JOptionPane.showMessageDialog(null, "Guardado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public void modificarInsumo(Insumos ins) {
        String query = "UPDATE Insumos SET idVacuna=?, otros=?, centroVacunacion=?,"
                + " alcohol=?, fech=?, enviado=?  WHERE idInsumo=? ";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, ins.getVac().getIdVacuna());
            ps.setString(2, ins.getOtros());
            ps.setString(3, ins.getCentroVacunacion());
            ps.setInt(4, ins.getAlcohol());
            ps.setDate(5, Date.valueOf(ins.getFech()));
            ps.setBoolean(6, ins.isEnviado());
            ps.setInt(7, ins.getIdInsumo());
            
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Insumo Modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public void eliminarInsumo(int id) {
        String query = "DELETE FROM Insumos WHERE idInsumo = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Insumo eliminado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion... " + ex.getMessage());
        }
    }

    public Insumos buscarInsumoId(int id) {
        String sql = "SELECT idVacuna, otros, centroVacunacion, alcohol, fech, enviado FROM Insumos"
                + " WHERE idInsumo=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ins = new Insumos();
                vacD = new VacunaData();
                ins.setIdInsumo(id);
                if(rs.getObject("idVacuna")!= null){
                  ins.setVac(vacD.buscarVacunaId(rs.getInt("idVacuna")));
                }
                ins.setOtros(rs.getString("otros"));
                ins.setCentroVacunacion(rs.getString("centroVacunacion"));
                ins.setAlcohol(rs.getInt("alcohol"));
                ins.setFech(rs.getDate("fech").toLocalDate());
                ins.setEnviado(rs.getBoolean("enviado"));
                
            } else {
                JOptionPane.showMessageDialog(null, "no existe el Insumo");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Conexion..." + ex.getMessage());
        }
        return ins;
    }
    
    public ArrayList<Insumos> listarInsumos() {

        String sql = "SELECT idInsumo, idVacuna, otros, centroVacunacion, alcohol, fech, enviado FROM Insumos";
        ArrayList<Insumos> insumos = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ins = new Insumos();
                vacD = new VacunaData();
                ins.setIdInsumo(rs.getInt("idInsumo"));
                if(rs.getObject("idVacuna")!= null){
                  ins.setVac(vacD.buscarVacunaId(rs.getInt("idVacuna")));
                }
                ins.setOtros(rs.getString("otros"));
                ins.setCentroVacunacion(rs.getString("centroVacunacion"));
                ins.setAlcohol(rs.getInt("alcohol"));
                ins.setFech(rs.getDate("fech").toLocalDate());
                ins.setEnviado(rs.getBoolean("enviado"));
                insumos.add(ins);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Conexion..." + ex.getMessage());
        }
        return insumos;
    }
}
