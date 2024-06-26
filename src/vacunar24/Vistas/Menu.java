/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunar24.Vistas;

import java.awt.Color;

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
        Escritorio.removeAll();
        Escritorio.repaint();
        Home_Vista homeV = new Home_Vista();
        Escritorio.add(homeV);
        homeV.setVisible(true);
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

        backgroundPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanelTurno = new javax.swing.JPanel();
        jLTurno = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelCiudadano = new javax.swing.JPanel();
        jLCiudadano = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelProfesional = new javax.swing.JPanel();
        jLProfesional = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanelVacuna = new javax.swing.JPanel();
        jLVacuna = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPFondoCel = new javax.swing.JPanel();
        Escritorio = new javax.swing.JPanel();
        jPanelLaboratorio = new javax.swing.JPanel();
        jLLaboratorio = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanelHome = new javax.swing.JPanel();
        jLHome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPRegistro = new javax.swing.JPanel();
        jLRegistro = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(90, 48));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundPanel.setBackground(new java.awt.Color(0, 51, 102));
        backgroundPanel.setForeground(new java.awt.Color(0, 0, 0));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(1250, 450));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 153, 255)));
        jPanel1.setForeground(new java.awt.Color(51, 153, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vacunar24/Imagenes/vacunar24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        backgroundPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 70));

        jPanelTurno.setBackground(new java.awt.Color(0, 51, 102));
        jPanelTurno.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 255)));
        jPanelTurno.setForeground(new java.awt.Color(153, 153, 153));

        jLTurno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLTurno.setForeground(new java.awt.Color(153, 153, 153));
        jLTurno.setText("Turnos");
        jLTurno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLTurnoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLTurnoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLTurnoMouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vacunar24/Imagenes/calendar-multiple-check.png"))); // NOI18N

        javax.swing.GroupLayout jPanelTurnoLayout = new javax.swing.GroupLayout(jPanelTurno);
        jPanelTurno.setLayout(jPanelTurnoLayout);
        jPanelTurnoLayout.setHorizontalGroup(
            jPanelTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTurnoLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLTurno)
                .addGap(16, 16, 16))
        );
        jPanelTurnoLayout.setVerticalGroup(
            jPanelTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTurnoLayout.createSequentialGroup()
                .addGroup(jPanelTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelTurnoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTurnoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLTurno)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        backgroundPanel.add(jPanelTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 130, -1));

        jPanelCiudadano.setBackground(new java.awt.Color(0, 51, 102));
        jPanelCiudadano.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 153, 255)));

        jLCiudadano.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLCiudadano.setForeground(new java.awt.Color(153, 153, 153));
        jLCiudadano.setText("Ciudadanos");
        jLCiudadano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCiudadanoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLCiudadanoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLCiudadanoMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vacunar24/Imagenes/account-multiple.png"))); // NOI18N

        javax.swing.GroupLayout jPanelCiudadanoLayout = new javax.swing.GroupLayout(jPanelCiudadano);
        jPanelCiudadano.setLayout(jPanelCiudadanoLayout);
        jPanelCiudadanoLayout.setHorizontalGroup(
            jPanelCiudadanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCiudadanoLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLCiudadano)
                .addContainerGap())
        );
        jPanelCiudadanoLayout.setVerticalGroup(
            jPanelCiudadanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCiudadanoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelCiudadanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLCiudadano))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        backgroundPanel.add(jPanelCiudadano, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 150, 70));

        jPanelProfesional.setBackground(new java.awt.Color(0, 51, 102));
        jPanelProfesional.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 153, 255)));

        jLProfesional.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLProfesional.setForeground(new java.awt.Color(153, 153, 153));
        jLProfesional.setText("Profesional");
        jLProfesional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLProfesionalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLProfesionalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLProfesionalMouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vacunar24/Imagenes/enfermero_user.png"))); // NOI18N

        javax.swing.GroupLayout jPanelProfesionalLayout = new javax.swing.GroupLayout(jPanelProfesional);
        jPanelProfesional.setLayout(jPanelProfesionalLayout);
        jPanelProfesionalLayout.setHorizontalGroup(
            jPanelProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProfesionalLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLProfesional)
                .addContainerGap())
        );
        jPanelProfesionalLayout.setVerticalGroup(
            jPanelProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfesionalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        backgroundPanel.add(jPanelProfesional, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 140, 70));

        jPanelVacuna.setBackground(new java.awt.Color(0, 51, 102));
        jPanelVacuna.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 153, 255)));

        jLVacuna.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLVacuna.setForeground(new java.awt.Color(153, 153, 153));
        jLVacuna.setText("Vacuna");
        jLVacuna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLVacunaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLVacunaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLVacunaMouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vacunar24/Imagenes/injection.png"))); // NOI18N

        javax.swing.GroupLayout jPanelVacunaLayout = new javax.swing.GroupLayout(jPanelVacuna);
        jPanelVacuna.setLayout(jPanelVacunaLayout);
        jPanelVacunaLayout.setHorizontalGroup(
            jPanelVacunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVacunaLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLVacuna)
                .addGap(14, 14, 14))
        );
        jPanelVacunaLayout.setVerticalGroup(
            jPanelVacunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVacunaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelVacunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLVacuna))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        backgroundPanel.add(jPanelVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, 120, 70));

        jPFondoCel.setBackground(new java.awt.Color(0, 51, 102));
        jPFondoCel.setPreferredSize(new java.awt.Dimension(667, 320));

        Escritorio.setBackground(new java.awt.Color(153, 153, 153));
        Escritorio.setPreferredSize(new java.awt.Dimension(1024, 550));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1304, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPFondoCelLayout = new javax.swing.GroupLayout(jPFondoCel);
        jPFondoCel.setLayout(jPFondoCelLayout);
        jPFondoCelLayout.setHorizontalGroup(
            jPFondoCelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFondoCelLayout.createSequentialGroup()
                .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1304, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPFondoCelLayout.setVerticalGroup(
            jPFondoCelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFondoCelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        backgroundPanel.add(jPFondoCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1310, 670));

        jPanelLaboratorio.setBackground(new java.awt.Color(0, 51, 102));
        jPanelLaboratorio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 153, 255)));

        jLLaboratorio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLLaboratorio.setForeground(new java.awt.Color(153, 153, 153));
        jLLaboratorio.setText("Laboratorios");
        jLLaboratorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLLaboratorioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLLaboratorioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLLaboratorioMouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vacunar24/Imagenes/laboratorio.png"))); // NOI18N

        javax.swing.GroupLayout jPanelLaboratorioLayout = new javax.swing.GroupLayout(jPanelLaboratorio);
        jPanelLaboratorio.setLayout(jPanelLaboratorioLayout);
        jPanelLaboratorioLayout.setHorizontalGroup(
            jPanelLaboratorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLaboratorioLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLLaboratorio)
                .addContainerGap())
        );
        jPanelLaboratorioLayout.setVerticalGroup(
            jPanelLaboratorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLaboratorioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelLaboratorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        backgroundPanel.add(jPanelLaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, 140, 70));

        jPanelHome.setBackground(new java.awt.Color(0, 51, 102));
        jPanelHome.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 255)));
        jPanelHome.setForeground(new java.awt.Color(153, 153, 153));

        jLHome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLHome.setForeground(new java.awt.Color(153, 153, 153));
        jLHome.setText("Inicio");
        jLHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLHomeMouseExited(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vacunar24/Imagenes/home-outline.png"))); // NOI18N

        javax.swing.GroupLayout jPanelHomeLayout = new javax.swing.GroupLayout(jPanelHome);
        jPanelHome.setLayout(jPanelHomeLayout);
        jPanelHomeLayout.setHorizontalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHomeLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLHome)
                .addGap(16, 16, 16))
        );
        jPanelHomeLayout.setVerticalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLHome))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        backgroundPanel.add(jPanelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 130, -1));

        jPRegistro.setBackground(new java.awt.Color(0, 51, 102));
        jPRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 255)));

        jLRegistro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLRegistro.setForeground(new java.awt.Color(153, 153, 153));
        jLRegistro.setText("Registro");
        jLRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLRegistroMouseExited(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vacunar24/Imagenes/clipboard-8-24.png"))); // NOI18N

        javax.swing.GroupLayout jPRegistroLayout = new javax.swing.GroupLayout(jPRegistro);
        jPRegistro.setLayout(jPRegistroLayout);
        jPRegistroLayout.setHorizontalGroup(
            jPRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegistroLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLRegistro)
                .addGap(10, 10, 10))
        );
        jPRegistroLayout.setVerticalGroup(
            jPRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistroLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLRegistro))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        backgroundPanel.add(jPRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 130, 70));

        getContentPane().add(backgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1300, 720));

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

    private void jLLaboratorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLLaboratorioMouseClicked
        Escritorio.removeAll();
        Escritorio.repaint();
        Laboratorio_Vista lab = new Laboratorio_Vista();
        Escritorio.add(lab);
        lab.setVisible(true);
    }//GEN-LAST:event_jLLaboratorioMouseClicked

    private void jLTurnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLTurnoMouseClicked
        Escritorio.removeAll();
        Escritorio.repaint();
        CitaVac_Vista citaV = new CitaVac_Vista();
        Escritorio.add(citaV);
        citaV.setVisible(true);
    }//GEN-LAST:event_jLTurnoMouseClicked

    private void jLTurnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLTurnoMouseEntered
        jPanelTurno.setBackground(new Color(51, 153, 255));
        jLTurno.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLTurnoMouseEntered

    private void jLTurnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLTurnoMouseExited
        jPanelTurno.setBackground(new Color(0,51, 102));
        jLTurno.setForeground(new Color(153, 153, 153));

    }//GEN-LAST:event_jLTurnoMouseExited

    private void jLCiudadanoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCiudadanoMouseEntered
        jPanelCiudadano.setBackground(new Color(51, 153, 255));
        jLCiudadano.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLCiudadanoMouseEntered

    private void jLCiudadanoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCiudadanoMouseExited
        jPanelCiudadano.setBackground(new Color(0,51, 102));
        jLCiudadano.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_jLCiudadanoMouseExited

    private void jLProfesionalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLProfesionalMouseEntered
        jPanelProfesional.setBackground(new Color(51, 153, 255));
        jLProfesional.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLProfesionalMouseEntered

    private void jLProfesionalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLProfesionalMouseExited
        jPanelProfesional.setBackground(new Color(0,51, 102));
        jLProfesional.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_jLProfesionalMouseExited

    private void jLVacunaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLVacunaMouseEntered
        jPanelVacuna.setBackground(new Color(51, 153, 255));
        jLVacuna.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLVacunaMouseEntered

    private void jLVacunaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLVacunaMouseExited
        jPanelVacuna.setBackground(new Color(0,51, 102));
        jLVacuna.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_jLVacunaMouseExited

    private void jLLaboratorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLLaboratorioMouseEntered
        jPanelLaboratorio.setBackground(new Color(51, 153, 255));
        jLLaboratorio.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLLaboratorioMouseEntered

    private void jLLaboratorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLLaboratorioMouseExited
        jPanelLaboratorio.setBackground(new Color(0,51, 102));
        jLLaboratorio.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_jLLaboratorioMouseExited

    private void jLHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLHomeMouseClicked
        Escritorio.removeAll();
        Escritorio.repaint();
        Home_Vista homeV = new Home_Vista();
        Escritorio.add(homeV);
        homeV.setVisible(true);
    }//GEN-LAST:event_jLHomeMouseClicked

    private void jLHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLHomeMouseEntered
        jPanelHome.setBackground(new Color(51, 153, 255));
        jLHome.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLHomeMouseEntered

    private void jLHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLHomeMouseExited
        jPanelHome.setBackground(new Color(0,51, 102));
        jLHome.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_jLHomeMouseExited

    private void jLRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLRegistroMouseClicked
        Escritorio.removeAll();
        Escritorio.repaint();
        RegistroVacunacion_Vista regV = new RegistroVacunacion_Vista();
        Escritorio.add(regV);
        regV.setVisible(true);
    }//GEN-LAST:event_jLRegistroMouseClicked

    private void jLRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLRegistroMouseEntered
        jPRegistro.setBackground(new Color(51, 153, 255));
        jLRegistro.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLRegistroMouseEntered

    private void jLRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLRegistroMouseExited
        jPRegistro.setBackground(new Color(0,51, 102));
        jLRegistro.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_jLRegistroMouseExited

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
    private javax.swing.JLabel jLHome;
    private javax.swing.JLabel jLLaboratorio;
    private javax.swing.JLabel jLProfesional;
    private javax.swing.JLabel jLRegistro;
    private javax.swing.JLabel jLTurno;
    private javax.swing.JLabel jLVacuna;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPFondoCel;
    private javax.swing.JPanel jPRegistro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCiudadano;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelLaboratorio;
    private javax.swing.JPanel jPanelProfesional;
    private javax.swing.JPanel jPanelTurno;
    private javax.swing.JPanel jPanelVacuna;
    // End of variables declaration//GEN-END:variables
}
