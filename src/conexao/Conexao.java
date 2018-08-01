/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author selmini
 */
public class Conexao {
    private static Conexao conexao;
    private static String url = "jdbc:oracle:thin:@localhost:1521:vitor2db";
    private static String login = "vitor_aquiles";
    private static String senha = "306514";
    
    private Conexao() {        
    }
    
    public static Conexao getInstance() {
        if(conexao == null) {
            conexao = new Conexao();
        }
        return conexao;
    }
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        return DriverManager.getConnection(url, login, senha);
    }
}



