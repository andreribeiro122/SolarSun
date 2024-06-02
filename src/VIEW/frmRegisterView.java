package VIEW;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import DAO.RegisterDAO;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import solarsun.DTO.UsuarioDTO;

/**
 *
 * @author Andre Souza
 */
public class frmRegisterView extends javax.swing.JFrame {

    public frmRegisterView() {
        initComponents();

        Seticon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Imagem = new javax.swing.JLabel();
        PanelRegister = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCrie = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new solarsun.Assets.Component.TextFieldEmail();
        txtEmail = new solarsun.Assets.Component.TextFieldEmail();
        lblEmail = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new solarsun.Assets.Component.TextFieldEmail();
        txtCelular = new solarsun.Assets.Component.TextFieldEmail();
        lblCelular = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new solarsun.Assets.Component.TextFieldEmail();
        txtNumero = new solarsun.Assets.Component.TextFieldEmail();
        lblNumero = new javax.swing.JLabel();
        lblComplemento = new javax.swing.JLabel();
        txtComplemento = new solarsun.Assets.Component.TextFieldEmail();
        txtCEP = new solarsun.Assets.Component.TextFieldEmail();
        lblCEP = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new solarsun.Assets.Component.TextFieldSenha();
        txtConfirmarSenha = new solarsun.Assets.Component.TextFieldSenha();
        lblConfirmarSenha = new javax.swing.JLabel();
        btnCadastro = new Component.ButtonEntrar();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SolarSun - Cadastro");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/BGCadastro.png"))); // NOI18N
        getContentPane().add(Imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, -1));

        PanelRegister.setBackground(new java.awt.Color(0, 18, 38));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Logo.png"))); // NOI18N

        lblCrie.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        lblCrie.setForeground(new java.awt.Color(255, 255, 255));
        lblCrie.setText("Crie sua Conta!");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        lblNome.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome");

        lblEmail.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");

        lblCPF.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(255, 255, 255));
        lblCPF.setText("CPF");

        lblCelular.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblCelular.setForeground(new java.awt.Color(255, 255, 255));
        lblCelular.setText("Celular");

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

        btnCadastro.setText("Cadastre-se");
        btnCadastro.setFocusable(false);
        btnCadastro.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(243, 160, 28));
        jButton1.setText("<html><u>Já tem uma conta? Entre agora!<u/>");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelRegisterLayout = new javax.swing.GroupLayout(PanelRegister);
        PanelRegister.setLayout(PanelRegisterLayout);
        PanelRegisterLayout.setHorizontalGroup(
            PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegisterLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSenha)
                    .addComponent(lblEndereco)
                    .addGroup(PanelRegisterLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(152, 152, 152)
                        .addComponent(lblCrie))
                    .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelRegisterLayout.createSequentialGroup()
                            .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PanelRegisterLayout.createSequentialGroup()
                                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegisterLayout.createSequentialGroup()
                                            .addComponent(lblNome)
                                            .addGap(259, 259, 259)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegisterLayout.createSequentialGroup()
                                        .addComponent(lblCPF)
                                        .addGap(276, 276, 276)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegisterLayout.createSequentialGroup()
                                    .addComponent(lblComplemento)
                                    .addGap(128, 128, 128)))
                            .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCEP)
                                .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblCelular)
                                    .addComponent(lblEmail)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNumero)
                                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCEP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                    .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(lblConfirmarSenha))))
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtComplemento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)))
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegisterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(231, 231, 231))
        );
        PanelRegisterLayout.setVerticalGroup(
            PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegisterLayout.createSequentialGroup()
                .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRegisterLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegisterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCrie)
                        .addGap(45, 45, 45)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblEmail))
                .addGap(10, 10, 10)
                .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(lblCelular))
                .addGap(10, 10, 10)
                .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCelular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(lblNumero))
                .addGap(10, 10, 10)
                .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComplemento)
                    .addComponent(lblCEP))
                .addGap(10, 10, 10)
                .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(lblConfirmarSenha))
                .addGap(10, 10, 10)
                .addGroup(PanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jButton1)
                .addGap(50, 50, 50))
        );

        getContentPane().add(PanelRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frmLoginView objLoginView = new frmLoginView();
        objLoginView.setVisible(true);

        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        Registro();
    }//GEN-LAST:event_btnCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegisterView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagem;
    private javax.swing.JPanel PanelRegister;
    private Component.ButtonEntrar btnCadastro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
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
    private solarsun.Assets.Component.TextFieldEmail txtCEP;
    private solarsun.Assets.Component.TextFieldEmail txtCPF;
    private solarsun.Assets.Component.TextFieldEmail txtCelular;
    private solarsun.Assets.Component.TextFieldEmail txtComplemento;
    private solarsun.Assets.Component.TextFieldSenha txtConfirmarSenha;
    private solarsun.Assets.Component.TextFieldEmail txtEmail;
    private solarsun.Assets.Component.TextFieldEmail txtEndereco;
    private solarsun.Assets.Component.TextFieldEmail txtNome;
    private solarsun.Assets.Component.TextFieldEmail txtNumero;
    private solarsun.Assets.Component.TextFieldSenha txtSenha;
    // End of variables declaration//GEN-END:variables

    private static final String EMAIL_PATTERN
            = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);

    public static boolean validarEmail(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private void Registro() {
        String nome = txtNome.getText();
        String email = txtEmail.getText();
        String cpf = txtCPF.getText();
        String celular = txtCelular.getText();
        String endereco = txtEndereco.getText();
        String numero = txtNumero.getText();
        String complemento = txtComplemento.getText();
        String cep = txtCEP.getText();
        String senha = String.valueOf(txtSenha.getPassword());
        String confirmarSenha = String.valueOf(txtConfirmarSenha.getPassword());
        boolean validar = validarEmail(email);

        if (senha.isEmpty() || confirmarSenha.isEmpty() || email.isEmpty() || cpf.isEmpty() || celular.isEmpty() || endereco.isEmpty() || numero.isEmpty() || cep.isEmpty() || nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos.");
        } else {
            if (validar == false) {
                JOptionPane.showMessageDialog(null, "Por favor coloque um email valido.");
            } else if (senha.length() > 15) {
                JOptionPane.showMessageDialog(null, "A senha deve ter no máximo 15 caracteres.");
            } else if (celular.length() != 11) {
                JOptionPane.showMessageDialog(null, "Insira um número de Celular valido.");
            } else if (celular.matches("^[0-9]+$")) {
                if (cpf.length() != 11) {
                    JOptionPane.showMessageDialog(null, "Insira um CPF valido.");
                } else if (senha.equals(confirmarSenha)) {
                    UsuarioDTO objUsuarioDTO = new UsuarioDTO();
                    objUsuarioDTO.setNome(nome);
                    objUsuarioDTO.setEmail(email);
                    objUsuarioDTO.setCpf(cpf);
                    objUsuarioDTO.setCelular(celular);
                    objUsuarioDTO.setEndereco(endereco);
                    objUsuarioDTO.setNumero(numero);
                    objUsuarioDTO.setComplemento(complemento);
                    objUsuarioDTO.setCep(cep);
                    objUsuarioDTO.setSenha(senha);

                    RegisterDAO objRegisterDAO = new RegisterDAO();
                    boolean verificao = objRegisterDAO.registrarUsuario(objUsuarioDTO);

                    if (verificao == true) {
                        frmLoginView objLoginView = new frmLoginView();
                        objLoginView.setVisible(true);

                        this.dispose();
                    } else {
                        System.out.println("Problema");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "As senhas devem ser iguais.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Campo Celular comporta apenas números.");
            }
        }
    }

    private void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LogoIcon.png")));
    }
}
