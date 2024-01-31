/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunar24.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose
 */
public class Conexion {
     private static final String URL="jdbc:mariadb://Localhost/";
    private static final String DB="Vacunar24";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection conexion;
    
    public static Connection getConexion(){
    
        if(conexion==null){
        
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conexion=DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"Error al cargar los driver (La BD esta dentro de la carpeta del proyecto)");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error de conexion");
            }
            
        }
        return conexion;
    }
}
