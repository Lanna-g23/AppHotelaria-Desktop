package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    //TAREFA DE RETORNO DO INTEVALO: declarar 4 variaveis com o seu tipo terminado e alorcar o valor para cada

                            //jdba:mysql://localhost:porta/nome do banco
    private String driver = "jdba:mysql://127.0.0.1:3306/projecthotel";

    private String url = "com.mysql.cj.jdbc.Driver";
    private String usuario = "dbaHotel" ;
    private String senha =  "dbaHotel123";

    public Connection conectar() {
        //Objeto da conexao inicializar nulo pois não se saber se o banco vai responder
        Connection condb = null;
        try {

            /*Especifica a rota do Driver a ser carregado (JDBC para SGBD MySQL)*/
            Class.forName(driver);


            /*Inicializar o driver ja carregador por meio do metodo getConnection(IP, Porta, Nome do banco, Usuario, Senha)*/
           condb = DriverManager.getConnection(url, usuario, senha);
           return condb;


        } catch (SQLException erro) {
            System.out.println("Erro ao conectar ao Banco de Dados" + erro);
            return null;

        }
    }

}