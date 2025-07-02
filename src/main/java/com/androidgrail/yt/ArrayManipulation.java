package com.androidgrail.yt;

// Source - https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html

//  Java SE provides several methods for performing array manipulations such as copying, sorting and searching arrays.
// Source -https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html

class ArrayManipulation {

    String[] arrayMani = {"Element1Index0", "Element2Index1", "Element3Index2", "Element4Index3", "Element5Index4",
            "Element6Index5", "Element7Index6", "Element8Index7", "Element9Index8", "Element10Index9"};

    ArrayManipulation(){
        // array must be sorted into ascending order according to the natural ordering of its elements
        java.util.Arrays.sort(arrayMani);
        System.out.println(java.util.Arrays.toString(arrayMani));
    }

    // Searching an array for a specific value to get the index at which it is placed (the binarySearch method)
    int binarySearch(String key){
        return java.util.Arrays.binarySearch(arrayMani, key);
    }

    public static void main(String[] args) {
        ArrayManipulation instanceArrayMani = new ArrayManipulation();

        // Returns: index of the search key, if it is contained in the array; otherwise, (-(insertion point) - 1).
        System.out.println(instanceArrayMani.binarySearch("Element10Index9"));

        // Comparing two arrays to determine if they are equal or not (the equals method
        // The two arrays are considered equal if both arrays contain the same number of elements,
        // and all corresponding pairs of elements in the two arrays are equal
        String[] arrayCompare = {"Element1Index0", "Element2Index1", "Element5Index4", "Element8Index7", "Element9Index8", "Element10Index9"};
        System.out.println(java.util.Arrays.equals(instanceArrayMani.arrayMani, arrayCompare));

        // Filling an array to place a specific value at each index (the fill method)
        // public static void fill(Object[] a, Object val)
        // public static void fill(Object[] a, int fromIndex, int toIndex, Object val)
        String[] arrayFill = {"Element1Index0", "Element2Index1", "Element5Index4", "Element8Index7", "Element9Index8", "Element10Index9"};
        java.util.Arrays.fill(arrayFill, 0, 3, "Filled-up");
        System.out.println(java.util.Arrays.toString(arrayFill));

        String[] arrayFill2 = {"Element1Index0", "Element2Index1", "Element5Index4"};
        java.util.Arrays.fill(arrayFill2, "androidgrail");
        System.out.println(java.util.Arrays.toString(arrayFill2));
    }

}
