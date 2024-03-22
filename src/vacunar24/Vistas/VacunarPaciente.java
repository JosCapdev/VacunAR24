/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunar24.Vistas;

import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import vacunar24.Dao.CitaVacData;
import vacunar24.Dao.CiudadanoData;
import vacunar24.Dao.ProfesionalData;
import vacunar24.Dao.RegVacData;
import vacunar24.Dao.VacunaData;
import vacunar24.Entidades.CitaVacunacion;
import vacunar24.Entidades.RegistroVacunados;

/**
 *
 * @author Jose
 */
public class VacunarPaciente extends javax.swing.JDialog {

    private RegistroVacunados reg;
    private RegVacData rvd;
    private CitaVacData citaD;
    private CitaVacunacion cita;
    private ProfesionalData profD;
    private CiudadanoData cd;
    private VacunaData vd;
    private boolean act;
    private int idMod;
    private int idProf;

    ;

    public VacunarPaciente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        reg = new RegistroVacunados();
        rvd = new RegVacData();
        cita = new CitaVacunacion();
        citaD = new CitaVacData();
        cd = new CiudadanoData();
        act = false;
        idMod=0;
        idProf=0;
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLT = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTDni = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jBGuardar = new javax.swing.JButton();
        jTCiud = new javax.swing.JTextField();
        jTCod = new javax.swing.JTextField();
        jTNSerie = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTVac = new javax.swing.JTextField();
        jTCentroVac = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLT.setForeground(new java.awt.Color(51, 51, 51));
        jLT.setText("DATOS DEL PACIENTE:");
        jPanel1.add(jLT, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 14, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombre y Apellido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Codigo Refuerzo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Centro de Vacunacion");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Dni:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        jTDni.setEnabled(false);
        jPanel1.add(jTDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 160, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("N°SerieVacuna:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        jBGuardar.setText("Confirmar Datos");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 160, -1));

        jTCiud.setEnabled(false);
        jPanel1.add(jTCiud, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 160, -1));

        jTCod.setEnabled(false);
        jPanel1.add(jTCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 160, -1));
        jPanel1.add(jTNSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 160, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Vacuna:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        jPanel1.add(jTVac, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 160, -1));

        jTCentroVac.setEnabled(false);
        jPanel1.add(jTCentroVac, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try {
                cita=citaD.buscarCitaId(idMod);
                reg.setPersona(cita.getPersona());
                reg.setCodRefuerzo(cita.getCodRefuerzo());
                reg.setCentroVacunacion(cita.getCentroVacunacion());
                reg.setFechaHoraColoc(LocalDateTime.now().toString());
                reg.setDosis(cita.getDosis());
                reg.setNumSerieDosis(Integer.parseInt(jTNSerie.getText()));
                reg.setProf(profD.buscarProfesionalId(idProf));
                rvd.guardarRegVac(reg);
                act = true;
                JOptionPane.showMessageDialog(null, "Vacuna Colocada a " + reg.getPersona().getNombre() + " "
                    + reg.getPersona().getApellido() + "\n" + "Dni: " + reg.getPersona().getDni() + " Dosis: " + reg.getCodRefuerzo());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Datos incompatible");
            limpiarCampos();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Completar datos");
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VacunarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VacunarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VacunarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VacunarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VacunarPaciente dialog = new VacunarPaciente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JLabel jLT;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTCentroVac;
    private javax.swing.JTextField jTCiud;
    private javax.swing.JTextField jTCod;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTNSerie;
    private javax.swing.JTextField jTVac;
    // End of variables declaration//GEN-END:variables

    public void limpiarCampos() {

        jTCiud.setText("");
        jTCod.setText("");
        jTNSerie.setText("");
        jTVac.setText("");
        jTDni.setText("");
        reg = null;

    }
    
    public boolean isAct() {
        return act;
    }

    public void setAct(boolean act) {
        this.act = act;
    }

    public int getIdMod() {
        return idMod;
    }

    public void setIdMod(int idMod) {
        this.idMod = idMod;
    }

    public javax.swing.JTextField getjTCentroVac() {
        return jTDni;
    }

    public void setjTCentroVac(javax.swing.JTextField jTCentroVac) {
        this.jTDni = jTCentroVac;
    }

    public javax.swing.JTextField getjTCiud() {
        return jTCiud;
    }

    public void setjTCiud(javax.swing.JTextField jTCiud) {
        this.jTCiud = jTCiud;
    }

    public javax.swing.JTextField getjTCod() {
        return jTCod;
    }

    public void setjTCod(javax.swing.JTextField jTCod) {
        this.jTCod = jTCod;
    }

    public javax.swing.JTextField getjTNSerie() {
        return jTNSerie;
    }

    public void setjTNSerie(javax.swing.JTextField jTNSerie) {
        this.jTNSerie = jTNSerie;
    }

    public javax.swing.JTextField getjTVac() {
        return jTVac;
    }

    public void setjTVac(javax.swing.JTextField jTVac) {
        this.jTVac = jTVac;
    }

    public javax.swing.JTextField getjTDni() {
        return jTDni;
    }

    public void setjTDni(javax.swing.JTextField jTDni) {
        this.jTDni = jTDni;
    }
    
}
