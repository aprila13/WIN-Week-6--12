package com.tts;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class UserInput {
    public static void getInput(){
        Boolean carColor;
        String petName;
        int petAge;
        int luckyNum;
        Boolean favQuarterback;
        int quarterbackNum = 0;
        int modelYearCar;
        String favActorFirstName;
        int userRandomNum;
        int powerBallOne;
        int powerBallTwo;
        int powerBallThree;
        int powerBallFour;
        int powerBallFive;
        int magicBallNum;
        Random rand = new Random();
        int upperBound = 4;
        int randomNum = rand.nextInt(upperBound) + 1;
        Scanner nameScanner = new Scanner(System.in);
        System.out.print("What is your name?: ");     // type a name
        String yourInput = nameScanner.next();
        System.out.println("Hello " + yourInput);
        System.out.println("Do you wish to continue to the interactive portion of the program?");
        yourInput = nameScanner.next();
        if(yourInput.toLowerCase().equals("yes") || yourInput.toLowerCase().equals("y")){
            do{
                System.out.println("Do you have a red car? (y,n)");
                yourInput = nameScanner.next();
                if(yourInput.toLowerCase().equals("y")){
                    carColor = true;
                } else {
                    carColor = false;
                }
                System.out.println("What is your favorite pet's name?");
                petName = nameScanner.next();
                System.out.println("What is your favorite pet's age?");
                petAge = nameScanner.nextInt();
                System.out.println("What is your lucky number?");
                luckyNum = nameScanner.nextInt();
                System.out.println("Do you have a favorite quarterback? (y/n)");
                yourInput = nameScanner.next();
                if(yourInput.toLowerCase().equals("y")){
                    favQuarterback = true;
                    System.out.println("What is your favorite quarterback's jersey number?");
                    quarterbackNum = nameScanner.nextInt();
                } else {
                    favQuarterback = false;
                }
                System.out.println("What is the two digit model year of your car? (e.g. 99, 05, 11)");
                modelYearCar = nameScanner.nextInt();
                System.out.println("What is the first name of your favorite actor or actress?");
                favActorFirstName = nameScanner.next();
                System.out.println("Enter a random number between 1 and 50:");
                userRandomNum = nameScanner.nextInt();
                System.out.println(carColor + petName + quarterbackNum + favActorFirstName);
                magicBallNum = luckyNum * randomNum;
                if(magicBallNum > 75){
                    do{
                        magicBallNum = magicBallNum / 2;
                    }while(magicBallNum > 75);
                }
                powerBallOne = 42;
                powerBallTwo = modelYearCar + luckyNum;
                if(powerBallTwo > 65){
                    do{
                        powerBallTwo = powerBallTwo / 2;
                    }while(powerBallTwo > 65);
                }
                powerBallThree = petName.charAt(2);
                if(powerBallThree > 65){
                    do{
                        powerBallThree = powerBallThree / 2;
                    }while(powerBallThree > 65);
                }
                powerBallFour = favActorFirstName.charAt(0);
                if(powerBallFour > 65){
                    do{
                        powerBallFour = powerBallFour / 2;
                    }while(powerBallFour > 65);
                }
                powerBallFive = quarterbackNum + petAge + modelYearCar;
                if(powerBallFive > 65){
                    do{
                        powerBallFive = powerBallFive / 2;
                    }while(powerBallFive > 65);
                }
                System.out.println("Lottery numbers: " + powerBallOne + " " + powerBallTwo + " " + powerBallThree + " " + powerBallFour + " " + powerBallFive + " Magic Number: " + magicBallNum );
                System.out.println("\n Would you like to generate another set of numbers? (y/n)");
                yourInput = nameScanner.next();
                if(yourInput.equals("y")){
                    yourInput = "y";
                } else {
                    yourInput = "n";
                }
            } while(!yourInput.equals("n"));
        } else {
            System.out.println("Please return later to complete the survey portion of this program!");
        }
    }
}
