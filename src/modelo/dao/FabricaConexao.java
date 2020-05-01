package modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Padrão Factory (padrão de criação)
 */

public class FabricaConexao{

    public static Connection getConexao(){
        // Tentar executar os comandos
        try {

            // Registrrar o driver do SQL server
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Conectando ao banco
            Connection conexao = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=agenda;integratedSecurity=true;");

            return conexao;

        // captura a exceção
        } catch (ClassNotFoundException e){
            System.out.println("Driver não encontrado.");
            e.printStackTrace();
            return null;
        } catch (SQLException e){
            System.out.println("Impossível conectar ao banco.");
            e.printStackTrace();
            return null;
        }
    }
}
