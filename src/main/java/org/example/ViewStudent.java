package org.example;

public class ViewStudent {

    Student student;

    ViewStudent(Student student){
        this.student=student;
    }

    void displayStudent(){
        char ch= student.gender();


        if(ch=='F' || ch=='f'){
            System.out.println("This is the female student");
        }else if (ch=='M' || ch=='m'){
            System.out.println("This is the male student");
        }else{
            System.out.println("This is third gender student");
        }
    }
}
