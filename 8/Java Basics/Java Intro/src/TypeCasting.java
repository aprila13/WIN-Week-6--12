// Type casting is when you assign a value of one primitive data type to another type.

// Widening Casting (automatically) - converting a smaller type to a larger type size
// byte -> short -> char -> int -> long -> float -> double

// Narrowing Casting (manually) - converting a larger type to a smaller size type
// double -> float -> long -> int -> char -> short -> byte

public class TypeCasting {
  public static void main(String[] args) {

    // Widening Casting
    // int myNum = 5;
    // System.out.println(myNum); //5
    // float myFloat = myNum;
    // System.out.println(myFloat); //5.0

    // Narrowing Casting - must be done manually by placing the type in parentheses
    // in front of the value
    float myFloat = 6.2f;
    System.out.println(myFloat); //6.2
    int myInt = (int) myFloat;
    System.out.println(myInt); //6

  }
}
