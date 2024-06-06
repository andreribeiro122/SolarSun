package VIEW;

import DAO.ClienteDAO;
import java.awt.Toolkit;

public class frmHomeView extends javax.swing.JFrame {

    public frmHomeView() {
        initComponents();

        Seticon();
        
        ClienteDAO objClienteDAO = new ClienteDAO();
        boolean veriAdm = objClienteDAO.verificaoADM();
        
        if (veriAdm == false) {
            btnADM.setVisible(false);
        } else {
            btnADM.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnSobreNos = new javax.swing.JButton();
        btnSuporte = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SolarSun - Home");
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

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("BEM VINDO DE VOLTA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        lblHomeNome.setFont(new java.awt.Font("Microsoft YaHei", 1, 28)); // NOI18N
        lblHomeNome.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lblHomeNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ultimas notícias");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Noticias1.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Noticias2.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ultimas notícias");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Ultimas notícias");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 590, -1, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Seu Resumo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Energia Gerada");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, -1, -1));

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Energia Injetada");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, -1, -1));

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Fatura Energia");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 310, -1, -1));

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Fatura SolarSun");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 470, -1, -1));

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(79, 79, 79));
        jLabel12.setText("Sem dados,");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, -1, -1));

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(79, 79, 79));
        jLabel13.setText("Sem dados,");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, -1, -1));

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(79, 79, 79));
        jLabel14.setText("Sem dados,");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, -1, -1));

        jLabel15.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(79, 79, 79));
        jLabel15.setText("Sem dados,");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, -1, -1));

        jButton1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(53, 175, 196));
        jButton1.setText("contrate um serviço");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, -1, -1));

        jButton2.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(53, 175, 196));
        jButton2.setText("contrate um serviço");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, -1, -1));

        jButton3.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(53, 175, 196));
        jButton3.setText("contrate um serviço");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 360, -1, -1));

        jButton4.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(53, 175, 196));
        jButton4.setText("contrate um serviço");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusable(false);
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 520, -1, -1));

        btnSobreNos.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btnSobreNos.setForeground(new java.awt.Color(0, 0, 0));
        btnSobreNos.setText("Sobre Nós");
        btnSobreNos.setBorder(null);
        btnSobreNos.setBorderPainted(false);
        btnSobreNos.setContentAreaFilled(false);
        btnSobreNos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSobreNos.setFocusable(false);
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
        jPanel1.add(btnAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 30, 40, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 1210, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeLogoActionPerformed

    }//GEN-LAST:event_btnHomeLogoActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        frmLoginView objLoginView = new frmLoginView();
        objLoginView.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed

    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
        frmConfigView objConfigView = new frmConfigView();
        objConfigView.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnConfigActionPerformed

    private void btnADMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADMActionPerformed
        frmClientesView objClientesView = new frmClientesView();
        objClientesView.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnADMActionPerformed

    private void btnServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicesActionPerformed
       frmServicoView objServicoView = new frmServicoView();
       objServicoView.setVisible(true);
       
       this.dispose();
    }//GEN-LAST:event_btnServicesActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        frmDashboardView objDashboardView = new frmDashboardView();
        objDashboardView.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnSuporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuporteActionPerformed
        frmSuporteView objSuporteView = new frmSuporteView();
        objSuporteView.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnSuporteActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmHomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHomeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraLateral;
    private javax.swing.JPanel LinhaLateral;
    public static javax.swing.JButton btnADM;
    public static final Assets.Component.ButtonEntrar btnAvatar = new Assets.Component.ButtonEntrar();
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static final javax.swing.JLabel lblHomeNome = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
    private void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LogoIcon.png")));
    }
}
