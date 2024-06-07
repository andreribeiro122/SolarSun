package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ConexaoDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/solarsun";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    
    public static Connection obterConexao() {
        Connection conexao = null;
        try {
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "obterConexao: " + error);
        }
        return conexao;
    }
    
    public static void fecharConexao(Connection conn, PreparedStatement stmt) {
        try {
            if (stmt != null) {
                stmt.close();
            }
            
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException  error) {
            JOptionPane.showMessageDialog(null, "fecharConexao: " + error);
        }
    }
}
