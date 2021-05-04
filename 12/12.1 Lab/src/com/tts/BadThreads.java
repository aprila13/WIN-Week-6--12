package com.tts;

public class BadThreads {
    static String message;


    private static class CorrectorThread extends Thread {
        public void run() {
            try {
                sleep(1000);
            } catch (InterruptedException e) {}

            // Key statement 1:
            message = "Mares do eat oats.";
        }
    }

    public static void main(String args[]) throws InterruptedException {
        (new CorrectorThread()).start();
        message = "Mares do not eat oats.";
        Thread.sleep(2000);

        // Key statement 2:
        System.out.println(message);
    }
}


//2. The application should print out "Mares do eat oats."
//- Is it guaranteed to always do this?
//- If not, why not?
// It will only print "Mares do eat oats." if there isn't an exception.
// If the program catches as exception, "Mares do not eat oats." will print.
// The result is not guaranteed since there is no happens before relationship btw statement 1 and 2.

//3. Would it help to change the parameters of the two invocations of Sleep?
// IT WOULD NOT HELP. This is because there would be no happens before relationship for key 1 and key 2. No way to guarantee that one will happen after the other because they happen in sequence so the first statement would be random
//

//4. How would you guarantee that all changes to message will be visible in the main thread?
// In the main method, make a CorrectorThread instance, then call the join method before printing the message
//For Example:...
//public static void main(String args[]) throws InterruptedException {
//
//    Thread t = new CorrectorThread();
//    t.join();
//    message = "Mares do not eat oats.";
//    Thread.sleep(2000);
//      // Key statement 2:
//    System.out.println(message);
//}




