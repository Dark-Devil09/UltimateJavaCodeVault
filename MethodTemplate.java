/**
 your program topic
 created by  Dark-Devil09 
*/
package com.students.UltimateJavaCodeVault ; 

import java.util.*;

public class MethodTemplate {

// start of the methods for print and println to make the code look clean (optional)

    public static void print(String message) {
        System.out.print(message);
    }

    public static void println(String message) {
        System.out.println(message);
    }

// end of the methods for print and println to make the code look clean (optional)

    public static boolean validYesNoInput(Scanner sc, String prompt) {
        while (true) {
            try {
                print(prompt);
                short userChoice = sc.nextShort();
                if (userChoice == 0) {
                    return false;
                } else if (userChoice == 1) {
                    return true;
                } else {
                    println("PLEASE ENTER EITHER 1 OR 0.\n");
                }
            } catch (InputMismatchException e) {
                println("PLEASE ENTER A NUMERIC VALUE\nn");
                sc.next();
            }
        }
    }

    public static long validLongInput(Scanner sc, String prompt) {
        while (true) {
            try {
                print(prompt);
                return sc.nextLong();
            } catch (InputMismatchException e) {
                println("INVALID INPUT. PLEASE ENTER A VALID INPUT");
                sc.next();
            }
        }
    }

// Method to read short input and handle invalid input
    public static short readShortInput(Scanner sc, String prompt) {
        while (true) {
            try {
                print(prompt);
                return sc.nextShort();
            } catch (InputMismatchException e) {
                println("\nINVALID INPUT. PLEASE ENTER A VALID NUMBER.");
                sc.next();
            }
        }
    }

// Method to read double input and handle invalid input
    public static double readDoubleInput(Scanner sc, String prompt) {
        while (true) {
            try {
                print(prompt);
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                println("\nINVALID INPUT. PLEASE ENTER A VALID NUMBER.");
                sc.next();
            }
        }
    } 

    // Method to read integer input and handle invalid input
    public static int readIntInput(Scanner sc, String prompt) {
        while (true) {
            try {
                print(prompt);
                return sc.nextInt();
            } catch (InputMismatchException e) {
                println("\nINVALID INPUT. PLEASE ENTER A VALID NUMBER.");
                sc.next();
            }
        }
    }

    public static void main(String[] args) {
        println("WELCOME TO THE PROGRAM\n");

        boolean continueChecking ;
        Scanner sc = new Scanner(System.in);

        do {
            long your_variable = validLongInput(sc, "your prompt here");
            continueChecking = validYesNoInput(sc, "DO YOU WANT TO CHECK MORE?\nPLEASE ENTER 1 FOR YES OR 0 FOR NO: ");
           } while (continueChecking);

        println("THANK YOU FOR USING THE PROGRAM");
    }
}

// copy paste this into your java IDE and edit as you want.
