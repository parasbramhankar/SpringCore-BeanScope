package org.example;

public class CheckResult {

    Student student;

    CheckResult(Student student){
        this.student=student;
    }

    void displayResult(){
        int[]arr= student.marks();

    }

}
