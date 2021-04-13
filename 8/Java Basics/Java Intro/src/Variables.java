// Writing Variables
// Variable names are identifiers
// type varName = value;

public class Variables {
  public static void main(String[] args) {
    // String - String values are surrounded by double quotes
    String person = "James";
    System.out.println(person);

    // int- stores integers (whole numbers), without decimals, such as 123 or -123
    int myNum = 34;
    System.out.println(myNum);

    //** Variables can also be declared and their value assigned later
    String city;
    city = "Charlotte";
    System.out.println(city);

    // float - stores floating point numbers such as 19.99 or -19.99
    float myFloat = 5.99f;
    System.out.println(myFloat);

    // char - stores single characters, such as 'a' or 'B'. Surrounded by single quotes
    char firstLetter = 'A';
    System.out.println(firstLetter);

    // boolean - stores values with two states: true or false
    boolean correct = true;
    System.out.println(correct);

    // Concatenation
    System.out.println("The answer is: " + correct);

    // Concatenation
    String firstName = "John ";
    String lastName = "Doe";
    String fullName = firstName + lastName;
    System.out.println(fullName);

    // Adding
    int first = 10;
    int second = 15;
    System.out.println(first + second);

    // Declaring many variables of same type
    int a = 1, b = 2, c = 3;
    int add = a + b + c;
    System.out.println(add);
  }
};

//Data Types are divided into 2 groups:
//1. Primitive Data Types - byte, short, int, long, float, double, boolean, char
//2. Non-primitive Data Types - String, Array, Classes











