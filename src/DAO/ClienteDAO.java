package DAO;

import VIEW.*;
import java.sql.*;
import javax.swing.JOptionPane;
import VIEW.frmHomeView;

public class ClienteDAO {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pstm = null;

    public boolean verificaoADM() {
        conn = ConexaoDAO.obterConexao();
        String sql = "SELECT * FROM tbusuario WHERE iduser = ?";

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, frmHomeView.btnAvatar.getName());
            rs = pstm.executeQuery();

            if (rs.next()) {
                String perfil = rs.getString(2);

                if (perfil.equals("user")) {
                    return false;
                } else if (perfil.equals("admin") || perfil.equals("funcionario")) {
                    return true;
                }
            }
        } catch (SQLException e) {
        }
        return false;
    }

    public void clienteCadastrado() {
        conn = ConexaoDAO.obterConexao();
        String sql = "SELECT COUNT(iduser) FROM tbusuario WHERE perfil = 'user'";

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            if (rs.next()) {
                String num = Integer.toString(rs.getInt(1));
                frmClientesView.lblDashCliCad.setText(num);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void funcionarioCadastrado() {
        conn = ConexaoDAO.obterConexao();
        String sql = "SELECT COUNT(iduser) FROM tbusuario WHERE perfil = 'funcionario'";

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            if (rs.next()) {
                String num = Integer.toString(rs.getInt(1));
                frmClientesView.lblDashFuncCad.setText(num);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void Consulta() {
        conn = ConexaoDAO.obterConexao();
        String sql = "SELECT * FROM tbusuario WHERE iduser = ?";

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, frmClientesView.txtConsulta.getText());
            rs = pstm.executeQuery();

            if (rs.next()) {
                frmClientesView.txtCEP.setText(rs.getString(10));
                frmClientesView.txtCPF.setText(rs.getString(5));
                frmClientesView.txtCelular.setText(rs.getString(6));
                frmClientesView.txtComplemento.setText(rs.getString(9));
                frmClientesView.txtEmail.setText(rs.getString(4));
                frmClientesView.txtEndereco.setText(rs.getString(7));
                frmClientesView.txtID.setText(rs.getString(1));
                frmClientesView.txtNumero.setText(rs.getString(8));
                frmClientesView.txtNome.setText(rs.getString(3));
                frmClientesView.txtPerfil.setText(rs.getString(2));
            } else {
                JOptionPane.showMessageDialog(null, "Usuário náo existe ou digite apenas números.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void Limpar() {
        frmClientesView.txtCEP.setText("");
        frmClientesView.txtCPF.setText("");
        frmClientesView.txtCelular.setText("");
        frmClientesView.txtComplemento.setText("");
        frmClientesView.txtEmail.setText("");
        frmClientesView.txtEndereco.setText("");
        frmClientesView.txtID.setText("");
        frmClientesView.txtNumero.setText("");
        frmClientesView.txtNome.setText("");
        frmClientesView.txtPerfil.setText("");
    }
}