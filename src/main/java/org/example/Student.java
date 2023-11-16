package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;

import java.beans.ConstructorProperties;

@NoArgsConstructor
public class Student {
    private int studentId;
    private String studentName;


    //constructor with arg id only
    public Student(int id) {
        this.studentId = id;
        System.out.println("Constructor with one argument is revoked");
    }

    /* Note: You don't need to write the annotation @ConstructorProperties({arguments names})
        if the arguments name in the constructor is the same as the names of the argumnts in the config xml file
       OR if you didn't use the name attribute in the constructor-args in the config xml file and just use the value attribute
       and put these values in the same order of it in the constructor in the class*/
   @ConstructorProperties({"studentId", "studentName"})
    public Student(int id, String name) {
        this.studentId = id;
        this.studentName = name;
        System.out.println("Constructor with all args is invoked");
    }

    //setter methods

    public void setStudentId(int studentId) {
        this.studentId = studentId;
        System.out.println("Setter method of student id is revoked");
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
        System.out.println("setter method of student name is revoked");
    }


}
