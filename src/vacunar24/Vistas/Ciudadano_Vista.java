/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunar24.Vistas;

import java.awt.Frame;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vacunar24.Dao.CiudadanoData;
import vacunar24.Entidades.Ciudadano;

/**
 *
 * @author Jose
 */
public class Ciudadano_Vista extends javax.swing.JInternalFrame {

    private Ciudadano cv;
    private CiudadanoData cd;
    private ArrayList<Ciudadano> listaCiud;
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int row, int colum) {
            return false;
        }
    };
    private Frame f = JOptionPane.getFrameForComponent(this);
    private AgregarCiudadano ag = new AgregarCiudadano(f, true);

    public Ciudadano_Vista() {
        cv = new Ciudadano();
        cd = new CiudadanoData();
        listaCiud = new ArrayList();
        initComponents();
        armarCabecera();
        llenarTabla();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCiud = new javax.swing.JTable();
        jBElim = new javax.swing.JButton();
        jTBuscador = new javax.swing.JTextField();
        jBMod = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 550));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(881, 350));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTCiud.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jTCiud.setFocusable(false);
        jTCiud.getTableHeader().setResizingAllowed(false);
        jTCiud.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTCiud);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1290, 380));

        jBElim.setText("Eliminar");
        jBElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBElimActionPerformed(evt);
            }
        });
        jPanel1.add(jBElim, new org.netbeans.lib.awtextra.AbsoluteConstraints(1176, 482, 100, 40));

        jTBuscador.setText("Buscar...");
        jTBuscador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTBuscadorMouseClicked(evt);
            }
        });
        jTBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBuscadorKeyReleased(evt);
            }
        });
        jPanel1.add(jTBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 40, 277, -1));

        jBMod.setText("modificar");
        jBMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModActionPerformed(evt);
            }
        });
        jPanel1.add(jBMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(1044, 482, 110, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("REGISTRO Y CONTROL DE CIUDADANOS:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 533, -1));

        jBAgregar.setText("Agregar Ciudadano");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jBAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 190, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1307, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        if(ag.isAct()){
            actT();
        }
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jTBuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBuscadorMouseClicked
        jTBuscador.setText("");
    }//GEN-LAST:event_jTBuscadorMouseClicked

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        ag.show();
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModActionPerformed
        if (jTCiud.getSelectedRow() >= 0) {
            cv = new Ciudadano();
            cv = cd.buscarCiudadanoId((int) jTCiud.getValueAt(jTCiud.getSelectedRow(), 0));
            ag.getjTNombre().setText(cv.getNombre());
            ag.getjTApellido().setText(cv.getApellido());
            ag.getjTDni().setText(cv.getDni() + "");
            ag.getjTMail().setText(cv.getEmail());
            ag.getjTTel().setText(cv.getCelular());
            ag.getjCBProv().setSelectedItem(cv.getProvincia());
            ag.getjTLocalidad().setText(cv.getLocalidad());
            ag.getjTDom().setText(cv.getDomicilio());
            ag.getjCBAmbito().setSelectedItem(cv.getAmbitoLab());
            ag.getjTPatolog().setText(cv.getPatologia());
            ag.setIdMod(cv.getIdCiudadano());
            ag.setMod(true);
            ag.show();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un ciudadano en la tabla...");
        }
    }//GEN-LAST:event_jBModActionPerformed

    private void jBElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBElimActionPerformed
        if (jTCiud.getSelectedRow() >= 0) {
            cd.eliminarCiudadano((int) jTCiud.getValueAt(jTCiud.getSelectedRow(), 0));
            actT();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un Ciudadano en la tabla...");
        }
    }//GEN-LAST:event_jBElimActionPerformed

    private void jTBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscadorKeyReleased
        borrarFilas();
        for(Ciudadano c:listaCiud){
            if(c.getNombre().toLowerCase().startsWith(jTBuscador.getText().toLowerCase())||c.getApellido().toLowerCase().startsWith(jTBuscador.getText().toLowerCase())
               || c.getIdCiudadano()== Integer.parseInt(jTBuscador.getText())){
                modelo.addRow(new Object[]{c.getIdCiudadano(), c.getDni(),c.getNombre(), c.getApellido(), c.getEmail(), c.getCelular(), c.getPatologia(), c.getAmbitoLab(),
                c.getDomicilio(), c.getLocalidad(), c.getProvincia(), c.isEstado()});
            }
        }
    }//GEN-LAST:event_jTBuscadorKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBElim;
    private javax.swing.JButton jBMod;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTBuscador;
    private javax.swing.JTable jTCiud;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Codigo");
        filaCabecera.add("Dni");
        filaCabecera.add("Nombre");
        filaCabecera.add("Apellido");
        filaCabecera.add("Email");
        filaCabecera.add("Telefono");
        filaCabecera.add("Patologia");
        filaCabecera.add("AmbLaboral");
        filaCabecera.add("Domicilio");
        filaCabecera.add("Localidad");
        filaCabecera.add("Provincia");
        filaCabecera.add("Estado");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jTCiud.setModel(modelo);

    }
    private void llenarTabla() {
        listaCiud = cd.listarCiudadanos();
        listaCiud.stream().forEach(c -> {
            modelo.addRow(new Object[]{c.getIdCiudadano(), c.getDni(),
                c.getNombre(), c.getApellido(), c.getEmail(), c.getCelular(), c.getPatologia(), c.getAmbitoLab(),
                c.getDomicilio(), c.getLocalidad(), c.getProvincia(), c.isEstado()});
        });
    }
    private void borrarFilas(){
        int i = jTCiud.getRowCount()-1;
        for(;i>=0;i--){
            modelo.removeRow(i);
        }
    }
    private void actT(){
        borrarFilas();
        llenarTabla();
        ag.setAct(false);
    }
}
