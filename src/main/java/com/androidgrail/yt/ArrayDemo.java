package com.androidgrail.yt;

// Source - https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html

class ArrayDemo {
    public static void main(String[] args) {
        // Declares an array of integers
        // Initializes it to allocated memory for 10 integers
        int[] anArray = new int[10];

        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        // You can use looping to initialize the above array
        // Another shortcut is:
//        int[] anArray = {
//                100, 200, 300,
//                400, 500, 600,
//                700, 800, 900, 1000
//        };

        System.out.println("Element at index 0: "
                + anArray[0]);
        System.out.println("Element at index 1: "
                + anArray[1]);
        System.out.println("Element at index 2: "
                + anArray[2]);
        System.out.println("Element at index 3: "
                + anArray[3]);
        System.out.println("Element at index 4: "
                + anArray[4]);
        System.out.println("Element at index 5: "
                + anArray[5]);
        System.out.println("Element at index 6: "
                + anArray[6]);
        System.out.println("Element at index 7: "
                + anArray[7]);
        System.out.println("Element at index 8: "
                + anArray[8]);
        System.out.println("Element at index 9: "
                + anArray[9]);

        // Length
        System.out.println("This array is of length: "+ anArray.length);
    }
}