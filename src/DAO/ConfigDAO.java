package DAO;

import VIEW.frmConfigView;
import VIEW.frmHomeView;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class ConfigDAO {

    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;

    public void dados() {
        conn = ConexaoDAO.obterConexao();

        String sql = "SELECT * FROM tbusuario WHERE iduser = ?";

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, frmConfigView.btnAvatar.getName());
            rs = pstm.executeQuery();

            if (rs.next()) {
                frmConfigView.txtConfigNome.setText(rs.getString(3));
                frmConfigView.txtConfigEmail.setText(rs.getString(4));
                frmConfigView.txtConfigEndereco.setText(rs.getString(7));
                frmConfigView.txtConfigCelular.setText(rs.getString(6));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //COMEÇA CAMPO NOME
    public void atualizarNome() {
        if (frmConfigView.txtConfigNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo não pode estar vazio", "Erro no Campo", 0);
        } else {
            conn = ConexaoDAO.obterConexao();
            String sql = "UPDATE tbusuario SET nome = ? WHERE iduser = ?";

            try {
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, frmConfigView.txtConfigNome.getText());
                pstm.setString(2, frmConfigView.btnAvatar.getName());
                pstm.execute();

                frmHomeView.lblHomeNome.setText(frmConfigView.txtConfigNome.getText());

                frmConfigView.btnAceitoNome.setVisible(false);
                frmConfigView.btnCancelarNome.setVisible(false);
                frmConfigView.txtConfigNome.setEnabled(false);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    //TERMINA CAMPO NOME

    //COMEÇA CAMPO EMAIL
    private static final String EMAIL_PATTERN
            = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);

    public static boolean validarEmail(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public void atualizarEmail() {
        boolean validarEmail = validarEmail(frmConfigView.txtConfigEmail.getText());

        if (validarEmail == true) {
            if (frmConfigView.txtConfigEmail.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "O campo não pode estar vazio", "Erro no Campo", 0);
            } else {
                conn = ConexaoDAO.obterConexao();
                String sql = "SELECT email FROM tbusuario WHERE email = ?";

                try {
                    pstm = conn.prepareStatement(sql);
                    pstm.setString(1, frmConfigView.txtConfigEmail.getText());
                    rs = pstm.executeQuery();

                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Email já cadastrado, por favor coloque outro.", "Erro no Campo", 0);
                    } else {
                        try {
                            String sql2 = "UPDATE tbusuario SET email = ? WHERE iduser = ?";
                            pstm = conn.prepareStatement(sql2);
                            pstm.setString(1, frmConfigView.txtConfigEmail.getText());
                            pstm.setString(2, frmConfigView.btnAvatar.getName());
                            pstm.execute();

                            frmConfigView.btnAceitoEmail.setVisible(false);
                            frmConfigView.btnCancelarEmail.setVisible(false);
                            frmConfigView.txtConfigEmail.setEnabled(false);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor coloque um email válido");
        }
    }
    //TERMINA CAMPO EMAIL

    //COMEÇA CAMPO ENDEREÇO
    public void atualizarEndereco() {
        if (frmConfigView.txtConfigEndereco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo não pode estar vazio", "Erro no Campo", 0);
        } else {
            conn = ConexaoDAO.obterConexao();
            String sql = "UPDATE tbusuario SET endereco = ? WHERE iduser = ?";

            try {
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, frmConfigView.txtConfigEndereco.getText());
                pstm.setString(2, frmConfigView.btnAvatar.getName());
                pstm.execute();

                frmConfigView.btnAceitarEndereco.setVisible(false);
                frmConfigView.btnCancelarEndereco.setVisible(false);
                frmConfigView.txtConfigEndereco.setEnabled(false);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    //TERMINA CAMPO ENDEREÇO

    //COMEÇA CAMPO CELULAR
    public void atualizarCelular() {
        if (frmConfigView.txtConfigCelular.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo não pode estar vazio.", "Erro no Campo", 0);
        } else {
            if (frmConfigView.txtConfigCelular.getText().matches("^[0-9]+$")) {
                if (frmConfigView.txtConfigCelular.getText().length() == 11) {
                    conn = ConexaoDAO.obterConexao();
                    String sql = "UPDATE tbusuario SET celular = ?  WHERE iduser = ?";

                    try {
                        pstm = conn.prepareStatement(sql);
                        pstm.setString(1, frmConfigView.txtConfigCelular.getText());
                        pstm.setString(2, frmConfigView.btnAvatar.getName());
                        pstm.execute();

                        frmConfigView.btnAceitarCelular.setVisible(false);
                        frmConfigView.btnCancelarCelular.setVisible(false);
                        frmConfigView.txtConfigCelular.setEnabled(false);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor insira um número de celular válido.", "Erro no Campo", 0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor insira apenas números neste campo.", "Erro no Campo", 0);
            }
        }
    }
    //TERMINA CAMPO CELULAR

    //COMEÇA CAMPO SENHA
    public void atualizarSenha() {
        String senha = new String(frmConfigView.txtConfigSenha.getPassword());
        String confirmarSenha = new String(frmConfigView.txtConfigConfirmar.getPassword());

        if (senha.isEmpty() || confirmarSenha.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo não pode estar vazio.", "Erro no Campo", 0);
        } else if (senha.length() > 15 || confirmarSenha.length() > 15) {
            JOptionPane.showMessageDialog(null, "A senha deve ter no máximo 15 caracteres.", "Erro no Campo", 0);
        } else if (senha.equals(confirmarSenha)) {
            conn = ConexaoDAO.obterConexao();
            String sql = "UPDATE tbusuario SET senha = ? WHERE iduser = ?";

            try {
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, senha);
                pstm.setString(2, frmConfigView.btnAvatar.getName());
                pstm.execute();

                frmConfigView.lblConfirmarSenha.setVisible(false);
                frmConfigView.txtConfigConfirmar.setVisible(false);
                frmConfigView.btnAceitarSenha.setVisible(false);
                frmConfigView.btnCancelarSenha.setVisible(false);
                frmConfigView.txtConfigSenha.setEnabled(false);

                frmConfigView.txtConfigSenha.setText("");
                frmConfigView.txtConfigConfirmar.setText("");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Os dois campos devem ser iguais.", "Erro no Campo", 0);
        }
    }
    //TERMINA CAMPO SENHA

    //COMEÇA ENCERRAR CONTA
    public boolean encerrarConta() {
        conn = ConexaoDAO.obterConexao();
        String sql = "DELETE FROM tbusuario WHERE iduser = ?;";

        try {
            int confirmar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja deletar sua conta?", "Atenção", JOptionPane.YES_NO_OPTION);

            if (confirmar == JOptionPane.YES_OPTION) {
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, frmConfigView.btnAvatar.getName());
                pstm.execute();
                
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    //TERMINA ENCERRAR CONTA
}