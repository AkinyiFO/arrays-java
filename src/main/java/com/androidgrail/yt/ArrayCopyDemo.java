package com.androidgrail.yt;

// Source - https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html

// System class arraycopy method - https://docs.oracle.com/javase/8/docs/api/java/lang/System.html

//public static void arraycopy(Object src, int srcPos,
//                             Object dest, int destPos, int length)

class ArrayCopyDemo {
    public static void main(String[] args) {
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }

        // public static int[]	copyOfRange(int[] original, int from, int to)
        // inclusive of int from and exclusive of int to
        java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        System.out.println("\n");
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
    }
}
