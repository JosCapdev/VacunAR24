/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunar24.Vistas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vacunar24.Dao.CitaVacData;
import vacunar24.Dao.CiudadanoData;
import vacunar24.Dao.VacunaData;
import vacunar24.Entidades.CitaVacunacion;
import vacunar24.Entidades.Ciudadano;
import vacunar24.Entidades.Vacuna;

/**
 *
 * @author Jose
 */
public class AgregarCita extends javax.swing.JDialog {

    private CitaVacunacion citaV;
    private CitaVacData citaVD;
    private Ciudadano c;
    private CiudadanoData cd;
    private VacunaData vacD;
    private ArrayList<Ciudadano> listaC;
    private ArrayList<CitaVacunacion> listaCitas;
    private ArrayList<Vacuna> listaVac;
    private boolean mod;
    private boolean act;
    private int idMod;
    private LocalDateTime f1;

    public AgregarCita(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        citaV = new CitaVacunacion();
        citaVD = new CitaVacData();
        c = new Ciudadano();
        cd = new CiudadanoData();
        vacD= new VacunaData();
        listaC = new ArrayList();
        listaCitas = new ArrayList();
        listaVac = new ArrayList();
        f1=null; 
        mod = false;
        act = false;
        idMod = 0;
        initComponents();
        llenarDatos();
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
        jBCrear = new javax.swing.JButton();
        jBReg = new javax.swing.JButton();
        jCBC = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLT.setForeground(new java.awt.Color(51, 51, 51));
        jLT.setText("CREAR TURNO DE VACUNACION");
        jPanel1.add(jLT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Ciudadanos Registrados:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jBCrear.setText("Crear");
        jBCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrearActionPerformed(evt);
            }
        });
        jPanel1.add(jBCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 200, -1));

        jBReg.setText("Registrar un nuevo Ciudadano");
        jBReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegActionPerformed(evt);
            }
        });
        jPanel1.add(jBReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 200, -1));

        jPanel1.add(jCBC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 340, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearActionPerformed
        try {
            Ciudadano ciud = (Ciudadano) jCBC.getSelectedItem();
            int cod = 1;
            int idUlt=citaVD.buscarUltCitaCiud(ciud.getIdCiudadano());
            CitaVacunacion cita= new CitaVacunacion();
            if(idUlt!=0){
                idUlt = citaVD.buscarUltCitaCiud(ciud.getIdCiudadano());
                cita = citaVD.buscarCitaId(idUlt);
                cod=cita.getCodRefuerzo()+1;
            }else{
                cita.setDosis(buscarVacMayorCant());
                cita.setPersona(cd.buscarCiudadanoId(ciud.getIdCiudadano()));
            }
            cita.setCodRefuerzo(cod);
            cita.setFechaHoraCita(fechaTurno().toString());
            cita.setCentroVacunacion("Centro de " + ciud.getLocalidad());
            citaVD.guardarCita(cita);
            act = true;
            JOptionPane.showMessageDialog(null, "Turno Creado para " + cita.getPersona().getNombre() + " "
                    + cita.getPersona().getApellido() + "\n" + "Dni: " + cita.getPersona().getDni() + " Dosis: " + cita.getCodRefuerzo());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Datos incompatibles");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Llenar Campos");
        }
    }//GEN-LAST:event_jBCrearActionPerformed

    private void jBRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBRegActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarCita dialog = new AgregarCita(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBCrear;
    private javax.swing.JButton jBReg;
    private javax.swing.JComboBox<Ciudadano> jCBC;
    private javax.swing.JLabel jLT;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public void llenarDatos() {
        listaC = cd.listarCiudadanos();
        for (Ciudadano item : listaC) {
            jCBC.addItem(item);
        }
    }

    public LocalDateTime fechaTurno() {
        citaV= citaVD.buscarCitaId(citaVD.buscarUltTurno());
        f1=citaV.getFechaHoraCita()!= null ? LocalDateTime.parse(citaV.getFechaHoraCita()): null;
        LocalDateTime fech = f1 != null ? f1 : LocalDateTime.of(LocalDate.now(), LocalTime.of(8, 30));
        if (fech.toLocalTime().isBefore(LocalTime.of(19, 30))
                && fech.toLocalTime().isAfter(LocalTime.of(8, 00))){
            fech=fech.plusMinutes(30);
        } else {
            fech=fech.plusDays(1);
            fech = LocalDateTime.of(fech.toLocalDate(), LocalTime.of(8, 30));
        }
        return fech;
    }

    public Vacuna buscarVacMayorCant(){
        listaVac = vacD.listarVacunas();
        Vacuna vacuna = new Vacuna();
        int cant=0;
        for (Vacuna vac : listaVac) {
            if(vac.getCantidad()> cant){
                cant= vac.getCantidad();
                vacuna=vac;
            }
        }
        return vacuna;
    }
    public boolean isAct() {
        return act;
    }

    public void setAct(boolean act) {
        this.act = act;
    }

}
