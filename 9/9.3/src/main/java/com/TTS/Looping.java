package com.TTS;

import java.util.ArrayList;
import java.util.List;

public class Looping {
    public static void main(String[] args) {
        //List<Integer> myList -
        //new ArrayList<>() - Calls the constructor for an array list

        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(432);
        myList.add(321);

        for (Integer element : myList) {
            System.out.println("This is my element: " + element);
        }
    }
}

//Questions from slides
//https://techtalentsouth.slides.com/techtalentsouth/java-control-flow?token=dF5khG6q
//48. Do while Loop
//49. Enhanced For Loop
//50. If Statement
//51. True
//52. Break
//53. Continue
//54. Both
//55. Combining multiple case sections to have a common statement block