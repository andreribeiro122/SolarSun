package VIEW;

public class frmSuporteClienteView extends javax.swing.JFrame {

    public frmSuporteClienteView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarraLateral = new javax.swing.JPanel();
        btnHomeLogo = new javax.swing.JButton();
        LinhaLateral = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();
        btnServices = new javax.swing.JButton();
        btnExtrato = new javax.swing.JLabel();
        btnConfig = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnADM = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnSobreNos = new javax.swing.JButton();
        btnSuporte = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraLateral.setBackground(new java.awt.Color(0, 18, 38));
        BarraLateral.setLayout(null);

        btnHomeLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/LogoApp.png"))); // NOI18N
        btnHomeLogo.setBorder(null);
        btnHomeLogo.setBorderPainted(false);
        btnHomeLogo.setContentAreaFilled(false);
        btnHomeLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHomeLogo.setFocusable(false);
        btnHomeLogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeLogoActionPerformed(evt);
            }
        });
        BarraLateral.add(btnHomeLogo);
        btnHomeLogo.setBounds(8, 13, 54, 53);

        LinhaLateral.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout LinhaLateralLayout = new javax.swing.GroupLayout(LinhaLateral);
        LinhaLateral.setLayout(LinhaLateralLayout);
        LinhaLateralLayout.setHorizontalGroup(
            LinhaLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );
        LinhaLateralLayout.setVerticalGroup(
            LinhaLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        BarraLateral.add(LinhaLateral);
        LinhaLateral.setBounds(8, 90, 54, 1);

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/HOME.png"))); // NOI18N
        btnHome.setBorder(null);
        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.setFocusable(false);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        BarraLateral.add(btnHome);
        btnHome.setBounds(16, 110, 38, 38);

        btnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/DASHBOARD.png"))); // NOI18N
        btnDashboard.setBorder(null);
        btnDashboard.setBorderPainted(false);
        btnDashboard.setContentAreaFilled(false);
        btnDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDashboard.setFocusable(false);
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });
        BarraLateral.add(btnDashboard);
        btnDashboard.setBounds(16, 171, 38, 38);

        btnServices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/SERVIÇOS.png"))); // NOI18N
        btnServices.setBorder(null);
        btnServices.setBorderPainted(false);
        btnServices.setContentAreaFilled(false);
        btnServices.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnServices.setFocusable(false);
        btnServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicesActionPerformed(evt);
            }
        });
        BarraLateral.add(btnServices);
        btnServices.setBounds(16, 232, 38, 38);

        btnExtrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/EXTRATO.png"))); // NOI18N
        btnExtrato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExtrato.setFocusable(false);
        BarraLateral.add(btnExtrato);
        btnExtrato.setBounds(16, 293, 38, 38);

        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/CONFIG.png"))); // NOI18N
        btnConfig.setBorder(null);
        btnConfig.setBorderPainted(false);
        btnConfig.setContentAreaFilled(false);
        btnConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfig.setFocusable(false);
        btnConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigActionPerformed(evt);
            }
        });
        BarraLateral.add(btnConfig);
        btnConfig.setBounds(16, 595, 38, 38);

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logout.png"))); // NOI18N
        btnLogout.setBorder(null);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.setFocusable(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        BarraLateral.add(btnLogout);
        btnLogout.setBounds(16, 655, 38, 38);

        btnADM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/CLIENTES.png"))); // NOI18N
        btnADM.setBorder(null);
        btnADM.setBorderPainted(false);
        btnADM.setContentAreaFilled(false);
        btnADM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnADM.setFocusable(false);
        btnADM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADMActionPerformed(evt);
            }
        });
        BarraLateral.add(btnADM);
        btnADM.setBounds(16, 354, 38, 38);

        getContentPane().add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 720));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSobreNos.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btnSobreNos.setForeground(new java.awt.Color(0, 0, 0));
        btnSobreNos.setText("Sobre Nós");
        btnSobreNos.setBorder(null);
        btnSobreNos.setBorderPainted(false);
        btnSobreNos.setContentAreaFilled(false);
        btnSobreNos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSobreNos.setFocusable(false);
        btnSobreNos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreNosActionPerformed(evt);
            }
        });
        jPanel1.add(btnSobreNos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        btnSuporte.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btnSuporte.setForeground(new java.awt.Color(0, 0, 0));
        btnSuporte.setText("Suporte ao Cliente");
        btnSuporte.setBorder(null);
        btnSuporte.setBorderPainted(false);
        btnSuporte.setContentAreaFilled(false);
        btnSuporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuporte.setFocusable(false);
        btnSuporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuporteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSuporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Assunto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        jButton1.setText("jButton1");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 650, -1, -1));

        jButton2.setText("jButton2");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 650, -1, -1));

        jButton3.setText("jButton3");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 170, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(10);
        jTextArea1.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(20);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextArea1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextArea1.setMaximumSize(new java.awt.Dimension(232, 380));
        jTextArea1.setMinimumSize(new java.awt.Dimension(232, 380));
        jTextArea1.setSelectionColor(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 890, 390));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/back.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusable(false);
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jComboBox2.setBackground(new java.awt.Color(53, 175, 196));
        jComboBox2.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox2.setFocusable(false);
        jComboBox2.setLightWeightPopupEnabled(false);
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 250, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 1210, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeLogoActionPerformed

    }//GEN-LAST:event_btnHomeLogoActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed

    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        frmDashboardView objDashboardView = new frmDashboardView();
        objDashboardView.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicesActionPerformed
        frmServicoView objServicoView = new frmServicoView();
        objServicoView.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnServicesActionPerformed

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
        frmConfigView objConfigView = new frmConfigView();
        objConfigView.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnConfigActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        frmLoginView objLoginView = new frmLoginView();
        objLoginView.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnADMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADMActionPerformed
        frmClientesView objClientesView = new frmClientesView();
        objClientesView.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnADMActionPerformed

    private void btnSobreNosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreNosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSobreNosActionPerformed

    private void btnSuporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuporteActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(frmSuporteClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSuporteClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSuporteClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSuporteClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSuporteClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraLateral;
    private javax.swing.JPanel LinhaLateral;
    public static javax.swing.JButton btnADM;
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JLabel btnExtrato;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnHomeLogo;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnServices;
    private javax.swing.JButton btnSobreNos;
    private javax.swing.JButton btnSuporte;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
