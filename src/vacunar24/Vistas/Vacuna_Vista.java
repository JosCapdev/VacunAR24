/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunar24.Vistas;

import java.awt.Frame;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vacunar24.Dao.VacunaData;
import vacunar24.Entidades.Vacuna;

/**
 *
 * @author Jose
 */
public class Vacuna_Vista extends javax.swing.JInternalFrame {

    private Vacuna vac;
    private VacunaData vacD;
    private ArrayList<Vacuna> listaVac;
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int row, int colum) {
            return false;
        }
    };
    private Frame f = JOptionPane.getFrameForComponent(this);
    private AgregarVacuna av = new AgregarVacuna(f, true);

    public Vacuna_Vista() {
        vac = new Vacuna();
        vacD = new VacunaData();
        listaVac = new ArrayList();
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
        jTVac = new javax.swing.JTable();
        jBAgregar = new javax.swing.JButton();
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
        jLabel1.setText("REGISTRO Y CONTROL DE VACUNAS:");

        jTVac.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTVac);

        jBAgregar.setText("Agregar vacuna");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBMod.setText("Modificar");
        jBMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModActionPerformed(evt);
            }
        });

        jBElim.setText("Eliminar");
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
                .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBMod)
                .addGap(45, 45, 45)
                .addComponent(jBElim)
                .addGap(15, 15, 15))
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
                    .addComponent(jBAgregar)
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

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        av.show();
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModActionPerformed
        if (jTVac.getSelectedRow() >= 0) {
            vac = vacD.buscarVacunaId((int) jTVac.getValueAt(jTVac.getSelectedRow(), 0));
            av.getjTMarca().setText(vac.getMarca());
            av.getjTMedida().setText(vac.getMedida() + "");
            av.getjDCFecha().setDate(Date.valueOf(vac.getFechaVto()));
            av.getjSCant().setValue(vac.getCantidad());
            av.setIdMod(vac.getIdVacuna());
            av.setMod(true);
            av.show();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una vacuna en la tabla...");
        }
    }//GEN-LAST:event_jBModActionPerformed

    private void jBElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBElimActionPerformed
        if (jTVac.getSelectedRow() >= 0) {
            vacD.eliminarVacuna((int) jTVac.getValueAt(jTVac.getSelectedRow(), 0));
            actT();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una vacuna en la tabla...");
        }
    }//GEN-LAST:event_jBElimActionPerformed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        if (av.isAct()) {
            actT();
        }
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jTBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscadorKeyReleased
        modelo.setNumRows(0);
        for (Vacuna v : listaVac) {
            if (v.getMarca().toLowerCase().startsWith(jTBuscador.getText().toLowerCase())
                    || v.getIdVacuna() == Integer.parseInt(jTBuscador.getText())) {
                modelo.addRow(new Object[]{v.getIdVacuna(), v.getMarca(), v.getMedida(), v.getFechaVto()});
            }
        }
    }//GEN-LAST:event_jTBuscadorKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBElim;
    private javax.swing.JButton jBMod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTBuscador;
    private javax.swing.JTable jTVac;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Codigo");
        filaCabecera.add("Marca");
        filaCabecera.add("Medida");
        filaCabecera.add("Fecha de Vencimiento");
        filaCabecera.add("Cantidad");
        filaCabecera.add("Estado");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jTVac.setModel(modelo);
    }

    private void llenarTabla() {
        listaVac = vacD.listarVacunas();
        listaVac.stream().forEach(v -> {
            modelo.addRow(new Object[]{v.getIdVacuna(), v.getMarca(), v.getMedida(),
                v.getFechaVto(), v.getCantidad(), v.isEstado()});
        });
    }

    private void actT() {
        modelo.setNumRows(0);
        llenarTabla();
        av.setAct(false);
    }
}
