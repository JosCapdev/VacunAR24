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
import vacunar24.Dao.RegVacData;
import vacunar24.Entidades.RegistroVacunados;

/**
 *
 * @author Jose
 */
public class RegistroVacunacion extends javax.swing.JInternalFrame {

    private RegistroVacunados regVac;
    private RegVacData regVacD;
    private ArrayList<RegistroVacunados> listaRegistro; 
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int row, int colum) {
            return false;
        }
    };
    private Frame f = JOptionPane.getFrameForComponent(this);
    private AgregarCita ac = new AgregarCita(f, true);

    public RegistroVacunacion() {
        regVac = new RegistroVacunados();
        regVacD = new RegVacData();
        listaRegistro = new ArrayList();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTReg = new javax.swing.JTable();
        jBNuevo = new javax.swing.JButton();
        jBElim = new javax.swing.JButton();
        jTBuscador = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("REGISTROS DE VACUNACION:");

        jTReg.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTReg);

        jBNuevo.setText("Nuevo Turno");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBElim.setText("Eliminar Turno");
        jBElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBElimActionPerformed(evt);
            }
        });

        jTBuscador.setText("Buscar...");
        jTBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBuscadorKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 783, Short.MAX_VALUE)
                        .addComponent(jTBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBElim, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBElim))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        ac.show();
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBElimActionPerformed
        if (jTReg.getSelectedRow() >= 0) {
            regVacD.eliminarCita((int) jTReg.getValueAt(jTReg.getSelectedRow(), 0));
            actT();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un registro de la tabla...");
        }
    }//GEN-LAST:event_jBElimActionPerformed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        if (ac.isAct()) {
            actT();
        }
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jTBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscadorKeyReleased
        modelo.setNumRows(0);
        for (RegistroVacunados regVac : listaRegistro) {
            if (regVac.getPersona().getNombre().toLowerCase().startsWith(jTBuscador.getText().toLowerCase()) || regVac.getPersona().getApellido().toLowerCase().startsWith(jTBuscador.getText().toLowerCase())
                    || regVac.getPersona().getDni() == Integer.parseInt(jTBuscador.getText())){
                modelo.addRow(new Object[]{regVac.getIdRegistroVacunados(), regVac.getPersona().getIdCiudadano(), regVac.getCodRefuerzo()
                        , regVac.getCentroVacunacion(),regVac.getFechaHoraColoc(),regVac.getDosis().getMarca(),regVac.getNumSerieDosis()});
            }
        }
    }//GEN-LAST:event_jTBuscadorKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBElim;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTBuscador;
    private javax.swing.JTable jTReg;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Codigo");
        filaCabecera.add("idCiudadano");
        filaCabecera.add("Codigo refuerzo");
        filaCabecera.add("Centro Vacunatorio");
        filaCabecera.add("FechaHoraColocacion");
        filaCabecera.add("Dosis");
        filaCabecera.add("N°SerieDosis");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jTReg.setModel(modelo);
    }

    private void llenarTabla() {
        listaRegistro = regVacD.listarRegistros();
        listaRegistro.stream().forEach(cv -> {
            modelo.addRow(new Object[]{regVac.getIdRegistroVacunados(), regVac.getPersona().getIdCiudadano(), regVac.getCodRefuerzo()
                        , regVac.getCentroVacunacion(),regVac.getFechaHoraColoc(),regVac.getDosis().getMarca(),regVac.getNumSerieDosis()});
        });
    }

    private void actT() {
        modelo.setNumRows(0);
        llenarTabla();
        ac.setAct(false);
    }
}
