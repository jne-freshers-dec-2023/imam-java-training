package org.example.jdbcdemo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        DBOperations dbOperations=new DBOperations();
        String jdbcUrl="jdbc:postgresql://localhost:5432/postgres";
        String user="postgres";
        String password="postgres";
        Student student=new Student(134, "Rohit", 100);
        Connection connectionObject = DBConnectionConfiguration.getConnection(jdbcUrl,user,password);
        if (connectionObject!=null) {
            System.out.println("Connected to data base Successfully");
        } else {
            System.out.println("Connection failed");
        }
        try {
            dbOperations.insertStudent(connectionObject,student);
            List<Student> studentlist =dbOperations.selectStudents(connectionObject);
            for (Student studentrecord:studentlist){
                System.out.println(studentrecord.toString());
            }
        }finally {
            connectionObject.close();
        }
    }
}