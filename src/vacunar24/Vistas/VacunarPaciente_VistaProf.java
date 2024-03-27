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
import vacunar24.Entidades.CitaVacunacion;

/**
 *
 * @author Jose
 */
public class VacunarPaciente_VistaProf extends javax.swing.JInternalFrame {

    private CitaVacunacion cv;
    private CitaVacData cvd;
    private ArrayList<CitaVacunacion> listaCitaV;
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int row, int colum) {
            return false;
        }
    };
    private Frame f = JOptionPane.getFrameForComponent(this);
    private VacunarPaciente vp = new VacunarPaciente(f, true);

    public VacunarPaciente_VistaProf() {
        
        cv = new CitaVacunacion();
        cvd = new CitaVacData();
        listaCitaV = new ArrayList();
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
        jTCitas = new javax.swing.JTable();
        jTBuscador = new javax.swing.JTextField();
        VacunarReg = new javax.swing.JButton();
        jBNuevoPaciente = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("CITAS DE VACUNACION DEL DÍA:");

        jTCitas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTCitas);

        jTBuscador.setText("Buscar...");
        jTBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBuscadorKeyReleased(evt);
            }
        });

        VacunarReg.setText("Vacunar Paciente");
        VacunarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VacunarRegActionPerformed(evt);
            }
        });

        jBNuevoPaciente.setText("Paciente sin Turno");

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
                .addComponent(VacunarReg, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jBNuevoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(VacunarReg)
                    .addComponent(jBNuevoPaciente))
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
        if (vp.isAct()) {
            actT();
        }
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jTBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscadorKeyReleased
        borrarFilas();
        for (CitaVacunacion cv : listaCitaV) {
            if (cv.getPersona().getNombre().toLowerCase().startsWith(jTBuscador.getText().toLowerCase()) || cv.getPersona().getApellido().toLowerCase().startsWith(jTBuscador.getText().toLowerCase())
                    || String.valueOf(cv.getPersona().getDni()).equals(jTBuscador.getText()) || 
                    String.valueOf(cv.getIdCitaVacunacion()).equals(jTBuscador.getText())){
                modelo.addRow(new Object[]{cv.getIdCitaVacunacion(), cv.getPersona().getDni(), cv.getCodRefuerzo()
                        , cv.getFechaHoraCita(), cv.getCentroVacunacion(),cv.getDosis().getMarca()});            }
        }
    }//GEN-LAST:event_jTBuscadorKeyReleased

    private void VacunarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VacunarRegActionPerformed
        if (jTCitas.getSelectedRow() >= 0) {
            cv = new CitaVacunacion();
            cv = cvd.buscarCitaId((int) jTCitas.getValueAt(jTCitas.getSelectedRow(), 0));
            vp.getjTCiud().setText(cv.getPersona().getNombre()+" "+cv.getPersona().getApellido());
            vp.getjTDni().setText(cv.getPersona().getDni()+"");
            vp.getjTCentroVac().setText(cv.getCentroVacunacion());
            vp.getjTCod().setText(cv.getCodRefuerzo()+"");
            vp.getjTVac().setText(cv.getDosis().getMarca());
            vp.setIdMod(cv.getIdCitaVacunacion());
            vp.show();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un ciudadano en la tabla...");
        }
    }//GEN-LAST:event_VacunarRegActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VacunarReg;
    private javax.swing.JButton jBNuevoPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTBuscador;
    private javax.swing.JTable jTCitas;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
         filaCabecera.add("Codigo");
        filaCabecera.add("Dni Ciudadano");
        filaCabecera.add("Codigo refuerzo");
        filaCabecera.add("FechaHoraTurno");
        filaCabecera.add("Centro Vacunatorio");
        filaCabecera.add("Dosis");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jTCitas.setModel(modelo);
    }

    private void llenarTabla() {
        listaCitaV = cvd.listarCitasHoy();
        listaCitaV.stream().forEach(cv -> {
            modelo.addRow(new Object[]{cv.getIdCitaVacunacion(), cv.getPersona().getDni(), cv.getCodRefuerzo()
                        , cv.getFechaHoraCita(), cv.getCentroVacunacion(),cv.getDosis().getMarca()});
        });
    }
    private void borrarFilas(){
        int i = jTCitas.getRowCount()-1;
        for(;i>=0;i--){
            modelo.removeRow(i);
        }
    }
    private void actT() {
        borrarFilas();
        llenarTabla();
        vp.setAct(false);
    }
}
