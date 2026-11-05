
package test;


import java.util.Scanner;

public class EligibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to register.");
        } else {
            System.out.println("You are not eligible to register.");
        }

        sc.close();
    }
}