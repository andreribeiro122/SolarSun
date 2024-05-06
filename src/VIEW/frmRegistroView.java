/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class frmRegistroView extends javax.swing.JFrame {
    public frmRegistroView() {
        initComponents();
        Seticon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        lblCrie = new javax.swing.JLabel();
        LinhaRegistro = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new Component.TextFieldEmail();
        txtEmail = new Component.TextFieldEmail();
        lblEmail = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new Component.TextFieldEmail();
        lblCelular = new javax.swing.JLabel();
        txtCelular = new Component.TextFieldEmail();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new Component.TextFieldEmail();
        txtNumero = new Component.TextFieldEmail();
        lblNumero = new javax.swing.JLabel();
        lblComplemento = new javax.swing.JLabel();
        txtComplemento = new Component.TextFieldEmail();
        txtCEP = new Component.TextFieldEmail();
        lblCEP = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblConfirmarSenha = new javax.swing.JLabel();
        btnCadastre = new Component.ButtonEntrar();
        btnExisteConta = new Component.ButtonEsqueci();
        ImagemRegister1 = new javax.swing.JLabel();
        txtSenha = new Component.TextFieldSenha();
        txtConfirmarSenha = new Component.TextFieldSenha();
        ImagemRegister = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SolarSun");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelPrincipal.setBackground(new java.awt.Color(0, 18, 38));
        PainelPrincipal.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        PainelPrincipal.setMaximumSize(new java.awt.Dimension(1280, 720));
        PainelPrincipal.setMinimumSize(new java.awt.Dimension(1280, 720));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Images/Logo.png"))); // NOI18N

        lblCrie.setBackground(new java.awt.Color(255, 255, 255));
        lblCrie.setFont(new java.awt.Font("Microsoft YaHei", 1, 19)); // NOI18N
        lblCrie.setForeground(new java.awt.Color(255, 255, 255));
        lblCrie.setText("Crie sua Conta!");

        LinhaRegistro.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout LinhaRegistroLayout = new javax.swing.GroupLayout(LinhaRegistro);
        LinhaRegistro.setLayout(LinhaRegistroLayout);
        LinhaRegistroLayout.setHorizontalGroup(
            LinhaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );
        LinhaRegistroLayout.setVerticalGroup(
            LinhaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        lblNome.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome");

        txtNome.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");

        lblCPF.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(255, 255, 255));
        lblCPF.setText("CPF");

        txtCPF.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N

        lblCelular.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblCelular.setForeground(new java.awt.Color(255, 255, 255));
        lblCelular.setText("Celular");

        txtCelular.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N

        lblEndereco.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblEndereco.setForeground(new java.awt.Color(255, 255, 255));
        lblEndereco.setText("Endereço");

        lblNumero.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero.setText("Número");

        lblComplemento.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblComplemento.setForeground(new java.awt.Color(255, 255, 255));
        lblComplemento.setText("Complemento (Opcional)");

        lblCEP.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblCEP.setForeground(new java.awt.Color(255, 255, 255));
        lblCEP.setText("CEP");

        lblSenha.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha");

        lblConfirmarSenha.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblConfirmarSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmarSenha.setText("Confirmar Senha");

        btnCadastre.setText("Cadastre-se");
        btnCadastre.setFocusable(false);
        btnCadastre.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btnCadastre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastreActionPerformed(evt);
            }
        });

        btnExisteConta.setText("Já tem uma conta? Entre agora!");
        btnExisteConta.setText("<html><u>Já tem uma conta? Entre agora!</u>");
        btnExisteConta.setFont(new java.awt.Font("Microsoft YaHei", 0, 10)); // NOI18N
        btnExisteConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExisteContaActionPerformed(evt);
            }
        });

        ImagemRegister1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Images/BGCadastro.png"))); // NOI18N
        ImagemRegister1.setText("jLabel2");

        javax.swing.GroupLayout PainelPrincipalLayout = new javax.swing.GroupLayout(PainelPrincipal);
        PainelPrincipal.setLayout(PainelPrincipalLayout);
        PainelPrincipalLayout.setHorizontalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                .addComponent(Logo)
                                .addGap(143, 143, 143)
                                .addComponent(lblCrie))
                            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(LinhaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addGap(263, 263, 263)
                                .addComponent(lblEmail))
                            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                .addComponent(lblCPF)
                                .addGap(280, 280, 280)
                                .addComponent(lblCelular))
                            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                .addComponent(lblEndereco)
                                .addGap(346, 346, 346)
                                .addComponent(lblNumero))
                            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                .addComponent(lblComplemento)
                                .addGap(132, 132, 132)
                                .addComponent(lblCEP))
                            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                .addComponent(lblSenha)
                                .addGap(264, 264, 264)
                                .addComponent(lblConfirmarSenha))
                            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(btnCadastre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnExisteConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(280, 280, 280)))
                .addComponent(ImagemRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PainelPrincipalLayout.setVerticalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo)
                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblCrie)))
                .addGap(26, 26, 26)
                .addComponent(LinhaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(lblEmail))
                .addGap(15, 15, 15)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCPF)
                    .addComponent(lblCelular))
                .addGap(15, 15, 15)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEndereco)
                    .addComponent(lblNumero))
                .addGap(15, 15, 15)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblComplemento)
                    .addComponent(lblCEP))
                .addGap(15, 15, 15)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSenha)
                    .addComponent(lblConfirmarSenha))
                .addGap(15, 15, 15)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnCadastre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnExisteConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(ImagemRegister1)
        );

        getContentPane().add(PainelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 720));

        ImagemRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Images/BGCadastro.png"))); // NOI18N
        ImagemRegister.setText("jLabel2");
        getContentPane().add(ImagemRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 560, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnExisteContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExisteContaActionPerformed
        frmLoginView objFrmLogin = new frmLoginView();
        objFrmLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnExisteContaActionPerformed

    private void btnCadastreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastreActionPerformed
        String senha = txtSenha.getText();
        String confirmarSenha = txtConfirmarSenha.getText();
        String email = txtEmail.getText();
        String cpf = txtCPF.getText();
        String celular = txtCelular.getText();
        String endereco = txtEndereco.getText();
        String numero = txtNumero.getText();
        String cep = txtCEP.getText();
        String nome = txtNome.getText();

        if (senha.isEmpty() || confirmarSenha.isEmpty() || email.isEmpty() || cpf.isEmpty() || celular.isEmpty() || endereco.isEmpty() || numero.isEmpty() || cep.isEmpty() || nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
        } else {
            if (senha.equals(confirmarSenha)) {
                try {
                    UsuarioDTO objUsuarioDTO = new UsuarioDTO();

                    objUsuarioDTO.setNome(txtNome.getText());
                    objUsuarioDTO.setEmail(txtEmail.getText());
                    objUsuarioDTO.setCpf(txtCPF.getText());
                    objUsuarioDTO.setCelular(txtCelular.getText());
                    objUsuarioDTO.setEndereco(txtEndereco.getText());
                    objUsuarioDTO.setNumero(txtNumero.getText());
                    objUsuarioDTO.setComplemento(txtComplemento.getText());
                    objUsuarioDTO.setCep(txtCEP.getText());
                    objUsuarioDTO.setSenha(txtSenha.getText());

                    UsuarioDAO objUsuarioDAO = new UsuarioDAO();
                    ResultSet rsUsuarioDAOEmail = objUsuarioDAO.verificarEmail(objUsuarioDTO);
                    ResultSet rsUsuarioDAOCPF = objUsuarioDAO.verificarCPF(objUsuarioDTO);
                    ResultSet rsUsuarioDAOCelular = objUsuarioDAO.verificarCelular(objUsuarioDTO);
                    if (rsUsuarioDAOEmail.next()) {
                        JOptionPane.showMessageDialog(null, "Email já existe, por favor insira outro email.");
                    } else if (rsUsuarioDAOCPF.next()) {
                        JOptionPane.showMessageDialog(null, "CPF já existe, por favor insira outro cpf.");
                    } else if (rsUsuarioDAOCelular.next()) {
                        JOptionPane.showMessageDialog(null, "Celular já existe, por favor insira outro celular.");
                    } else {
                        objUsuarioDAO.registroUsuario(objUsuarioDTO);
                        frmLoginView objLoginView = new frmLoginView();
                        objLoginView.setVisible(true);

                        dispose();
                    }

                } catch (SQLException error) {
                    JOptionPane.showMessageDialog(null, "Cadastre" + error);
                }
            } else {
                JOptionPane.showMessageDialog(null, "As senhas precisam ser iguais");
            }
        }
    }//GEN-LAST:event_btnCadastreActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegistroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistroView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagemRegister;
    private javax.swing.JLabel ImagemRegister1;
    private javax.swing.JPanel LinhaRegistro;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel PainelPrincipal;
    private Component.ButtonEntrar btnCadastre;
    private Component.ButtonEsqueci btnExisteConta;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblConfirmarSenha;
    private javax.swing.JLabel lblCrie;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblSenha;
    private Component.TextFieldEmail txtCEP;
    private Component.TextFieldEmail txtCPF;
    private Component.TextFieldEmail txtCelular;
    private Component.TextFieldEmail txtComplemento;
    private Component.TextFieldSenha txtConfirmarSenha;
    private Component.TextFieldEmail txtEmail;
    private Component.TextFieldEmail txtEndereco;
    private Component.TextFieldEmail txtNome;
    private Component.TextFieldEmail txtNumero;
    private Component.TextFieldSenha txtSenha;
    // End of variables declaration//GEN-END:variables
    
    private void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LogoIcon.png")));
    }
}
