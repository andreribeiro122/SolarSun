package VIEW;

import VIEW.frmRegisterView;
import java.awt.Toolkit;
import DAO.LoginDAO;

public class frmLoginView extends javax.swing.JFrame {
    
    public frmLoginView() {
        initComponents();

        Seticon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Imagem = new javax.swing.JLabel();
        PanelLogin = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Linha = new javax.swing.JPanel();
        lblEntre = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new solarsun.Assets.Component.TextFieldEmail();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new solarsun.Assets.Component.TextFieldSenha();
        btnEsqueci = new javax.swing.JButton();
        btnEntrar = new Component.ButtonEntrar();
        PanelLinha2 = new javax.swing.JPanel();
        PanelLinha3 = new javax.swing.JPanel();
        lblOu = new javax.swing.JLabel();
        btnCadastrese = new Component.ButtonCadastre();
        lblCopy = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SolarSun - Entrar");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Login.png"))); // NOI18N
        getContentPane().add(Imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PanelLogin.setBackground(new java.awt.Color(0, 18, 38));
        PanelLogin.setForeground(new java.awt.Color(255, 255, 255));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Logo.png"))); // NOI18N

        Linha.setBackground(new java.awt.Color(255, 255, 255));
        Linha.setForeground(new java.awt.Color(255, 255, 255));
        Linha.setFocusable(false);

        lblEntre.setBackground(new java.awt.Color(0, 18, 38));
        lblEntre.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        lblEntre.setForeground(new java.awt.Color(255, 255, 255));
        lblEntre.setText("Entre na sua Conta");

        lblEmail.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");

        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N

        lblSenha.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha");

        btnEsqueci.setBackground(new java.awt.Color(243, 160, 28));
        btnEsqueci.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btnEsqueci.setForeground(new java.awt.Color(243, 160, 28));
        btnEsqueci.setText("<html><u>Esqueci a Senha</u>");
        btnEsqueci.setBorder(null);
        btnEsqueci.setBorderPainted(false);
        btnEsqueci.setContentAreaFilled(false);
        btnEsqueci.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnEntrar.setText("Entrar");
        btnEntrar.setFocusable(false);
        btnEntrar.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        PanelLinha2.setBackground(new java.awt.Color(255, 255, 255));

        PanelLinha3.setBackground(new java.awt.Color(255, 255, 255));

        lblOu.setBackground(new java.awt.Color(255, 255, 255));
        lblOu.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblOu.setForeground(new java.awt.Color(255, 255, 255));
        lblOu.setText("ou");

        btnCadastrese.setText("Cadastre-se");
        btnCadastrese.setFocusable(false);
        btnCadastrese.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btnCadastrese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastreseActionPerformed(evt);
            }
        });

        lblCopy.setBackground(new java.awt.Color(255, 255, 255));
        lblCopy.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        lblCopy.setForeground(new java.awt.Color(255, 255, 255));
        lblCopy.setText("Copyright @ 2024 SolarSun");

        javax.swing.GroupLayout PanelLoginLayout = new javax.swing.GroupLayout(PanelLogin);
        PanelLogin.setLayout(PanelLoginLayout);
        PanelLoginLayout.setHorizontalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEsqueci)
                    .addComponent(lblSenha)
                    .addComponent(lblEmail)
                    .addComponent(lblEntre)
                    .addComponent(Logo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Linha, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelLoginLayout.createSequentialGroup()
                        .addComponent(PanelLinha2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblOu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelLinha3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCadastrese, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(lblCopy)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLoginLayout.setVerticalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Linha, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
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
                .addComponent(btnEsqueci)
                .addGap(35, 35, 35)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLoginLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelLinha2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PanelLinha3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelLoginLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblOu)))
                .addGap(35, 35, 35)
                .addComponent(btnCadastrese, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(lblCopy)
                .addGap(25, 25, 25))
        );

        getContentPane().add(PanelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 380, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastreseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastreseActionPerformed
        frmRegisterView objRegisterView = new frmRegisterView();
        objRegisterView.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnCadastreseActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        LoginDAO objLoginDAO = new LoginDAO();
        boolean verificar = objLoginDAO.logar();
        
        if (verificar == true) {
            this.dispose();
        }
    }//GEN-LAST:event_btnEntrarActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLoginView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagem;
    private javax.swing.JPanel Linha;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel PanelLinha2;
    private javax.swing.JPanel PanelLinha3;
    private javax.swing.JPanel PanelLogin;
    private Component.ButtonCadastre btnCadastrese;
    private Component.ButtonEntrar btnEntrar;
    private javax.swing.JButton btnEsqueci;
    private javax.swing.JLabel lblCopy;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEntre;
    private javax.swing.JLabel lblOu;
    private javax.swing.JLabel lblSenha;
    public static solarsun.Assets.Component.TextFieldEmail txtEmail;
    public static solarsun.Assets.Component.TextFieldSenha txtSenha;
    // End of variables declaration//GEN-END:variables

    private void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LogoIcon.png")));
    }
}
