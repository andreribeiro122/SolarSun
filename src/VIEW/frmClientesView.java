package VIEW;

import DAO.ClienteDAO;
import java.awt.Toolkit;

public class frmClientesView extends javax.swing.JFrame {

    public frmClientesView() {
        initComponents();

        Seticon();

        ClienteDAO objClienteDAO = new ClienteDAO();
        objClienteDAO.clienteCadastrado();
        objClienteDAO.funcionarioCadastrado();
        
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
        jPanel1 = new javax.swing.JPanel();
        lblADMTitle = new javax.swing.JLabel();
        lblCliCad = new javax.swing.JLabel();
        lblFuncCad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtConsulta = new Assets.Component.TextFieldConfig();
        txtPerfil = new Assets.Component.TextFieldConfig();
        txtEmail = new Assets.Component.TextFieldConfig();
        txtCelular = new Assets.Component.TextFieldConfig();
        txtNumero = new Assets.Component.TextFieldConfig();
        txtCEP = new Assets.Component.TextFieldConfig();
        txtID = new Assets.Component.TextFieldConfig();
        txtComplemento = new Assets.Component.TextFieldConfig();
        txtEndereco = new Assets.Component.TextFieldConfig();
        txtCPF = new Assets.Component.TextFieldConfig();
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
        btnSobreNos = new javax.swing.JButton();
        btnSuporte = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnAvatar = new Assets.Component.ButtonEntrar();
        txtNome = new Assets.Component.TextFieldConfig();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SolarSun - Dashboard Funcionario");
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
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblADMTitle.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        lblADMTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblADMTitle.setText("DASHBOARD FUNCIONÁRIO SOLARSUN");
        jPanel1.add(lblADMTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        lblCliCad.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblCliCad.setForeground(new java.awt.Color(0, 0, 0));
        lblCliCad.setText("Clientes Cadastrados:");
        jPanel1.add(lblCliCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        lblFuncCad.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblFuncCad.setForeground(new java.awt.Color(0, 0, 0));
        lblFuncCad.setText("Funcionários Cadastrados:");
        jPanel1.add(lblFuncCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        lblDashCliCad.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblDashCliCad.setForeground(new java.awt.Color(0, 0, 0));
        lblDashCliCad.setText("1");
        jPanel1.add(lblDashCliCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 180, -1, -1));

        lblDashFuncCad.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblDashFuncCad.setForeground(new java.awt.Color(0, 0, 0));
        lblDashFuncCad.setText("1");
        jPanel1.add(lblDashFuncCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Pesquisar Usuário");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID/CPF");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        txtConsulta.setForeground(new java.awt.Color(255, 255, 255));
        txtConsulta.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtConsulta.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        txtConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultaActionPerformed(evt);
            }
        });
        jPanel1.add(txtConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 125, 35));

        txtPerfil.setEditable(false);
        txtPerfil.setForeground(new java.awt.Color(255, 255, 255));
        txtPerfil.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtPerfil.setEnabled(false);
        txtPerfil.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jPanel1.add(txtPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 250, 35));

        txtEmail.setEditable(false);
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtEmail.setEnabled(false);
        txtEmail.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 250, 35));

        txtCelular.setEditable(false);
        txtCelular.setForeground(new java.awt.Color(255, 255, 255));
        txtCelular.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtCelular.setEnabled(false);
        txtCelular.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 250, 35));

        txtNumero.setEditable(false);
        txtNumero.setForeground(new java.awt.Color(255, 255, 255));
        txtNumero.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtNumero.setEnabled(false);
        txtNumero.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jPanel1.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 250, 35));

        txtCEP.setEditable(false);
        txtCEP.setForeground(new java.awt.Color(255, 255, 255));
        txtCEP.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtCEP.setEnabled(false);
        txtCEP.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jPanel1.add(txtCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 570, 250, 35));

        txtID.setEditable(false);
        txtID.setForeground(new java.awt.Color(255, 255, 255));
        txtID.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtID.setEnabled(false);
        txtID.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 570, 250, 35));

        txtComplemento.setEditable(false);
        txtComplemento.setForeground(new java.awt.Color(255, 255, 255));
        txtComplemento.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtComplemento.setEnabled(false);
        txtComplemento.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jPanel1.add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 480, 250, 35));

        txtEndereco.setEditable(false);
        txtEndereco.setForeground(new java.awt.Color(255, 255, 255));
        txtEndereco.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtEndereco.setEnabled(false);
        txtEndereco.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jPanel1.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 390, 250, 35));

        txtCPF.setEditable(false);
        txtCPF.setForeground(new java.awt.Color(255, 255, 255));
        txtCPF.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtCPF.setEnabled(false);
        txtCPF.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jPanel1.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, 250, 35));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Perfil");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Email");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Celular");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Número");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, -1, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("CEP");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, -1, -1));

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nome");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, -1, -1));

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("CPF");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Endereço");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, -1, -1));

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Complemento");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 460, -1, -1));

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("ID");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, -1, -1));

        btnSobreNos.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btnSobreNos.setForeground(new java.awt.Color(0, 0, 0));
        btnSobreNos.setText("Sobre Nós");
        btnSobreNos.setBorder(null);
        btnSobreNos.setBorderPainted(false);
        btnSobreNos.setContentAreaFilled(false);
        btnSobreNos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnSobreNos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        btnSuporte.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btnSuporte.setForeground(new java.awt.Color(0, 0, 0));
        btnSuporte.setText("Suporte ao Cliente");
        btnSuporte.setBorder(null);
        btnSuporte.setBorderPainted(false);
        btnSuporte.setContentAreaFilled(false);
        btnSuporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuporteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSuporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        btnConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/LUPA.png"))); // NOI18N
        btnConsulta.setBorder(null);
        btnConsulta.setBorderPainted(false);
        btnConsulta.setContentAreaFilled(false);
        btnConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsulta.setFocusable(false);
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 366, -1, -1));

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/BORRACHA.png"))); // NOI18N
        btnLimpar.setBorder(null);
        btnLimpar.setBorderPainted(false);
        btnLimpar.setContentAreaFilled(false);
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.setFocusable(false);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 366, -1, -1));
        jPanel1.add(btnAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 30, 40, 40));

        txtNome.setEditable(false);
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtNome.setEnabled(false);
        txtNome.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 210, 250, 35));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/PIZZA.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 1210, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        
    }//GEN-LAST:event_btnADMActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        ClienteDAO objClienteDAO = new ClienteDAO();
        objClienteDAO.Consulta();
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void txtConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultaActionPerformed

    }//GEN-LAST:event_txtConsultaActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        ClienteDAO objClienteDAO = new ClienteDAO();
        objClienteDAO.Limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

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
    private javax.swing.JPanel BarraLateral;
    private javax.swing.JPanel LinhaLateral;
    public static javax.swing.JButton btnADM;
    private Assets.Component.ButtonEntrar btnAvatar;
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JLabel btnExtrato;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnHomeLogo;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnServices;
    private javax.swing.JButton btnSobreNos;
    private javax.swing.JButton btnSuporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblADMTitle;
    private javax.swing.JLabel lblCliCad;
    public static final javax.swing.JLabel lblDashCliCad = new javax.swing.JLabel();
    public static final javax.swing.JLabel lblDashFuncCad = new javax.swing.JLabel();
    private javax.swing.JLabel lblFuncCad;
    public static Assets.Component.TextFieldConfig txtCEP;
    public static Assets.Component.TextFieldConfig txtCPF;
    public static Assets.Component.TextFieldConfig txtCelular;
    public static Assets.Component.TextFieldConfig txtComplemento;
    public static Assets.Component.TextFieldConfig txtConsulta;
    public static Assets.Component.TextFieldConfig txtEmail;
    public static Assets.Component.TextFieldConfig txtEndereco;
    public static Assets.Component.TextFieldConfig txtID;
    public static Assets.Component.TextFieldConfig txtNome;
    public static Assets.Component.TextFieldConfig txtNumero;
    public static Assets.Component.TextFieldConfig txtPerfil;
    // End of variables declaration//GEN-END:variables
    private void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LogoIcon.png")));
    }
}
