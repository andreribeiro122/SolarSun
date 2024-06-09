package VIEW;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import DAO.RegisterDAO;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import DTO.UsuarioDTO;

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
        lblEmail = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblComplemento = new javax.swing.JLabel();
        lblCEP = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblConfirmarSenha = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtNome = new Assets.Component.TextFieldEmail();
        txtNumero = new Assets.Component.TextFieldEmail();
        txtEndereco = new Assets.Component.TextFieldEmail();
        txtEmail = new Assets.Component.TextFieldEmail();
        txtCEP = new Assets.Component.TextFieldEmail();
        txtCelular = new Assets.Component.TextFieldEmail();
        txtCPF = new Assets.Component.TextFieldEmail();
        txtConfirmarSenha = new Assets.Component.TextFieldSenha();
        txtSenha = new Assets.Component.TextFieldSenha();
        txtComplemento = new Assets.Component.TextFieldEmail();
        buttonEntrar1 = new Assets.Component.ButtonEntrar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SolarSun - Cadastro");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/BGCadastro.png"))); // NOI18N
        getContentPane().add(Imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, -1));

        PanelRegister.setBackground(new java.awt.Color(0, 18, 38));
        PanelRegister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Logo.png"))); // NOI18N
        PanelRegister.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        lblCrie.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        lblCrie.setForeground(new java.awt.Color(255, 255, 255));
        lblCrie.setText("Crie sua Conta!");
        PanelRegister.add(lblCrie, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 75, -1, -1));

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

        PanelRegister.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 144, -1, -1));

        lblNome.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome");
        PanelRegister.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        lblEmail.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");
        PanelRegister.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 170, -1, -1));

        lblCPF.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(255, 255, 255));
        lblCPF.setText("CPF");
        PanelRegister.add(lblCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 254, -1, -1));

        lblCelular.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblCelular.setForeground(new java.awt.Color(255, 255, 255));
        lblCelular.setText("Celular");
        PanelRegister.add(lblCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 254, -1, -1));

        lblEndereco.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblEndereco.setForeground(new java.awt.Color(255, 255, 255));
        lblEndereco.setText("Endereço");
        PanelRegister.add(lblEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 338, -1, -1));

        lblNumero.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero.setText("Número");
        PanelRegister.add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 338, -1, -1));

        lblComplemento.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblComplemento.setForeground(new java.awt.Color(255, 255, 255));
        lblComplemento.setText("Complemento (Opcional)");
        PanelRegister.add(lblComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 422, -1, -1));

        lblCEP.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblCEP.setForeground(new java.awt.Color(255, 255, 255));
        lblCEP.setText("CEP");
        PanelRegister.add(lblCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 422, -1, -1));

        lblSenha.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha");
        PanelRegister.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 506, -1, -1));

        lblConfirmarSenha.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblConfirmarSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmarSenha.setText("Confirmar Senha");
        PanelRegister.add(lblConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 506, -1, -1));

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
        PanelRegister.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 653, 258, -1));

        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        PanelRegister.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 199, 258, 30));

        txtNumero.setForeground(new java.awt.Color(0, 0, 0));
        txtNumero.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        PanelRegister.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 367, 126, 30));

        txtEndereco.setForeground(new java.awt.Color(0, 0, 0));
        txtEndereco.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        PanelRegister.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 367, 387, 30));

        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        PanelRegister.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 199, 258, 30));

        txtCEP.setForeground(new java.awt.Color(0, 0, 0));
        txtCEP.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        PanelRegister.add(txtCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 451, 258, 30));

        txtCelular.setForeground(new java.awt.Color(0, 0, 0));
        txtCelular.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        PanelRegister.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 283, 258, 30));

        txtCPF.setForeground(new java.awt.Color(0, 0, 0));
        txtCPF.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        PanelRegister.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 283, 258, 30));

        txtConfirmarSenha.setForeground(new java.awt.Color(0, 0, 0));
        txtConfirmarSenha.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        PanelRegister.add(txtConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 535, 258, 30));

        txtSenha.setForeground(new java.awt.Color(0, 0, 0));
        txtSenha.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        PanelRegister.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 535, 258, 30));

        txtComplemento.setForeground(new java.awt.Color(0, 0, 0));
        txtComplemento.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        PanelRegister.add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 451, 258, 30));

        buttonEntrar1.setText("Cadastre-se");
        buttonEntrar1.setFocusable(false);
        buttonEntrar1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        buttonEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntrar1ActionPerformed(evt);
            }
        });
        PanelRegister.add(buttonEntrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 600, 258, 30));

        getContentPane().add(PanelRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frmLoginView objLoginView = new frmLoginView();
        objLoginView.setVisible(true);

        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntrar1ActionPerformed
        Registro();
    }//GEN-LAST:event_buttonEntrar1ActionPerformed

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
    private Assets.Component.ButtonEntrar buttonEntrar1;
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
    private Assets.Component.TextFieldEmail txtCEP;
    private Assets.Component.TextFieldEmail txtCPF;
    private Assets.Component.TextFieldEmail txtCelular;
    private Assets.Component.TextFieldEmail txtComplemento;
    private Assets.Component.TextFieldSenha txtConfirmarSenha;
    private Assets.Component.TextFieldEmail txtEmail;
    private Assets.Component.TextFieldEmail txtEndereco;
    private Assets.Component.TextFieldEmail txtNome;
    private Assets.Component.TextFieldEmail txtNumero;
    private Assets.Component.TextFieldSenha txtSenha;
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
                if (cpf.length() != 11 && cpf.matches("^[_A-Za-z]")) {
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
