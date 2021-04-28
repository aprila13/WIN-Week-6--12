public class ClassifyPerson {
    public static void main(String[] args) {

        int age = 35;
        char gender = 'F';

        if( age > 35 ) {
            if( gender == 'M' ) {
                System.out.println("Man"); // > 35 & Man
            } else { // > 35, not man
                System.out.println("Woman");
            }
        } else { //If not > 35
            if( gender == 'M' ) { // <35 and man = boy
                System.out.println("Boy");
            } else {  //else girl
                System.out.println("Girl");
            }
        }

    }
}
