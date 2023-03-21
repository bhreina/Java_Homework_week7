package javaprograms;

import java.util.Arrays;

/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */
public class Program17 {
    public static void main(String[] args) {
        sort();
    }
    public static void sort() {
        int [] num = {10,5,7,2,8,};
        String [] s = {"a","e","d","b","c"};

        System.out.println("Original value: " + Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("Sorted value: " +Arrays.toString(num));

        System.out.println();

        System.out.println("Original characters: " +Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("Sorted value: " +Arrays.toString(s));


    }
}
