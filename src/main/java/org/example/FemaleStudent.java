package org.example;


import java.util.Scanner;

public class FemaleStudent implements Student{

    @Override
     public char gender(){
        return 'F';
    }

    @Override
    public int[] marks(){
        Scanner scanner=new Scanner(System.in);
        int []arr=new int[3];
        System.out.println("Enter marks of the student: ");

        for(int i=0;i<3;i++){
            arr[i]=scanner.nextInt();
        }
        return arr;
    }


}
