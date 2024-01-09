package org.example.jdbcdemo;

public class Student {

    public int studentId;
    public String studentName;
    public int marks;

    public Student(int studentId, String studentName,int marks){

        this.studentId=studentId;
        this.studentName=studentName;
        this.marks=marks;

    }

    public void setStudentID(int studentId){
        this.studentId=studentId;
    }
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }
    
    public int getStudentID(){
        return studentId;
    }
    public String getStudentName(){
        return studentName;
    }
    public int getMarks(){
        return marks;
    }

    @Override
    public String toString() {
        String studentString="Student ID = " + this.studentId+" Student Name = " + this.studentName + " Marks = " + this.marks;
        return studentString;
    }
}
