package javaprograms;

import java.util.Scanner;

/**
 * 16.Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */
public class Program16 {

    public static void main(String[] args) {
        Program16 obj = new Program16();
        obj.positiveNegative();
    }
    public void positiveNegative() {// main method
        Scanner sca = new Scanner(System.in);// object of scanner class
        System.out.println("Enter a Number: ");
        int num = sca.nextInt();//reading a number from user
        if(num>0){ // checking if the number is greater than or not
            System.out.println("The number entered is Positive: ");
        } else if (num<0) { //checking if the number is less than or not
            System.out.println("The number entered is Negative: ");
        } else { // executes when the above two conditions are false
            System.out.println("The number entered is Zero");
        }
        sca.close();
    }
}
