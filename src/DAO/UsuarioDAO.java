package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection conn;

    public ResultSet autenticacaoUsuario(UsuarioDTO objUsuarioDTO) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select * from clientes where email = ? and senha = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getEmail());
            pstm.setString(2, objUsuarioDTO.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "UsuaioDAO: " + error);
            return null;
        }
    }
    
    public void registroUsuario(UsuarioDTO objUsuarioDTO) {
        conn = new ConexaoDAO().conectaBD();
        
        String sql = "insert into clientes (nome, email, senha, cpf) values (?, ?, ?, ?)";
        
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getNome());
            pstm.setString(2, objUsuarioDTO.getEmail());
            pstm.setString(3, objUsuarioDTO.getSenha());
            pstm.setString(4, objUsuarioDTO.getCPF());
            
            pstm.execute();
            pstm.close();
        } catch (Exception error) {
            JOptionPane.showConfirmDialog(null, "UsuarioDAO" + error);
        }
    }
}
