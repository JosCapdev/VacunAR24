/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunar24.Vistas;

/**
 *
 * @author Jose
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        backgroundPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLTurno = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLCiudadano = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLProfesional = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLVacuna = new javax.swing.JLabel();
        jPFondoCel = new javax.swing.JPanel();
        Escritorio = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(90, 48));
        setPreferredSize(new java.awt.Dimension(855, 530));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setForeground(new java.awt.Color(0, 0, 0));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(900, 450));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 153, 255)));
        jPanel1.setForeground(new java.awt.Color(51, 153, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vacunar24/Imagenes/vacunar24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        backgroundPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 255)));

        jLTurno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLTurno.setForeground(new java.awt.Color(51, 153, 255));
        jLTurno.setText("Turnos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLTurno)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLTurno)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        backgroundPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 110, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 153, 255)));

        jLCiudadano.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLCiudadano.setForeground(new java.awt.Color(51, 153, 255));
        jLCiudadano.setText("Ciudadanos");
        jLCiudadano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCiudadanoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLCiudadano)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLCiudadano)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        backgroundPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 130, 70));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 153, 255)));

        jLProfesional.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLProfesional.setForeground(new java.awt.Color(51, 153, 255));
        jLProfesional.setText("Profesional");
        jLProfesional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLProfesionalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLProfesional)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLProfesional)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        backgroundPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 110, 70));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 153, 255)));

        jLVacuna.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLVacuna.setForeground(new java.awt.Color(51, 153, 255));
        jLVacuna.setText("Vacuna");
        jLVacuna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLVacunaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLVacuna)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLVacuna)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        backgroundPanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 120, 70));

        jPFondoCel.setBackground(new java.awt.Color(51, 153, 255));
        jPFondoCel.setPreferredSize(new java.awt.Dimension(667, 320));

        Escritorio.setBackground(new java.awt.Color(255, 255, 255));
        Escritorio.setPreferredSize(new java.awt.Dimension(894, 500));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPFondoCelLayout = new javax.swing.GroupLayout(jPFondoCel);
        jPFondoCel.setLayout(jPFondoCelLayout);
        jPFondoCelLayout.setHorizontalGroup(
            jPFondoCelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFondoCelLayout.createSequentialGroup()
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPFondoCelLayout.setVerticalGroup(
            jPFondoCelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFondoCelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        backgroundPanel.add(jPFondoCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 850, 420));

        getContentPane().add(backgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 840, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLCiudadanoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCiudadanoMouseClicked
        Escritorio.removeAll();
        Escritorio.repaint();
        Ciudadano_Vista cv = new Ciudadano_Vista();
        Escritorio.add(cv);
        cv.setVisible(true);
        cv.moveToFront();
    }//GEN-LAST:event_jLCiudadanoMouseClicked

    private void jLVacunaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLVacunaMouseClicked
        Escritorio.removeAll();
        Escritorio.repaint();
        Vacuna_Vista vac = new Vacuna_Vista();
        Escritorio.add(vac);
        vac.setVisible(true);
    }//GEN-LAST:event_jLVacunaMouseClicked

    private void jLProfesionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLProfesionalMouseClicked
        Escritorio.removeAll();
        Escritorio.repaint();
        Profesional_Vista prof = new Profesional_Vista();
        Escritorio.add(prof);
        prof.setVisible(true);
    }//GEN-LAST:event_jLProfesionalMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Escritorio;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel jLCiudadano;
    private javax.swing.JLabel jLProfesional;
    private javax.swing.JLabel jLTurno;
    private javax.swing.JLabel jLVacuna;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPFondoCel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
