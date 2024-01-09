package org.example.jdbcdemo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBOperations {


    public void insertStudent(Connection connection, Student student) {
        String insertQuery = "INSERT INTO student (id, name, marks) VALUES (101,'imam',95)";
        Statement statement;
        try {
            statement=connection.createStatement();
            statement.executeUpdate(insertQuery);
            System.out.println("Record added successfully!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        insertQuery = "INSERT INTO student values (?,?,?)";
        PreparedStatement preparedStatement;
        try{
            preparedStatement=connection.prepareStatement(insertQuery);
            preparedStatement.setInt(1,student.getStudentID());
            preparedStatement.setString(2,student.getStudentName());
            preparedStatement.setInt(3,student.getMarks());
            preparedStatement.executeUpdate();
            System.out.println("Record added successfully!");
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public List<Student> selectStudents(Connection connection) {
        String selectQuery = "select * from student";
        List<Student> stdList=new ArrayList<>();
        Statement statement;
        try {
            statement=connection.createStatement();
            ResultSet rsStudents=statement.executeQuery(selectQuery);
            System.out.println(rsStudents);
            while (rsStudents.next()){
                stdList.add(new Student(rsStudents.getInt(1), rsStudents.getString(2), rsStudents.getInt(3)));
            }
            return stdList;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
