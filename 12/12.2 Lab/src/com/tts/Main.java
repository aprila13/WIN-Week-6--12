package com.tts;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        //A Hashset is like a bubble with contains data.
        //Will not allow repeated data
        Set<Integer> setExample = new HashSet<Integer>();
        setExample.add(4);
        setExample.add(8);
        setExample.add(4);
        setExample.add(3);
        setExample.add(7);
        setExample.remove(8); //removes an item
        //setExample.clear(); //removes all items
        System.out.println(setExample.isEmpty()); //returns boolean
        System.out.println(setExample.size()); //returns number of items
        System.out.println(setExample.contains(8)); //returns boolean
        System.out.println(setExample); //returns set
    }
}
