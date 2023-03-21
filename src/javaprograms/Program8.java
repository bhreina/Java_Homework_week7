package javaprograms;
import java.util.Scanner;
/**
 * 8.Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any other alphabet should
 * be invalid entry
 */
public class Program8 {
    public static void main(String[] args) { // main method
       alhabet();
    }

    public static void alhabet(){ //static method
        Scanner sca1 = new Scanner(System.in);
        System.out.print("Enter any alphabet in lower case from A to F : ");
        char alp = sca1.next().charAt(0);
        System.out.println(alp);

        String a = "Anand";
        String b = "Bangalore";
        String c = "China";
        String d = "Delhi";
        String e = "Egypt";
        String f = "France";

        if (alp=='a') {
            System.out.println("Entered alphabet is : " +a);
        } else if (alp=='b'){
            System.out.println("Entered alphabet is : " +b);
        } else if (alp=='c') {
            System.out.println("Entered alphabet is : " +c);
        }else if (alp=='d'){
            System.out.println("Entered alphabet is : " +d);
        } else if (alp=='e') {
            System.out.println("Entered alphabet is : " +e);
        } else if (alp=='f'){
            System.out.println("Entered alphabet is : " +f);
        }else {
            System.out.println("Invalid input");
        }

        sca1.close();

    }
}