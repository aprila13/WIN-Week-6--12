package com.tts;
import java.util.*;

public class LabAssignment {

    public static void getNumbers(){
        //Create our integers arraylist
        ArrayList<Integer> integersList = new ArrayList<Integer>();
        Scanner inputDevice = new Scanner(System.in);
        int userInput;
        //Get 5 numbers from the user
        for(int i = 0; i < 5; i++){
            System.out.println("Please enter a number: ");
            userInput = inputDevice.nextInt();
            integersList.add(userInput);
            System.out.println(integersList);
        }
        //Sum the five numbers
        int sum = 0;
        for(Integer myInt :  integersList){
            sum = sum + myInt;
        }
        System.out.println("The sum of your five numbers is: " + sum);
        //Find the product of these 5 numbers
        int product = 1;
        for(Integer myInt :  integersList){
            product = product * myInt;
        }
        System.out.println("The product of your five numbers is: " + product);
        //Find the largest number
        int largest = 0;
        for(Integer myInt :  integersList){
            if(myInt > largest){
                largest = myInt;
            }
        }
        System.out.println("The largest of your five numbers is: " + largest);
        //Find the smallest number
        int smallest = largest;
        for(Integer myInt :  integersList){
            if(myInt < smallest){
                smallest = myInt;
            }
        }
        System.out.println("The smallest of your five numbers is: " + smallest);
    }

    //===========

    public static void carDealership(){
        HashMap<String, String> vehicles = new HashMap<String, String>();
        vehicles.put("Civic", "Honda");
        vehicles.put("Pilot", "Honda");
        vehicles.put("Terrain", "GMC");
        vehicles.put("Impala", "Chevrolet");
        vehicles.put("Altima", "Nissan");
        vehicles.put("Corolla", "Toyota");

        String customerInput;

        Scanner inputDevice = new Scanner(System.in);
        System.out.println("What model are you looking for?");
        customerInput = inputDevice.next();
        String searchStock = vehicles.get(customerInput);

        if(searchStock == null){
            System.out.println("Sorry, we do not have that model");
        } else {
            System.out.println("Oh, you're looking for a " + customerInput + "? Here is our selection of " + vehicles.get(customerInput) + "s");
        }
        ArrayList<String> models = new ArrayList<String>();
        for (Map.Entry<String, String> entry : vehicles.entrySet()) {
            if (entry.getValue().equals(vehicles.get(customerInput))) {
                models.add(entry.getKey());
            }
        }
        String modelString = models.toString();
        System.out.println(modelString.replace("[","").replace("]","").replace(",", " "));
    }




    public static void main(String[] args) {

        getNumbers();
        carDealership();
    }
}
