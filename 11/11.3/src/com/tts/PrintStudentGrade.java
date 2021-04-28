package com.tts;

public class PrintStudentGrade {
    public static void main(String[] args) {

        int marks = 65;
        if(marks > 75){
            System.out.println("You got over a 75");
        } else if (marks > 60)  {
            System.out.println("You got over a 60");
        } else if (marks > 50) {
            System.out.println("You got over a 50");
        } else {
            System.out.println("You failed");
        }
    }
}

//if - Block 1 - checks true or false. If false goes to block 2
//If block 2 is true, run.  If false, goes to block 3
