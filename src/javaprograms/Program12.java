package javaprograms;

import java.util.Scanner;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Program12 {

    public static void main(String[] args) {
        Program12 obj =new Program12();
        obj.inputValue();
    }
    public void inputValue(){
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter any character/value: ");
        char a = sca.next().charAt(0);

        // using character class
        if(Character.isAlphabetic(a)){
            System.out.println(a + " is a Alphabet ");
        } else if (Character.isDigit(a)){
            System.out.println(a + " is a Digit ");
        }else {
            System.out.println(a + " is a Special character");
        }

        sca.close();
    }
}
