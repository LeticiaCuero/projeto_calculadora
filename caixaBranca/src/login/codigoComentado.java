package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {

    // Conectar ao banco
    public Connection conectarBD() {

        Connection conn = null; // Inicia a conexão

        try {

            // Carrega banco
            Class.forName("com.mysql.Driver_Manager").newInstance();

            // Define a URL de conexão
            String url =
                "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";

            // Abre a conexão
            conn = DriverManager.getConnection(url);

        } catch (Exception e) {

            // Captura erros de conexão
        }

        // Retorna a conexão criada
        return conn;
    }

    // Armazena o nome do usuário
    public String nome = "";

    // Armazena o resultado da autenticação
    public boolean result = false;

    // Verifica login e senha do usuário
    public boolean verificarUsuario(String login, String senha) {

        String sql = "";

        // Obtém conexão com o banco
        Connection conn = conectarBD();

        // Monta a consulta SQL
        sql += "select nome from usuarios ";
        sql += "where login = '" + login + "'";
        sql += " and senha = '" + senha + "';";

        try {

            // Cria objeto para executar SQL
            Statement st = conn.createStatement();

            // Executa a consulta
            ResultSet rs = st.executeQuery(sql);

            // Verifica se encontrou usuário
            if (rs.next()) {

                // Usuário encontrado
                result = true;

                // Obtém o nome do usuário
                nome = rs.getString("nome");
            }

        } catch (Exception e) {

            // Captura erros durante a consulta
        }

        // Retorna verdadeiro ou falso
        return result;
    }
}