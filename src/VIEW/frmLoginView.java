package VIEW;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class frmLoginView extends javax.swing.JFrame {

    public frmLoginView() {
        initComponents();
        Seticon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Image = new javax.swing.JLabel();
        PanelPrincipal = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        linhaLogo = new javax.swing.JPanel();
        lblEntre = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new Component.TextFieldSenha();
        buttonEsqueci = new Component.ButtonEsqueci();
        linhaOu = new javax.swing.JPanel();
        linhaOu2 = new javax.swing.JPanel();
        lblOu = new javax.swing.JLabel();
        txtEmail = new Component.TextFieldEmail();
        buttonEntrar1 = new Component.ButtonEntrar();
        buttonCadastre1 = new Component.ButtonCadastre();
        lblCopyright = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SolarSun");
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Images/Login.png"))); // NOI18N
        getContentPane().add(Image);
        Image.setBounds(0, 0, 900, 720);

        PanelPrincipal.setBackground(new java.awt.Color(0, 18, 38));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(280, 3));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Images/Logo.png"))); // NOI18N

        linhaLogo.setBackground(new java.awt.Color(255, 255, 255));
        linhaLogo.setMinimumSize(new java.awt.Dimension(1, 1));
        linhaLogo.setPreferredSize(new java.awt.Dimension(280, 2));

        javax.swing.GroupLayout linhaLogoLayout = new javax.swing.GroupLayout(linhaLogo);
        linhaLogo.setLayout(linhaLogoLayout);
        linhaLogoLayout.setHorizontalGroup(
            linhaLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        linhaLogoLayout.setVerticalGroup(
            linhaLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        lblEntre.setBackground(new java.awt.Color(255, 255, 255));
        lblEntre.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblEntre.setForeground(new java.awt.Color(255, 255, 255));
        lblEntre.setText("Entre na sua Conta");

        lblEmail.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");

        lblSenha.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha");

        txtSenha.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        buttonEsqueci.setBorder(null);
        buttonEsqueci.setText("Esqueci a Senha");
        buttonEsqueci.setText("<html><u>Esqueci a Senha</u>");

        linhaOu.setBackground(new java.awt.Color(255, 255, 255));
        linhaOu.setPreferredSize(new java.awt.Dimension(120, 2));

        javax.swing.GroupLayout linhaOuLayout = new javax.swing.GroupLayout(linhaOu);
        linhaOu.setLayout(linhaOuLayout);
        linhaOuLayout.setHorizontalGroup(
            linhaOuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        linhaOuLayout.setVerticalGroup(
            linhaOuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        linhaOu2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout linhaOu2Layout = new javax.swing.GroupLayout(linhaOu2);
        linhaOu2.setLayout(linhaOu2Layout);
        linhaOu2Layout.setHorizontalGroup(
            linhaOu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        linhaOu2Layout.setVerticalGroup(
            linhaOu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        lblOu.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblOu.setForeground(new java.awt.Color(255, 255, 255));
        lblOu.setText("ou");

        txtEmail.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        buttonEntrar1.setText("Entrar");
        buttonEntrar1.setFocusable(false);
        buttonEntrar1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntrar1ActionPerformed(evt);
            }
        });

        buttonCadastre1.setText("Cadastre-se");
        buttonCadastre1.setFocusable(false);
        buttonCadastre1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonCadastre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastre1ActionPerformed(evt);
            }
        });

        lblCopyright.setBackground(new java.awt.Color(255, 255, 255));
        lblCopyright.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        lblCopyright.setForeground(new java.awt.Color(255, 255, 255));
        lblCopyright.setText("Copyright @ 2024 SolarSun");

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonEsqueci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha)
                    .addComponent(lblEmail)
                    .addComponent(linhaLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Logo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEntre)
                    .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonEntrar1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(linhaOu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblOu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(linhaOu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonCadastre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(lblCopyright)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(Logo)
                .addGap(20, 20, 20)
                .addComponent(linhaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblEntre)
                .addGap(60, 60, 60)
                .addComponent(lblEmail)
                .addGap(15, 15, 15)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lblSenha)
                .addGap(15, 15, 15)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(buttonEsqueci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(buttonEntrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(linhaOu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(linhaOu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblOu))
                .addGap(34, 34, 34)
                .addComponent(buttonCadastre1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(lblCopyright)
                .addGap(30, 30, 30))
        );

        linhaOu.getAccessibleContext().setAccessibleName("");
        linhaOu.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(PanelPrincipal);
        PanelPrincipal.setBounds(900, 0, 380, 720);

        setSize(new java.awt.Dimension(1296, 759));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void buttonEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntrar1ActionPerformed
        Logar();
    }//GEN-LAST:event_buttonEntrar1ActionPerformed

    private void buttonCadastre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastre1ActionPerformed
        frmRegistroView objFrmRegister = new frmRegistroView();
        objFrmRegister.setVisible(true);

        dispose();
    }//GEN-LAST:event_buttonCadastre1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLoginView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel PanelPrincipal;
    private Component.ButtonCadastre buttonCadastre1;
    private Component.ButtonEntrar buttonEntrar1;
    private Component.ButtonEsqueci buttonEsqueci;
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEntre;
    private javax.swing.JLabel lblOu;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPanel linhaLogo;
    private javax.swing.JPanel linhaOu;
    private javax.swing.JPanel linhaOu2;
    private Component.TextFieldEmail txtEmail;
    private Component.TextFieldSenha txtSenha;
    // End of variables declaration//GEN-END:variables
    private void Logar() {
        try {
            UsuarioDTO objUsuarioDTO = new UsuarioDTO();

            objUsuarioDTO.setEmail(txtEmail.getText());
            objUsuarioDTO.setSenha(txtSenha.getText());

            UsuarioDAO objUsuarioDAO = new UsuarioDAO();
            ResultSet rsUsuarioDAO = objUsuarioDAO.autenticacaoUsuario(objUsuarioDTO);

            if (rsUsuarioDAO.next()) {
                frmHomeView objFrmHome = new frmHomeView();
                objFrmHome.setVisible(true);

                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou Senha Inválida");
            }
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "FRMLOGINVIEW: " + error);
        }
    }

    private void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LogoIcon.png")));
    }
}
