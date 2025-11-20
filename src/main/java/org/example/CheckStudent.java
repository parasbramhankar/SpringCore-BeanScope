package org.example;


import java.util.Scanner;

public class CheckStudent implements Student{

    @Override
     public char gender(){
        System.out.println("Enter the Gender (F:Female/ M:Male):");
        return new Scanner(System.in).next().charAt(0);
    }

}
