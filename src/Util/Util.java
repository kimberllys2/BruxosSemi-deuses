/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author info206
 */
public class Util {
    private String sql;
    public static Connection conecta() throws SQLException{
                      Connection conexao = null;

        String url = "jdbc:mysql://localhost/petshop";  //Nome da base de dados
        String user = "root"; //nome do usuário do MySQL
        String password = "123456"; //senha do MySQL
        try{
            conexao = DriverManager.getConnection(url, user, password);
}catch(SQLException sqlex){
System.out.println("Erro na conexão "+ sqlex);
}
        return conexao;
    }

public static void CriaTabela(String nomeTabela,String atributos) throws SQLException {
            Statement statement = null;
            Connection conexao = null;
        try {
            conexao = conecta();
            statement = conexao.createStatement();
            String createTableSQL = "CREATE TABLE "+nomeTabela+"("+atributos+");";
            System.out.println(createTableSQL);
               statement.execute(createTableSQL); // executa o comando de criação
            System.out.println("Tabela \"nomeTabela\" foi criada com sucesso!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {   // sempre feche o statement a conexão com banco
            if (statement != null) {
                statement.close();
            }
            if (conexao != null) {
                conexao.close();
            }
        }
    }
    
   public static void criaBanco(String banco) throws SQLException{
       
       String sql="CREATE DATABASE "+banco;
       Connection conexao=conecta();
       Statement stmt=conexao.createStatement();
       stmt.execute(sql);
   }
       public static void main(String args[]) throws SQLException {
           CriaTabela("Dono", " `ID` INT NULL AUTO_INCREMENT,"+
  "`CPF` VARCHAR(11) NULL,"+
  "`Endereco` VARCHAR(45) NULL,"+
  "`Telefone` VARCHAR(45) NULL,"+
  "`Nome` VARCHAR(45) NULL,"+
  "`Nascimento` VARCHAR(45) NULL,"+
  "PRIMARY KEY (`ID`)");
           
           
           
       }

   
}


    
