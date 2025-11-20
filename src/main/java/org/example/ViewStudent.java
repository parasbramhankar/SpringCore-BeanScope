package org.example;

public class ViewStudent {

    Student student;

    ViewStudent(Student student){
        this.student=student;
    }

    void display(){
        char ch= student.gender();

        if(ch=='F'){
            System.out.println("This is the female student");
        }else{
            System.out.println("This is the male student");
        }
    }
}
