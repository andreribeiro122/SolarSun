package VIEW;

import DAO.ClienteDAO;
import DAO.ConfigDAO;
import java.awt.Toolkit;

public class frmConfigView extends javax.swing.JFrame {

    public frmConfigView() {
        initComponents();

        Seticon();

        btnAvatar.setName(frmHomeView.btnAvatar.getName());

        ConfigDAO objConfigDAO = new ConfigDAO();
        objConfigDAO.dados();
        
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
        jPanel2 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        btnAlterarNome = new javax.swing.JButton();
        btnAceitoNome = new javax.swing.JButton();
        btnCancelarNome = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        btnAlterarEndereco = new javax.swing.JButton();
        btnAceitarEndereco = new javax.swing.JButton();
        btnCancelarEndereco = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAlterarEmail = new javax.swing.JButton();
        btnAceitoEmail = new javax.swing.JButton();
        btnCancelarEmail = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnAlterarCelular = new javax.swing.JButton();
        btnAceitarCelular = new javax.swing.JButton();
        btnCancelarCelular = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnAceitarSenha = new javax.swing.JButton();
        btnCancelarSenha = new javax.swing.JButton();
        btnAlterarSenha = new javax.swing.JButton();
        btnConfigEncerrar = new javax.swing.JButton();
        lblConfirmarSenha = new javax.swing.JLabel();
        btnSobreNos = new javax.swing.JButton();
        btnSuporte = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtConfigCelular = new Assets.Component.TextFieldConfig();
        txtConfigNome = new Assets.Component.TextFieldConfig();
        txtConfigEmail = new Assets.Component.TextFieldConfig();
        txtConfigEndereco = new Assets.Component.TextFieldConfig();
        txtConfigConfirmar = new Assets.Component.TextFieldConfigSenha();
        txtConfigSenha = new Assets.Component.TextFieldConfigSenha();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SolarSun - Configurações");
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNome.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setText("Nome:");
        jPanel2.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 218, -1, -1));

        btnAlterarNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/pencil.png"))); // NOI18N
        btnAlterarNome.setBorder(null);
        btnAlterarNome.setBorderPainted(false);
        btnAlterarNome.setContentAreaFilled(false);
        btnAlterarNome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarNome.setFocusable(false);
        btnAlterarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarNomeActionPerformed(evt);
            }
        });
        jPanel2.add(btnAlterarNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 216, 25, 25));

        btnAceitoNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/correct.png"))); // NOI18N
        btnAceitoNome.setBorder(null);
        btnAceitoNome.setBorderPainted(false);
        btnAceitoNome.setContentAreaFilled(false);
        btnAceitoNome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceitoNome.setFocusable(false);
        btnAceitoNome.setVisible(false);
        btnAceitoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceitoNomeActionPerformed(evt);
            }
        });
        jPanel2.add(btnAceitoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 216, 25, 25));

        btnCancelarNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/close.png"))); // NOI18N
        btnCancelarNome.setBorder(null);
        btnCancelarNome.setBorderPainted(false);
        btnCancelarNome.setContentAreaFilled(false);
        btnCancelarNome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarNome.setFocusable(false);
        btnCancelarNome.setVisible(false);
        btnCancelarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarNomeActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelarNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 216, 25, 25));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Configurações");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 105, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Conta");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 173, -1, -1));

        lblEndereco.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblEndereco.setForeground(new java.awt.Color(0, 0, 0));
        lblEndereco.setText("Endereço:");
        jPanel2.add(lblEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 69, -1));

        btnAlterarEndereco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/pencil.png"))); // NOI18N
        btnAlterarEndereco.setBorder(null);
        btnAlterarEndereco.setBorderPainted(false);
        btnAlterarEndereco.setContentAreaFilled(false);
        btnAlterarEndereco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarEndereco.setFocusable(false);
        btnAlterarEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarEnderecoActionPerformed(evt);
            }
        });
        jPanel2.add(btnAlterarEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 330, 25, 25));

        btnAceitarEndereco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/correct.png"))); // NOI18N
        btnAceitarEndereco.setBorder(null);
        btnAceitarEndereco.setBorderPainted(false);
        btnAceitarEndereco.setContentAreaFilled(false);
        btnAceitarEndereco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceitarEndereco.setFocusable(false);
        btnAceitarEndereco.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnAceitarEndereco.setVisible(false);
        btnAceitarEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceitarEnderecoActionPerformed(evt);
            }
        });
        jPanel2.add(btnAceitarEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 330, 25, 25));

        btnCancelarEndereco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/close.png"))); // NOI18N
        btnCancelarEndereco.setBorder(null);
        btnCancelarEndereco.setBorderPainted(false);
        btnCancelarEndereco.setContentAreaFilled(false);
        btnCancelarEndereco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarEndereco.setFocusable(false);
        btnCancelarEndereco.setVisible(false);
        btnCancelarEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEnderecoActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelarEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 330, 25, 25));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Email:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 272, -1, -1));

        btnAlterarEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/pencil.png"))); // NOI18N
        btnAlterarEmail.setBorder(null);
        btnAlterarEmail.setBorderPainted(false);
        btnAlterarEmail.setContentAreaFilled(false);
        btnAlterarEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarEmail.setFocusable(false);
        btnAlterarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarEmailActionPerformed(evt);
            }
        });
        jPanel2.add(btnAlterarEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 270, 25, 25));

        btnAceitoEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/correct.png"))); // NOI18N
        btnAceitoEmail.setBorder(null);
        btnAceitoEmail.setBorderPainted(false);
        btnAceitoEmail.setContentAreaFilled(false);
        btnAceitoEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceitoEmail.setFocusable(false);
        btnAceitoEmail.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnAceitoEmail.setVisible(false);
        btnAceitoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceitoEmailActionPerformed(evt);
            }
        });
        jPanel2.add(btnAceitoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 270, 25, 25));

        btnCancelarEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/close.png"))); // NOI18N
        btnCancelarEmail.setBorder(null);
        btnCancelarEmail.setBorderPainted(false);
        btnCancelarEmail.setContentAreaFilled(false);
        btnCancelarEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarEmail.setFocusable(false);
        btnCancelarEmail.setVisible(false);
        btnCancelarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEmailActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelarEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 270, 25, 25));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Celular:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 388, -1, -1));

        btnAlterarCelular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/pencil.png"))); // NOI18N
        btnAlterarCelular.setBorder(null);
        btnAlterarCelular.setBorderPainted(false);
        btnAlterarCelular.setContentAreaFilled(false);
        btnAlterarCelular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarCelular.setFocusable(false);
        btnAlterarCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarCelularActionPerformed(evt);
            }
        });
        jPanel2.add(btnAlterarCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 388, 25, 25));

        btnAceitarCelular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/correct.png"))); // NOI18N
        btnAceitarCelular.setBorder(null);
        btnAceitarCelular.setBorderPainted(false);
        btnAceitarCelular.setContentAreaFilled(false);
        btnAceitarCelular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceitarCelular.setVisible(false);
        btnAceitarCelular.setFocusable(false);
        btnAceitarCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceitarCelularActionPerformed(evt);
            }
        });
        jPanel2.add(btnAceitarCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 388, 25, 25));

        btnCancelarCelular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/close.png"))); // NOI18N
        btnCancelarCelular.setBorder(null);
        btnCancelarCelular.setBorderPainted(false);
        btnCancelarCelular.setContentAreaFilled(false);
        btnCancelarCelular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarCelular.setFocusable(false);
        btnCancelarCelular.setVisible(false);
        btnCancelarCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCelularActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelarCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 388, 25, 25));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Senha:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 446, -1, -1));

        btnAceitarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/correct.png"))); // NOI18N
        btnAceitarSenha.setBorder(null);
        btnAceitarSenha.setBorderPainted(false);
        btnAceitarSenha.setContentAreaFilled(false);
        btnAceitarSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceitarSenha.setVisible(false);
        btnAceitarSenha.setFocusable(false);
        btnAceitarSenha.setVisible(false);
        btnAceitarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceitarSenhaActionPerformed(evt);
            }
        });
        jPanel2.add(btnAceitarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 580, 25, 25));

        btnCancelarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/close.png"))); // NOI18N
        btnCancelarSenha.setBorder(null);
        btnCancelarSenha.setBorderPainted(false);
        btnCancelarSenha.setContentAreaFilled(false);
        btnCancelarSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarSenha.setVisible(false);
        btnCancelarSenha.setFocusable(false);
        btnCancelarSenha.setVisible(false);
        btnCancelarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarSenhaActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, 25, 25));

        btnAlterarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/pencil.png"))); // NOI18N
        btnAlterarSenha.setBorder(null);
        btnAlterarSenha.setBorderPainted(false);
        btnAlterarSenha.setContentAreaFilled(false);
        btnAlterarSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarSenha.setFocusable(false);
        btnAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarSenhaActionPerformed(evt);
            }
        });
        jPanel2.add(btnAlterarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 446, 25, 25));

        btnConfigEncerrar.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btnConfigEncerrar.setForeground(new java.awt.Color(255, 51, 51));
        btnConfigEncerrar.setText("Encerrar Conta");
        btnConfigEncerrar.setBorder(null);
        btnConfigEncerrar.setBorderPainted(false);
        btnConfigEncerrar.setContentAreaFilled(false);
        btnConfigEncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfigEncerrar.setFocusable(false);
        btnConfigEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigEncerrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnConfigEncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, -1, -1));

        lblConfirmarSenha.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblConfirmarSenha.setForeground(new java.awt.Color(0, 0, 0));
        lblConfirmarSenha.setText("Confirmar Senha");
        lblConfirmarSenha.setVisible(false);
        jPanel2.add(lblConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 504, 118, -1));

        btnSobreNos.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btnSobreNos.setForeground(new java.awt.Color(0, 0, 0));
        btnSobreNos.setText("Sobre Nós");
        btnSobreNos.setBorder(null);
        btnSobreNos.setBorderPainted(false);
        btnSobreNos.setContentAreaFilled(false);
        btnSobreNos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSobreNos.setFocusable(false);
        jPanel2.add(btnSobreNos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        btnSuporte.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btnSuporte.setForeground(new java.awt.Color(0, 0, 0));
        btnSuporte.setText("Suporte ao Cliente");
        btnSuporte.setBorder(null);
        btnSuporte.setBorderPainted(false);
        btnSuporte.setContentAreaFilled(false);
        btnSuporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuporte.setFocusTraversalPolicyProvider(true);
        btnSuporte.setFocusable(false);
        btnSuporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuporteActionPerformed(evt);
            }
        });
        jPanel2.add(btnSuporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/BGCONFIG.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, -1, -1));
        jPanel2.add(btnAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 30, 40, 40));

        txtConfigCelular.setForeground(new java.awt.Color(255, 255, 255));
        txtConfigCelular.setEnabled(false);
        txtConfigCelular.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jPanel2.add(txtConfigCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 388, 319, 30));

        txtConfigNome.setForeground(new java.awt.Color(255, 255, 255));
        txtConfigNome.setEnabled(false);
        txtConfigNome.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jPanel2.add(txtConfigNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 214, 319, 30));

        txtConfigEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtConfigEmail.setEnabled(false);
        txtConfigEmail.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jPanel2.add(txtConfigEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 272, 319, 30));

        txtConfigEndereco.setForeground(new java.awt.Color(255, 255, 255));
        txtConfigEndereco.setEnabled(false);
        txtConfigEndereco.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jPanel2.add(txtConfigEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 330, 319, 30));

        txtConfigConfirmar.setVisible(false);
        txtConfigConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        txtConfigConfirmar.setEnabled(false);
        txtConfigConfirmar.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jPanel2.add(txtConfigConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 534, 319, 30));

        txtConfigSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtConfigSenha.setEnabled(false);
        txtConfigSenha.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jPanel2.add(txtConfigSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 446, 319, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 1210, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //CAMPO NOME
    private void btnAlterarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarNomeActionPerformed
        btnAceitoNome.setVisible(true);
        btnCancelarNome.setVisible(true);
        txtConfigNome.setEnabled(true);
    }//GEN-LAST:event_btnAlterarNomeActionPerformed

    private void btnAceitoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceitoNomeActionPerformed
        ConfigDAO objConfigDAO = new ConfigDAO();
        objConfigDAO.atualizarNome();
    }//GEN-LAST:event_btnAceitoNomeActionPerformed

    private void btnCancelarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarNomeActionPerformed
        btnAceitoNome.setVisible(false);
        btnCancelarNome.setVisible(false);
        txtConfigNome.setEnabled(false);

        ConfigDAO objConfigDAO = new ConfigDAO();
        objConfigDAO.dados();
    }//GEN-LAST:event_btnCancelarNomeActionPerformed

    private void btnAlterarEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarEnderecoActionPerformed
        btnAceitarEndereco.setVisible(true);
        btnCancelarEndereco.setVisible(true);
        txtConfigEndereco.setEnabled(true);
    }//GEN-LAST:event_btnAlterarEnderecoActionPerformed

    private void btnHomeLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeLogoActionPerformed
        frmHomeView objHomeView = new frmHomeView();
        objHomeView.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnHomeLogoActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        frmHomeView objHomeView = new frmHomeView();
        objHomeView.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed

    }//GEN-LAST:event_btnConfigActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        frmLoginView objLoginView = new frmLoginView();
        objLoginView.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnADMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADMActionPerformed
        frmClientesView objClienteView = new frmClientesView();
        objClienteView.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnADMActionPerformed

    private void btnAlterarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarEmailActionPerformed
        btnAceitoEmail.setVisible(true);
        btnCancelarEmail.setVisible(true);
        txtConfigEmail.setEnabled(true);
    }//GEN-LAST:event_btnAlterarEmailActionPerformed

    private void btnAceitoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceitoEmailActionPerformed
        ConfigDAO objConfigDAO = new ConfigDAO();
        objConfigDAO.atualizarEmail();
    }//GEN-LAST:event_btnAceitoEmailActionPerformed

    private void btnCancelarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEmailActionPerformed
        btnAceitoEmail.setVisible(false);
        btnCancelarEmail.setVisible(false);
        txtConfigEmail.setEnabled(false);

        ConfigDAO objConfigDAO = new ConfigDAO();
        objConfigDAO.dados();
    }//GEN-LAST:event_btnCancelarEmailActionPerformed

    private void btnAceitarEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceitarEnderecoActionPerformed
        ConfigDAO objConfigDAO = new ConfigDAO();
        objConfigDAO.atualizarEndereco();
    }//GEN-LAST:event_btnAceitarEnderecoActionPerformed

    private void btnCancelarEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEnderecoActionPerformed
        btnAceitarEndereco.setVisible(false);
        btnCancelarEndereco.setVisible(false);
        txtConfigEndereco.setEnabled(false);

        ConfigDAO objConfigDAO = new ConfigDAO();
        objConfigDAO.dados();
    }//GEN-LAST:event_btnCancelarEnderecoActionPerformed

    private void btnAlterarCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarCelularActionPerformed
        btnAceitarCelular.setVisible(true);
        btnCancelarCelular.setVisible(true);
        txtConfigCelular.setEnabled(true);
    }//GEN-LAST:event_btnAlterarCelularActionPerformed

    private void btnCancelarCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCelularActionPerformed
        btnAceitarCelular.setVisible(false);
        btnCancelarCelular.setVisible(false);
        txtConfigCelular.setEnabled(false);

        ConfigDAO objConfigDAO = new ConfigDAO();
        objConfigDAO.dados();
    }//GEN-LAST:event_btnCancelarCelularActionPerformed

    private void btnAceitarCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceitarCelularActionPerformed
        ConfigDAO objConfigDAO = new ConfigDAO();
        objConfigDAO.atualizarCelular();
    }//GEN-LAST:event_btnAceitarCelularActionPerformed

    private void btnAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarSenhaActionPerformed
        lblConfirmarSenha.setVisible(true);
        txtConfigConfirmar.setVisible(true);
        btnAceitarSenha.setVisible(true);
        btnCancelarSenha.setVisible(true);
        txtConfigConfirmar.setEnabled(true);
    }//GEN-LAST:event_btnAlterarSenhaActionPerformed

    private void btnCancelarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarSenhaActionPerformed
        lblConfirmarSenha.setVisible(false);
        txtConfigConfirmar.setVisible(false);
        btnAceitarSenha.setVisible(false);
        btnCancelarSenha.setVisible(false);
        txtConfigConfirmar.setEnabled(false);

        frmConfigView.txtConfigConfirmar.setText("");
        frmConfigView.txtConfigConfirmar.setText("");
    }//GEN-LAST:event_btnCancelarSenhaActionPerformed

    private void btnAceitarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceitarSenhaActionPerformed
        ConfigDAO objConfigDAO = new ConfigDAO();
        objConfigDAO.atualizarSenha();
    }//GEN-LAST:event_btnAceitarSenhaActionPerformed

    private void btnConfigEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigEncerrarActionPerformed
        ConfigDAO objConfigDAO = new ConfigDAO();
        boolean encerrarConta = objConfigDAO.encerrarConta();

        if (encerrarConta == true) {
            frmLoginView objLoginView = new frmLoginView();
            objLoginView.setVisible(true);

            this.dispose();
        }
    }//GEN-LAST:event_btnConfigEncerrarActionPerformed

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

    private void btnSuporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuporteActionPerformed
        frmSuporteView objSuporteView = new frmSuporteView();
        objSuporteView.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnSuporteActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConfigView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmConfigView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraLateral;
    private javax.swing.JPanel LinhaLateral;
    public static javax.swing.JButton btnADM;
    public static javax.swing.JButton btnAceitarCelular;
    public static javax.swing.JButton btnAceitarEndereco;
    public static javax.swing.JButton btnAceitarSenha;
    public static javax.swing.JButton btnAceitoEmail;
    public static javax.swing.JButton btnAceitoNome;
    public static javax.swing.JButton btnAlterarCelular;
    public static javax.swing.JButton btnAlterarEmail;
    public static javax.swing.JButton btnAlterarEndereco;
    public static javax.swing.JButton btnAlterarNome;
    public static javax.swing.JButton btnAlterarSenha;
    public static final Assets.Component.ButtonEntrar btnAvatar = new Assets.Component.ButtonEntrar();
    public static javax.swing.JButton btnCancelarCelular;
    public static javax.swing.JButton btnCancelarEmail;
    public static javax.swing.JButton btnCancelarEndereco;
    public static javax.swing.JButton btnCancelarNome;
    public static javax.swing.JButton btnCancelarSenha;
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnConfigEncerrar;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JLabel btnExtrato;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnHomeLogo;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnServices;
    private javax.swing.JButton btnSobreNos;
    private javax.swing.JButton btnSuporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel lblConfirmarSenha;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    public static Assets.Component.TextFieldConfig txtConfigCelular;
    public static Assets.Component.TextFieldConfigSenha txtConfigConfirmar;
    public static Assets.Component.TextFieldConfig txtConfigEmail;
    public static Assets.Component.TextFieldConfig txtConfigEndereco;
    public static Assets.Component.TextFieldConfig txtConfigNome;
    public static Assets.Component.TextFieldConfigSenha txtConfigSenha;
    // End of variables declaration//GEN-END:variables
    private void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LogoIcon.png")));
    }
}
