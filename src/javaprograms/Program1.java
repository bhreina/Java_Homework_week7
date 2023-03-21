package javaprograms;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Program1 {
    public static void main(String[] args) { // main method

        Program1 obj= new Program1();
        obj.evenOdd();
    }
    public void evenOdd(){
        Scanner sca=new Scanner(System.in);// used scanner to take input from the user

        System.out.println("Enter a number :");// asking to enter the number
        int num=sca.nextInt();// assigning the user input to num variable

        //used ternary operator to check entered number is even or odd
        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.println(num + " is " + result);// print the result

        sca.close();// closing the scanner
    }

}
