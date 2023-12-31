/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunar24.Vistas;

import javax.swing.JOptionPane;
import vacunar24.Entidades.Ciudadano;

/**
 *
 * @author Jose
 */
public class Ciudadano_Vista extends javax.swing.JInternalFrame {

    private Ciudadano cv = new Ciudadano();
    
    public Ciudadano_Vista() {
        initComponents();
        
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
        jBAgregar = new javax.swing.JButton();
        jTNombre = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        jTDni = new javax.swing.JTextField();
        jTTel = new javax.swing.JTextField();
        jTMail = new javax.swing.JTextField();
        jTPatolog = new javax.swing.JTextField();
        jTLocalidad = new javax.swing.JTextField();
        jCProv = new javax.swing.JComboBox<>();
        jBLimpiar = new javax.swing.JButton();
        jCBAmbito = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBElim = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jBMod = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCBS = new javax.swing.JCheckBox();
        jCBN = new javax.swing.JCheckBox();
        jTDom = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(825, 355));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(881, 350));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBAgregar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBAgregar.setText("+");
        jBAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBAgregarMouseClicked(evt);
            }
        });
        jPanel1.add(jBAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 265, 84, -1));

        jTNombre.setText("Nombre");
        jPanel1.add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jTApellido.setText("Apellido");
        jTApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(jTApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jTDni.setText("DNI");
        jTDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDniActionPerformed(evt);
            }
        });
        jPanel1.add(jTDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 101, -1));

        jTTel.setText("Telefono");
        jPanel1.add(jTTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 106, -1));

        jTMail.setText("Correo electronico");
        jPanel1.add(jTMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 118, -1));

        jTPatolog.setText("Descripción de patología");
        jPanel1.add(jTPatolog, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 204, -1));

        jTLocalidad.setText("Localidad");
        jPanel1.add(jTLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 95, -1));

        jCProv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buenos Aires", "CABA", "Catamarca", "Chaco", "Chubut", "Córdoba", "Corrientes", "Entre Ríos", "Formosa", "Jujuy", "La Pampa", "La Rioja", "Mendoza", "Misiones", "Neuquén", "Río Negro", "Salta", "San Juan", "San Luis", "Santa Cruz", "Santa Fe", "Santiago del Estero", "Tierra del Fuego, Antartida e islas del Atlántico Sur", "Tucumán" }));
        jPanel1.add(jCProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 130, -1));

        jBLimpiar.setText("Limpiar Campos");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jBLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 275, -1, -1));

        jCBAmbito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salud", "Educacion", "Fuerzas de Seguridad", "Fuerzas Armadas", "Bomberos", "Comercio", "Saneamiento", "Transporte Esencial", "Mantenimiento de los servicios básicos", "Otros", " ", " ", " ", " " }));
        jCBAmbito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAmbitoActionPerformed(evt);
            }
        });
        jPanel1.add(jCBAmbito, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 130, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Ambito Laboral:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 65, 580, 211));

        jBElim.setText("Eliminar");
        jPanel1.add(jBElim, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 282, -1, -1));

        jTextField7.setText("Buscar...");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 23, 277, -1));

        jBMod.setText("modificar");
        jPanel1.add(jBMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 282, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Posee Patologías:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("REGISTRO Y CONTROL DE CIUDADANOS:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 533, -1));

        jCBS.setText("Si");
        jCBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBSActionPerformed(evt);
            }
        });
        jPanel1.add(jCBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jCBN.setText("No");
        jCBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBNActionPerformed(evt);
            }
        });
        jPanel1.add(jCBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jTDom.setText("Domicilio");
        jPanel1.add(jTDom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 206, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTApellidoActionPerformed

    private void jTDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDniActionPerformed

    private void jCBAmbitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAmbitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBAmbitoActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jBAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAgregarMouseClicked
        try {
            String nombre = jTNombre.getText();
            String apellido = jTApellido.getText();
            int dni = Integer.parseInt(jTDni.getText());
            String email = jTMail.getText();
            String telef = jTTel.getText();
            String Localidad = jTLocalidad.getText();
            String dom = jTDom.getText();
            String Prov = (String) jCProv.getSelectedItem();
            String amb = (String) jCBAmbito.getSelectedItem();
            String patolog;
            patolog = jCBS.isSelected() ? jTPatolog.getText() : "No tiene";
            cv = new Ciudadano(patolog, amb,dom,Localidad,Prov,dni,nombre,apellido,email,telef,true);
             
             limpiarCampos();

            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Datos incompatible");
            limpiarCampos();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Completar datos");
        }
    }//GEN-LAST:event_jBAgregarMouseClicked

    private void jCBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBNActionPerformed
        jCBS.setSelected(false);
        jTPatolog.enable(false);
        
    }//GEN-LAST:event_jCBNActionPerformed

    private void jCBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBSActionPerformed
        jCBN.setSelected(false);
        jTPatolog.enable(true);
    }//GEN-LAST:event_jCBSActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jBLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBElim;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBMod;
    private javax.swing.JComboBox<String> jCBAmbito;
    private javax.swing.JCheckBox jCBN;
    private javax.swing.JCheckBox jCBS;
    private javax.swing.JComboBox<String> jCProv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTDom;
    private javax.swing.JTextField jTLocalidad;
    private javax.swing.JTextField jTMail;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTPatolog;
    private javax.swing.JTextField jTTel;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
    
    public void limpiarCampos() {

        jTNombre.setText("");
        jTApellido.setText("");
        jTDni.setText("");
        jTMail.setText("");
        jTLocalidad.setText("");
        jTDom.setText("");
        jTTel.setText("");
        jTPatolog.setText("");
        jCBAmbito.setSelectedIndex(-1);
        jCProv.setSelectedIndex(-1);
        jCBS.setSelected(false);
        jCBN.setSelected(false);
        cv = null;

    }
    
}
