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
import vacunar24.Dao.CitaVacData;
import vacunar24.Dao.InsumoData;
import vacunar24.Entidades.CitaVacunacion;
import vacunar24.Entidades.Insumos;

/**
 *
 * @author Jose
 */
public class Insumos_VistaProf extends javax.swing.JInternalFrame {

    private Insumos ins;
    private InsumoData insD;
    private ArrayList<Insumos> listaInsumos;
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int row, int colum) {
            return false;
        }
    };
    private Frame f = JOptionPane.getFrameForComponent(this);
    private AgregarInsumo insV = new AgregarInsumo(f, true);

    public Insumos_VistaProf() {
        
        ins = new Insumos();
        insD = new InsumoData();
        listaInsumos = new ArrayList();
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
        jTInsumos = new javax.swing.JTable();
        jTBuscador = new javax.swing.JTextField();
        AgendarInsumo = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("REGISTRO Y CONTROL DE INSUMOS: ");

        jTInsumos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTInsumos);

        jTBuscador.setText("Buscar...");
        jTBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBuscadorKeyReleased(evt);
            }
        });

        AgendarInsumo.setText("Agendar  nuevo insumo");
        AgendarInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendarInsumoActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 538, Short.MAX_VALUE)
                        .addComponent(jTBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(AgendarInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
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
                    .addComponent(AgendarInsumo)
                    .addComponent(jBEliminar))
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

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        if (insV.isAct()) {
            actT();
        }
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jTBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscadorKeyReleased
        borrarFilas();
        for (Insumos ins : listaInsumos) {
            if (ins.getOtros().toLowerCase().startsWith(jTBuscador.getText().toLowerCase()) || ins.getVac().getMarca().toLowerCase().startsWith(jTBuscador.getText().toLowerCase())
                    || String.valueOf(ins.getIdInsumo()).equals(jTBuscador.getText())){
                String vacuna = ins.getVac()!=null? ins.getVac().getMarca():"--";
                modelo.addRow(new Object[]{ins.getIdInsumo(),vacuna, ins.getOtros(),ins.getCentroVacunacion()
                        ,ins.getAlcohol(),ins.getFech(),ins.isEnviado()?"Recibido":"--"});            }
        }
    }//GEN-LAST:event_jTBuscadorKeyReleased

    private void AgendarInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendarInsumoActionPerformed
        insV.show();
    }//GEN-LAST:event_AgendarInsumoActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        if (jTInsumos.getSelectedRow() >= 0) {
            insD.eliminarInsumo((int) jTInsumos.getValueAt(jTInsumos.getSelectedRow(), 0));
            actT();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un Insumo en la tabla...");
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgendarInsumo;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTBuscador;
    private javax.swing.JTable jTInsumos;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Codigo");
        filaCabecera.add("Vacuna");
        filaCabecera.add("Otros");
        filaCabecera.add("Centro Vacunación");
        filaCabecera.add("Alcohol");
        filaCabecera.add("Fecha");
        filaCabecera.add("Envío");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jTInsumos.setModel(modelo);
    }

    private void llenarTabla() {
        listaInsumos = insD.listarInsumos();
        listaInsumos.forEach(ins -> {
            String vacuna = ins.getVac()!=null? ins.getVac().getMarca():"--";
            modelo.addRow(new Object[]{ins.getIdInsumo(),vacuna, ins.getOtros(),ins.getCentroVacunacion()
                        ,ins.getAlcohol(),ins.getFech(),ins.isEnviado()?"Recibido":"--"});
        });
    }
    private void borrarFilas(){
        int i = jTInsumos.getRowCount()-1;
        for(;i>=0;i--){
            modelo.removeRow(i);
        }
    }
    private void actT() {
        borrarFilas();
        llenarTabla();
        insV.setAct(false);
    }
}
