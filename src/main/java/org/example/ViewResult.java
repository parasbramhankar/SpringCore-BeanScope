package org.example;

import java.util.Arrays;

public class ViewResult {

    Result result;

    void setResult(Result result){
        this.result=result;
    }

    void displayResult(){
        int[]arr= result.marks();
        System.out.println("Marks: "+ Arrays.toString(arr));

        float avg= (float) Arrays.stream(arr).sum() /Arrays.stream(arr).count();

        System.out.println("Average Marks: "+avg);
    }

}
