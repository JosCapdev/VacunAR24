/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunar24.Vistas;

import java.awt.Frame;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vacunar24.Dao.RegVacData;
import vacunar24.Entidades.RegistroVacunados;

/**
 *
 * @author Jose
 */
public class RegistroVacunacion_Vista extends javax.swing.JInternalFrame {

    private RegistroVacunados regVac;
    private RegVacData regVacD;
    private ArrayList<RegistroVacunados> listaRegistro; 
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int row, int colum) {
            return false;
        }
    };
    private Frame f = JOptionPane.getFrameForComponent(this);
    private AgregarRegistro ar = new AgregarRegistro(f, true);

    public RegistroVacunacion_Vista() {
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
        jBMod = new javax.swing.JButton();
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

        jBMod.setText("Modificar Registro");
        jBMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModActionPerformed(evt);
            }
        });

        jBElim.setText("Eliminar Registro");
        jBElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBElimActionPerformed(evt);
            }
        });

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBMod, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBMod)
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

    private void jBModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModActionPerformed
        if (jTReg.getSelectedRow() >= 0) {
            regVac = new RegistroVacunados();
            regVac = regVacD.buscarRegId((int) jTReg.getValueAt(jTReg.getSelectedRow(), 0));
            ar.getjTCiud().setText(regVac.getPersona().getIdCiudadano()+"");
            ar.getjTCod().setText(regVac.getCodRefuerzo()+"");
            ar.getjTCentroVac().setText(regVac.getCentroVacunacion());
            ar.getjTVac().setText(regVac.getDosis().getIdVacuna()+"");
            ar.getjTNSerie().setText(regVac.getNumSerieDosis()+"");
            ar.getjTProf().setText(regVac.getProf().getIdProfesional()+"");
            ar.getjDCFecha().setDate(Date.valueOf(regVac.getFechaHoraColoc()));
            ar.setIdMod(regVac.getIdRegistroVacunados());
            ar.show();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un registro en la tabla...");
        }
    }//GEN-LAST:event_jBModActionPerformed

    private void jBElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBElimActionPerformed
        if (jTReg.getSelectedRow() >= 0) {
            regVacD.eliminarCita((int) jTReg.getValueAt(jTReg.getSelectedRow(), 0));
            actT();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un registro de la tabla...");
        }
    }//GEN-LAST:event_jBElimActionPerformed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        if (ar.isAct()) {
            actT();
        }
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jTBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscadorKeyReleased
        borrarFilas();
        for (RegistroVacunados regVac : listaRegistro) {
            if (regVac.getPersona().getNombre().toLowerCase().startsWith(jTBuscador.getText().toLowerCase()) || regVac.getPersona().getApellido().toLowerCase().startsWith(jTBuscador.getText().toLowerCase())
                    || String.valueOf(regVac.getPersona().getDni()).equals(jTBuscador.getText()) || 
                    String.valueOf(regVac.getIdRegistroVacunados()).equals(jTBuscador.getText())){
                modelo.addRow(new Object[]{regVac.getIdRegistroVacunados(), regVac.getPersona().getIdCiudadano(), regVac.getCodRefuerzo()
                        , regVac.getCentroVacunacion(),regVac.getFechaHoraColoc(),regVac.getDosis().getMarca(),regVac.getNumSerieDosis()});
            }
        }
    }//GEN-LAST:event_jTBuscadorKeyReleased

    private void jTBuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBuscadorMouseClicked
        jTBuscador.setText("");
    }//GEN-LAST:event_jTBuscadorMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBElim;
    private javax.swing.JButton jBMod;
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
        Collections.sort(listaRegistro,(RegistroVacunados a, RegistroVacunados b)-> LocalDateTime.parse(a.getFechaHoraColoc()).compareTo(LocalDateTime.parse(b.getFechaHoraColoc())));
        listaRegistro.forEach(regVac -> {
            modelo.addRow(new Object[]{regVac.getIdRegistroVacunados(), regVac.getPersona().getIdCiudadano(), regVac.getCodRefuerzo()
                        , regVac.getCentroVacunacion(),regVac.getFechaHoraColoc(),regVac.getDosis().getMarca(),regVac.getNumSerieDosis()});
        });
    }
    private void borrarFilas(){
        int i = jTReg.getRowCount()-1;
        for(;i>=0;i--){
            modelo.removeRow(i);
        }
    }
    private void actT() {
        borrarFilas();
        llenarTabla();
        ar.setAct(false);
    }
}
