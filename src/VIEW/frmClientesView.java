package VIEW;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import DAO.ConexaoDAO;

public class frmClientesView extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    
    public frmClientesView() {
        initComponents();
        
        conn = ConexaoDAO.obterConexao();
        
        cadastroQuantidade();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnHomeLogo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();
        btnServices = new javax.swing.JButton();
        btnExtrato = new javax.swing.JLabel();
        btnConfig = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnADM = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblQuantidade = new javax.swing.JLabel();
        lblQuanClientes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 18, 38));
        jPanel1.setLayout(null);

        btnHomeLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/solarsun/Assets/LogoApp.png"))); // NOI18N
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
        jPanel1.add(btnHomeLogo);
        btnHomeLogo.setBounds(8, 13, 54, 53);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(8, 90, 54, 1);

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/solarsun/Assets/HOME.png"))); // NOI18N
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
        jPanel1.add(btnHome);
        btnHome.setBounds(16, 110, 38, 38);

        btnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/solarsun/Assets/DASHBOARD.png"))); // NOI18N
        btnDashboard.setBorder(null);
        btnDashboard.setBorderPainted(false);
        btnDashboard.setContentAreaFilled(false);
        btnDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDashboard.setFocusable(false);
        jPanel1.add(btnDashboard);
        btnDashboard.setBounds(16, 171, 38, 38);

        btnServices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/solarsun/Assets/SERVIÇOS.png"))); // NOI18N
        btnServices.setBorder(null);
        btnServices.setBorderPainted(false);
        btnServices.setContentAreaFilled(false);
        btnServices.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnServices.setFocusable(false);
        jPanel1.add(btnServices);
        btnServices.setBounds(16, 232, 38, 38);

        btnExtrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/solarsun/Assets/EXTRATO.png"))); // NOI18N
        btnExtrato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExtrato.setFocusable(false);
        jPanel1.add(btnExtrato);
        btnExtrato.setBounds(16, 293, 38, 38);

        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/solarsun/Assets/CONFIG.png"))); // NOI18N
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
        jPanel1.add(btnConfig);
        btnConfig.setBounds(16, 595, 38, 38);

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/solarsun/Assets/logout.png"))); // NOI18N
        btnLogout.setBorder(null);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.setFocusable(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout);
        btnLogout.setBounds(16, 655, 38, 38);

        btnADM.setText("ADM");
        btnADM.setBorder(null);
        btnADM.setBorderPainted(false);
        btnADM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnADM.setEnabled(false);
        jPanel1.add(btnADM);
        btnADM.setBounds(10, 360, 50, 50);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 720));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        lblQuantidade.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblQuantidade.setForeground(new java.awt.Color(0, 0, 0));
        lblQuantidade.setText("Quantidades de Clientes cadastrados:");

        lblQuanClientes.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblQuanClientes.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(lblQuantidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblQuanClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(729, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidade)
                    .addComponent(lblQuanClientes))
                .addContainerGap(571, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 1210, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeLogoActionPerformed
        frmHomeView objHomeView = new frmHomeView();
        objHomeView.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHomeLogoActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        frmHomeView objHomeView = new frmHomeView();
        objHomeView.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
        frmConfigView objConfigView = new frmConfigView();
        objConfigView.setVisible(true);
        //frmConfigView.txtConfigEmail.setText(lblID.getText());

        String sql = "select * from tbusuario where email = ?";

        try {
            pstm = conn.prepareStatement(sql);
            //pstm.setString(1, txtConfigEmail.getText());
            rs = pstm.executeQuery();

            if(rs.next()) {
                //txtConfigNome.setText(rs.getString(3));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        this.dispose();
    }//GEN-LAST:event_btnConfigActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        frmLoginView objLoginView = new frmLoginView();
        objLoginView.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed
    
    private void cadastroQuantidade() {
        String sql = "SELECT COUNT(iduser) FROM tbusuario WHERE perfil = 'user'";
        
        try {
            pstm = conn.prepareStatement(sql);
            ResultSet rsQuantidade = pstm.executeQuery();
            rsQuantidade.next();
            
            lblQuanClientes.setText(rsQuantidade.getString(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
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
            java.util.logging.Logger.getLogger(frmClientesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmClientesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmClientesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmClientesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmClientesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnADM;
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JLabel btnExtrato;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnHomeLogo;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnServices;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblQuanClientes;
    private javax.swing.JLabel lblQuantidade;
    // End of variables declaration//GEN-END:variables
}
