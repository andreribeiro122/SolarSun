package DAO;

import java.sql.*;
import javax.swing.JOptionPane;
import VIEW.frmHomeView;
import VIEW.frmLoginView;

public class LoginDAO {
    
    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    
    public boolean logar() {
        String sql = "SELECT * FROM tbusuario WHERE email = ? AND senha = ?";
        
        conn = ConexaoDAO.obterConexao();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, frmLoginView.txtEmail.getText());
            String senha = new String(frmLoginView.txtSenha.getPassword());
            pstm.setString(2, senha);
            rs = pstm.executeQuery();
            
            if (rs.next()) {
                String perfil = rs.getString(2);
                String idUser = Integer.toString(rs.getInt(1));
                String nome = rs.getString(3);
                if (perfil.equals("user")) {
                    frmHomeView objHomeView = new frmHomeView();
                    objHomeView.setVisible(true);
                    frmHomeView.btnAvatar.setName(idUser);
                    frmHomeView.lblHomeNome.setText(nome);
                    frmHomeView.btnADM.setVisible(false);
                    
                    return true;
                } else if (perfil.equals("admin") || perfil.equals("funcionario")) {
                    frmHomeView objHomeView = new frmHomeView();
                    objHomeView.setVisible(true);
                    frmHomeView.btnAvatar.setName(idUser);
                    frmHomeView.lblHomeNome.setText(nome);
                    frmHomeView.btnADM.setVisible(true);

                    return true;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Email ou senha inválidos", "Erro nas Credenciais", 0);
            }
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "logar: " + error);
        }
        return false;
    }
}
