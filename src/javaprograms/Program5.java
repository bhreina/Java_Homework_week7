package javaprograms;
/**
 * 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 * HRA = basic salary 10% DA = Basic salary 8% TA = Basic salary 9% PF= Basic salary 20% Gross salary = basic salary + HRA + TA + DA –PF Print in following format
 * _______________________________ |
 * Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */

import java.util.Scanner;

public class
Program5 {
    public static void main(String[] args) { // main method

        int emplyeeId;
        double basicsalary, HRA, TA, DA, PF, Gosssalary;
        String name;
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter employee Id: ");
        emplyeeId = sca.nextInt();
        System.out.println("Enter employee name: ");
        name = sca.next();
        System.out.println("Enter employee basic salary: ");
        basicsalary = sca.nextInt();

        HRA = basicsalary * 10 / 100;
        TA = basicsalary * 8 / 100;
        DA = basicsalary * 9 / 100;
        PF = basicsalary * 20 / 100;
        Gosssalary = basicsalary + HRA + TA + DA + PF;

        System.out.println("Gross salary = " +Gosssalary);

        sca.close();
        print(emplyeeId,name,basicsalary,HRA,TA,DA,PF,Gosssalary);
    }
    // static method
    public static void print(int employeeId, String name, double basicsalary, double HRA, double TA,double DA, double PF, double grosssalary ){
        System.out.println("________________________________________________________");
        System.out.println("|                       Salary Slip                     |");
        System.out.println("|_______________________________________________________|");
        System.out.println("|   Employee Id             :"      + employeeId+      "|" );
        System.out.println("|   Employee Name           :"      + name+            "|");
        System.out.println("|_______________________________________________________|");
        System.out.println("|   Basic Salary            :"      +basicsalary+      "|");
        System.out.println("|   HRA 10%                 :"      +HRA+              "|");
        System.out.println("|    DA 8%                  :"      +DA+               "|");
        System.out.println("|    TA 9%                  :"      +TA+               "|");
        System.out.println("|    PF 20%                 :"      +PF+               "|");
        System.out.println("|_______________________________________________________|");
        System.out.println("|    Gross Salary           :"      +grosssalary+      "|");
        System.out.println("|=======================================================|");
    }
}
