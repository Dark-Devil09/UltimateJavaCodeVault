/** 
 A program to input the side of a triangle. It checks if the triangle is valid and return the types.
 created by Dark-Devil09 
*/ 

package java_code_vault;

import java.util.*;

public class TriCheck {

    static short userChoice;
    static boolean continueChecking;
    static boolean validTri;
    static double s1;
    static double s2;
    static double s3;
                
    public static void print(String message) {
        System.out.print(message);
    }

    public static void println(String message) {
        System.out.println(message);
    }

    // Method to print the type of triangle
    public static void printTriangleType(boolean a , boolean b , boolean c , boolean a1 , boolean b1 , boolean c1){
        if (a && b && c ) {
            println("THE TRIANGLE IS EQUILATERAL\n");
        } else if ((a && b1 && c1) || (a1 && b && c1) || (a1 && b1 && c )) {
            println("THE TRIANGLE IS ISOSCELES\n");
        } else {
            println("THE TRIANGLE IS SCALENE\n");
        }
    }

    // Method to get user choice for continuing
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


    // Main method
    public static void main(String[] args) {
        println("WELCOME TO THE PROGRAM FOR INPUTTING THREE SIDES OF A TRIANGLE AND VERIFYING IF IT'S A TRIANGLE AND TO RETURNI ITS TYPE\n");

        Scanner sc = new Scanner(System.in);

        do {
            
            s1 = MethodTemplate.validLongInput(sc, "PLEASE ENTER THE FIRST SIDE: ");
            s2 = MethodTemplate.validLongInput(sc, "PLEASE ENTER THE SECOND SIDE: ");
            s3 = MethodTemplate.validLongInput(sc, "PLEASE ENTER THE THIRD SIDE: ");

            boolean a = s1 == s2;
            boolean b = s2 == s3;
            boolean c = s1 == s3;
            boolean a1 = s1 != s2;
            boolean b1 = s2 != s3;
            boolean c1 = s1 != s3;

            validTri = (s1 + s2) > s3 && (s1 + s3) > s2 && (s2 + s3) > s1;

            if (validTri) {
                println("THE TRIANGLE IS VALID\n");
                printTriangleType(a , b , c , a1 , b1 , c1);
            } else {
                println("INVALID LENGTH OF TRIANGLE ENTERED\n");
            }

            continueChecking = validYesNoInput(sc, "DO YOU WANT TO CHECK FOR MORE TRIANGLES ?\n\nPLEASE ENTER 1 FOR YES OR 0 FOR NO: ");
        
        } while (continueChecking);

        println("\nTHANK YOU FOR USING THE PROGRAM");
    }
}
