import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DBConnectionConfiguration dbConnectionConfiguration=new DBConnectionConfiguration();
        DBOperations dbOperations=new DBOperations();
        String jdbcUrl="jdbc:postgresql://localhost:5432/postgres";
        String user="postgres";
        String password="postgres";
        Connection connectionObject = dbConnectionConfiguration.getConnection(jdbcUrl,user,password);
        if (connectionObject!=null) {
            System.out.println("Connected to data base Successfully");
        } else {
            System.out.println("Connection failed");
        }
        try {
            dbOperations.insertStudent(connectionObject);
            dbOperations.selectStudents(connectionObject);
        }finally {
            connectionObject.close();
        }
    }
}