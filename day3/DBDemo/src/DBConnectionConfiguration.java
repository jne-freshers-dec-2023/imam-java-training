
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionConfiguration {

    public Connection getConnection(String jdbcUrl, String user, String password) {
        Connection connection = null;
//        String jdbcUrl="jdbc:postgresql://localhost:5432/testdb";
//        String user="postgres";
//        String password="postgres";
        try {

            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(jdbcUrl, user, password);
            return connection;
        } catch (ClassNotFoundException classNotFoundExceptionJava) {
            System.err.println("Exception in Database class not found");
        } catch (SQLException sQLException) {
            System.err.println("Exception in Database Connection");
        }
        return connection;
    }

}
