/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunar24.Vistas;

import javax.swing.JOptionPane;
import vacunar24.Dao.LaboratorioData;
import vacunar24.Entidades.Laboratorio;

/**
 *
 * @author Jose
 */
public class AgregarLaboratorio extends javax.swing.JDialog {

    private Laboratorio lab;
    private LaboratorioData labD;
    private boolean mod;
    private boolean act;
    private int idMod;

    public AgregarLaboratorio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        lab = new Laboratorio();
        labD = new LaboratorioData();
        mod = false;
        act = false;
        idMod=0;
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
        jTCuit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTNomL = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTPais = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBGuardar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jTDomC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLT.setForeground(new java.awt.Color(51, 51, 51));
        jLT.setText("DATOS DEL LABORATORIO");
        jPanel1.add(jLT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));
        jPanel1.add(jTCuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 140, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Cuit:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
        jPanel1.add(jTNomL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 140, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nombre Laboratorio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        jPanel1.add(jTPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 140, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("País:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Dominio Comercial:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 160, -1));

        jBLimpiar.setText("Limpiar Campos");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jBLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));
        jPanel1.add(jTDomC, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 140, -1));

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

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try {
            long cuit = Long.parseLong(jTCuit.getText());
            String nomL = jTNomL.getText();
            String pais = jTPais.getText();
            String domC = jTDomC.getText();
            lab = new Laboratorio(cuit,nomL,pais,domC,true);
            if (mod) {
                lab = new Laboratorio(idMod,cuit,nomL,pais,domC,true);
                labD.modificarLaboratorio(lab);
                mod = false;
                act = true;
                dispose();
            } else {
                labD.guardarLaboratorio(lab);
                act = true;
            }
            limpiarCampos();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Datos incompatible");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Completar datos");
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jBLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarLaboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarLaboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarLaboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarLaboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                AgregarLaboratorio dialog = new AgregarLaboratorio(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JLabel jLT;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTCuit;
    private javax.swing.JTextField jTDomC;
    private javax.swing.JTextField jTNomL;
    private javax.swing.JTextField jTPais;
    // End of variables declaration//GEN-END:variables

    public void limpiarCampos() {

        jTCuit.setText("");
        jTNomL.setText("");
        jTPais.setText("");
        jTDomC.setText("");
        lab = null;

    }

    public boolean isMod() {
        return mod;
    }

    public void setMod(boolean mod) {
        this.mod = mod;
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

    public javax.swing.JTextField getjTCuit() {
        return jTCuit;
    }

    public void setjTCuit(javax.swing.JTextField jTCuit) {
        this.jTCuit = jTCuit;
    }

    public javax.swing.JTextField getjTDomC() {
        return jTDomC;
    }

    public void setjTDomC(javax.swing.JTextField jTDomC) {
        this.jTDomC = jTDomC;
    }

    public javax.swing.JTextField getjTNomL() {
        return jTNomL;
    }

    public void setjTNomL(javax.swing.JTextField jTNomL) {
        this.jTNomL = jTNomL;
    }

    public javax.swing.JTextField getjTPais() {
        return jTPais;
    }

    public void setjTPais(javax.swing.JTextField jTPais) {
        this.jTPais = jTPais;
    }


}
