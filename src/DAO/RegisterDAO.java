package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class RegisterDAO {

    public boolean registrarUsuario(UsuarioDTO usuarioDTO) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = ConexaoDAO.obterConexao();

            if (verificarEmail(usuarioDTO).next()) {
                JOptionPane.showMessageDialog(null, "Email já existe, use outro email!");
                return false;
            } else if (verificarCPF(usuarioDTO).next()) {
                JOptionPane.showMessageDialog(null, "CPF já cadastrado, use outro CPF!");
                return false;
            } else if (verificarCelular(usuarioDTO).next()) {
                JOptionPane.showMessageDialog(null, "Celular já existe, coloque outro celular!");
                return false;
            } else {
                String sql = "INSERT INTO tbusuario (perfil, nome, email, cpf, celular, endereco, numero, complemento, cep, senha) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, "user");
                stmt.setString(2, usuarioDTO.getNome());
                stmt.setString(3, usuarioDTO.getEmail());
                stmt.setString(4, usuarioDTO.getCpf());
                stmt.setString(5, usuarioDTO.getCelular());
                stmt.setString(6, usuarioDTO.getEndereco());
                stmt.setString(7, usuarioDTO.getNumero());
                stmt.setString(8, usuarioDTO.getComplemento());
                stmt.setString(9, usuarioDTO.getCep());
                stmt.setString(10, usuarioDTO.getSenha());

                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
                return true;
            }
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "registrarUsuario: " + error);
        } finally {
            ConexaoDAO.fecharConexao(conn, stmt);
        }
        return false;
    }

    public ResultSet verificarEmail(UsuarioDTO usuarioDTO) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = ConexaoDAO.obterConexao();

            String sql = "SELECT * FROM tbusuario WHERE email = ?";

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuarioDTO.getEmail());

            ResultSet rsEmail = stmt.executeQuery();

            return rsEmail;
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "verificarEmail: " + error);
            return null;
        }
    }

    public ResultSet verificarCPF(UsuarioDTO usuarioDTO) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = ConexaoDAO.obterConexao();

            String sql = "SELECT * FROM tbusuario WHERE cpf = ?";

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuarioDTO.getCpf());

            ResultSet rsCpf = stmt.executeQuery();

            return rsCpf;
        } catch (SQLException error) {
            error.printStackTrace();
            return null;
        }
    }

    public ResultSet verificarCelular(UsuarioDTO usuarioDTO) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = ConexaoDAO.obterConexao();

            String sql = "SELECT * FROM tbusuario WHERE celular = ?";

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuarioDTO.getCelular());

            ResultSet rsCelular = stmt.executeQuery();

            return rsCelular;
        } catch (SQLException error) {
            error.printStackTrace();
            return null;
        }
    }
}
