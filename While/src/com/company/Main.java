package com.company;

public class Main {

    public static void main(String[] args) {
//	    int count = 1;
//	    while (count !=6 ) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        System.out.println("**********");
//
//	    // same as
//        for (count = 1; count !=6; count++) {
//            System.out.println("Count value is " + count);
//        }

        /*count = 1;
        while(true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }*/

        /*count = 6;
        do {
            System.out.println("Count value was " + count);
            count++;

            if (count > 100) {
                break;
            }
        } while (count !=6);*/

//        int evenOrNot = 4;
//        int finishNumber = 20;
//
//        while (evenOrNot <= finishNumber) {
//            evenOrNot++;
//            if (!isEvenNumber(evenOrNot)) {
//                continue;
//            }
//
//            System.out.println("Even number " + evenOrNot);
//        }

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and a break once 5 are found
        // and at the end, display the total number of even number found

        int evenOrNot = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (evenOrNot <= finishNumber) {
            evenOrNot++;
            if (!isEvenNumber(evenOrNot)) {
                continue;
            }

            System.out.println("Even number " + evenOrNot);

            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }
        }

        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    // Create a method called isEvenNumber that takes a parameter of type int
    // its purposse is to determine if the argument passed to the method is
    // an even number or not
    // return true if an even number, otherwise return false;

    public static boolean isEvenNumber (int evenOrNot) {
        if ((evenOrNot % 2) == 0 ) {
            return true;
        } else {
            return false;
        }
    }
}
