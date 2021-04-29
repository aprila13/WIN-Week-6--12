package com.tts;

public class Main {

    public static int displaySum(int a, int b) {
        return a + b;
    }

    //O(1) time (or “constant time”)
    public static void printFirstItem(int[] items) {
        System.out.println(items[0]);
    }

    //Enhanced for loop/ O(n) time (or “linear time”)
    public static void printAllItems(int[] items) {
        for (int item : items) {
            System.out.println(item);
        }
    }

    //Nested loops / O(n^2) time (or “quadratic time”)
    public static void printAllPossibleOrderedPairs(int[] items) {
        for (int firstItem : items) {
            for (int secondItem : items) {
                System.out.println(firstItem + ", " + secondItem);
            }
        }
    }

    //O(n) runtime
    public static void sayHiNTimes(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("hi");
        }
    }

    //This runs in O(2n), which we just call O(n).
    //The growth curve of an O(2n) function is exponential - starting off very shallow, then rising meteorically.
    public static void printAllItemsTwice(int[] items) {
        for (int item : items) {
            System.out.println(item);
        }

        // once more, with feeling
        for (int item : items) {
            System.out.println(item);
        }
    }


    //O(1)
    public static void printFirstItemThenFirstHalfThenSayHi100Times(int[] items) {
        System.out.println(items[0]);

        int middleIndex = items.length / 2;
        int index = 0;

        while (index < middleIndex) { //O(N)
            System.out.println(items[index]);
            index++;
        }

        for (int i = 0; i < 100; i++) { //O(1)
            System.out.println("hi");
        }
    }



//    public static void staircase(int n) {
//        String hashTag = "#";
//        String whiteSpace = "     ";
//        for (int i = 0; i <= n; i++) {
//            if(i == 1) {
//                System.out.println(whiteSpace + hashTag);
//            }
//            else if (i > 1) {
//                hashTag += "#";
//            whiteSpace += " ";
//                System.out.println(whiteSpace + hashTag);
//            }
//
//        }
//    }

    public static void staircase(int n) {
        int hashtag = 1, whiteSpace = n-1;
        while(n > 0){
            for(int i = 0; i < whiteSpace; i++){
                System.out.print(" ");
            }
            for(int i = 0; i < hashtag; i++){
                System.out.print("#");
            }
            hashtag += 1;
            whiteSpace -= 1;
            --n;
            System.out.println("");
        }
    }




    public static void main(String[] args) {

        staircase(6);
//        System.out.print(displaySum(7,3));

        //Declaring the array and passing it into a method
//        int[] intArr = {1, 2, 3 , 4, 5, 6, 7, 8, 9, 10};
//
//        System.out.println("***** printFirstItem *****");
//        printFirstItem(intArr);
//
//        System.out.println("***** printAllItems *****");
//        printAllItems(intArr);
//
//        System.out.println("***** printAllPossibleOrderedPairs *****");
//        printAllPossibleOrderedPairs(intArr);
//
//        System.out.println("***** sayHiNTimes *****");
//        sayHiNTimes(50);
    }
}
