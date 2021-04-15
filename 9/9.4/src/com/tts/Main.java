package com.tts;
import java.util.*; //Import the classes needed

//Lecture Notes
public class Main {

    public static void main(String[] args) {

//        System.out.println("==== Arrays ====");
        //Data Type[] name = {};
//        String[] fruitArray = {"orange", "apple", "dragonfruit"};
//        int[] intArray;
//        boolean[] boolArray;
//        System.out.println(fruitArray[1]); //apple
//        System.out.println(fruitArray); //Normal arrays will not print the whole array
//        System.out.println(fruitArray.length); //length is a property, not method

//        System.out.println("==== Collections ====");
//        List <String> stringList = new ArrayList <>(); //Creates an array list
//        // System.out.println("==== ArrayList ====");
//        stringList.add("cat"); //Adding elements to the array list
//        stringList.add("dog");
//        stringList.add("bird");
//        System.out.println("This is the array list: " + stringList); //printing the array list
//        stringList.add(0, "tiger"); //Adding element to a certain index
//        System.out.println("This is the array list: " + stringList); //printing the array list
//        System.out.println(stringList.get(3)); //Retrieves based on index
//        stringList.remove("cat"); //Deletes the element
//        System.out.println("This is the array list w/o cat: " + stringList);
//        Collections.reverse(stringList); //Reverses Array List
//        System.out.println(stringList);
//        System.out.println(stringList.size()); //Tells size. Length doesn't exist for ArrayList
//        System.out.println(stringList.contains("dog")); //Searches for element. Returns boolean
//        stringList.clear(); //Removes all elements from ArrayList
//        System.out.println(stringList); //Shows empty ArrayList
//
//
//      System.out.println("==== Converting a string into an array ====");
        //Make string
        //Split string
        //Make ArrayList
        //Convert split string with Arrays.asList()
//        String myString = "I really love icecream!"; //Creates a new string
//        String str[] = myString.split(" "); //Split string held in a variable
////        System.out.println(str[1]);
//        List<String> arrayString = new ArrayList<>(); //Create a new ArrayList
//        arrayString = Arrays.asList(str); //Setting the new ArrayList value.  The value is split string turned into an array.
//        System.out.println(arrayString);


//      System.out.println("==== Converting an array into a string ====");
//        List <String> fruitList = new ArrayList<>(); //Make array list
//        fruitList.add("Apple"); //Add elements to array list
//        fruitList.add("Banana");
//        fruitList.add("Grapes");
//        System.out.println(fruitList);
//        Object[] fruitArray = fruitList.toArray(); //convert from ArrayList to array
//        System.out.println(fruitArray[1]);
//        //converting the array into a string and holding it in variable + removing brackets, commas
//        String fruitString = Arrays.toString(fruitArray).replace("[", "").replace("]", "").replace(",","");
//        System.out.println(fruitString);

//        System.out.println("==== HashMaps ===="); //Stores data as key/value pairs
//        HashMap<String, Integer> person = new HashMap<>(); //Creates a hashmap with a string as the key, integer as the value
//        person.put("April", 34);
//        person.put("Riley", 6);
//        person.put("Ren", 45);
//        System.out.println(person); //{Ren=45, Riley=6, April=34}
//        System.out.println(person.get("Riley")); //6 get the value
//        System.out.println(person.remove("Riley")); //Removes pair
//        System.out.println(person);
//        person.put("April", 25); //Replace the value with a new value
//        System.out.println(person);
//        System.out.println(person.containsKey("Ren")); //returns a boolean
//        System.out.println(person.containsValue(45)); //returns a boolean
//        System.out.println(person.isEmpty()); //returns a boolean

        //System.out.println("==== ArrayLists forEach ====");
//        List <String> fruitList = new ArrayList<>(); //Make array list
//        fruitList.add("Apple"); //Add elements to array list
//        fruitList.add("Banana");
//        fruitList.add("Grapes");
////        System.out.println(fruitList);
//
//        for (String fruit: fruitList) { //fruit represents each element in the fruitList ArrayList
//            System.out.println("This fruit is " + fruit);
//        }

        //System.out.println("==== HashMap Map.Entry ====");
        HashMap<String, Integer> person = new HashMap<>(); //Creates a hashmap with a string as the key, integer as the value
        person.put("April", 34);
        person.put("Riley", 6);
        person.put("Ren", 45);
        System.out.println(person);

        for (Map.Entry<String, Integer> entry : person.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " is " + value + " years old.");
        }
    }
}
