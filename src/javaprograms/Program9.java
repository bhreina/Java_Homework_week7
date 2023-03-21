package javaprograms;

import java.util.Scanner;

/**
 *9.Input any alphabet from “A" to “F” and print their city name accordingly (switch statement)
 * if any other alphabet should be invalid entry
 */
public class Program9 {

    public static void main(String[] args) { // main method
        Program9 obj = new Program9(); // created object to call the instance method
        obj.city();
    }
    public void city() { // instance method
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter any lower case alphabet from A to F to print the city Name on the alphabet entered : ");
        String alp=sca.next();
        switch (alp){
            case "a":
                System.out.println("Anand");
                break;
            case "b":
                System.out.println("Bangalore");
                break;
            case "c":
                System.out.println("China");
                break;
            case "d":
                System.out.println("Delhi");
                break;
            case "e":
                System.out.println("Egypt");
                break;
            case "f":
                System.out.println("France");
                break;
            default:
                System.out.println("Invalid input");

        }
        sca.close();
    }
}
