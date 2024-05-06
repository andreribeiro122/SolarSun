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
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + error);
            return null;
        }
    }
    
    public ResultSet verificarEmail(UsuarioDTO objUsuarioDTO) {
        conn = new ConexaoDAO().conectaBD();
        
        try {
            String sql = "select * from clientes where email = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getEmail());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "verificarEmail." + error);
            return null;
        }
    }
    
    public ResultSet verificarCPF(UsuarioDTO objUsuarioDTO) {
        conn = new ConexaoDAO().conectaBD();
        
        try {
            String sql = "select * from clientes where cpf = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getCpf());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "verificarCPF." + error);
            return null;
        }
    }
    
    public ResultSet verificarCelular(UsuarioDTO objUsuarioDTO) {
        conn = new ConexaoDAO().conectaBD();
        
        try {
            String sql = "select * from clientes where celular = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getCelular());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "verificarCelular" + error);
            return null;
        }
    }
    public void registroUsuario(UsuarioDTO objUsuarioDTO) {
        conn = new ConexaoDAO().conectaBD();
       
        String sql = "insert into clientes (nome, email, cpf, celular, endereco, numero, complemento, cep, senha) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getNome());
            pstm.setString(2, objUsuarioDTO.getEmail());
            pstm.setString(3, objUsuarioDTO.getCpf());
            pstm.setString(4, objUsuarioDTO.getCelular());
            pstm.setString(5, objUsuarioDTO.getEndereco());
            pstm.setString(6, objUsuarioDTO.getNumero());
            pstm.setString(7, objUsuarioDTO.getComplemento());
            pstm.setString(8, objUsuarioDTO.getCep());
            pstm.setString(9, objUsuarioDTO.getSenha());
            
            pstm.execute();
            pstm.close();
        } catch (SQLException error) {
            JOptionPane.showConfirmDialog(null, "UsuarioDAO" + error);
        }
    }
}
