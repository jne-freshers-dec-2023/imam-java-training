import java.sql.*;

public class DBOperations {


    public void insertStudent(Connection connection) {
        String insertQuery = "INSERT INTO student (id, name, marks) VALUES (101,'imam',95)";
        Statement statement;
        try {
            statement=connection.createStatement();
            statement.executeUpdate(insertQuery);
            System.out.println("Record added successfully!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        int studentId=10;
        String studentName="Kedar";
        int marks=100;
        insertQuery = "INSERT INTO student values (?,?,?)";
        PreparedStatement preparedStatement;
        try{
            preparedStatement=connection.prepareStatement(insertQuery);
            preparedStatement.setInt(1,studentId);
            preparedStatement.setString(2,studentName);
            preparedStatement.setInt(3,marks);
            preparedStatement.executeUpdate();
            System.out.println("Record added successfully!");
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void selectStudents(Connection connection) {
        String selectQuery = "select * from student";
        Statement statement;
        try {
            statement=connection.createStatement();
            ResultSet students=statement.executeQuery(selectQuery);
            System.out.println(students);
            while (students.next()){
                System.out.println("Id = "+students.getInt(1)+ " Name = "+students.getString(2)+" Marks = "+students.getInt(3));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
