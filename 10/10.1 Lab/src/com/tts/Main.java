package com.tts;

public class Main {

    public static void main(String[] args) {

        //Pet
        Pet riley = new Pet();
        riley.setName("Riley Craig");
        riley.setLocation("Matthews, NC");
        riley.setAge(6);
        riley.setType("Feline");
        System.out.println(riley.getName());
        System.out.println(riley.getLocation());
        System.out.println(riley.getAge());
        System.out.println(riley.getType());

        Pet monroe = new Pet();
        monroe.setName("Monroe");
        System.out.println(monroe.getName());

        Holiday thanksgiving = new Holiday();
        thanksgiving.setMonth(11);
        thanksgiving.setDay(25);
        System.out.println(thanksgiving.getMonth());

        Pet cat = new Pet("Riley",1,"Charlotte", "Feline");
        System.out.println(cat.getName() + " is " + "a " + cat.getType() + " that is " + cat.getAge() + " years old and he lives in " + cat.getLocation());
        Holiday valentinesDay = new Holiday("Valentine's Day", 2, 14);
        System.out.println(valentinesDay.holidayInfo());

        //Calculator
        Calculator myCalc =  new Calculator();

        System.out.println(myCalc.Add(1, 3));
        System.out.println(myCalc.Subtract(4, 2));
        System.out.println(myCalc.Division(8, 3));
        System.out.println(myCalc.Multiply(2, 4));
        System.out.println(myCalc.Square(2));
        System.out.println("---------------------------------------------------------------------");
        MagicCalculator secondCalc = new MagicCalculator();
        System.out.println(secondCalc.Add(2,2));
        System.out.println(secondCalc.SquareRoot(4));
        System.out.println(secondCalc.Sin(4));
        System.out.println(secondCalc.Tangent(4));
        System.out.println(secondCalc.Cosine(4));
        System.out.println(secondCalc.Factorial(4));
    }

}
