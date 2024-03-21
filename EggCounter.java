/** 
 Program to input no. of eggs and output the no. of trays and dozens possible and other possible information.
 created by Dark-Devil09 
*/ 

package com.students.UltimateJavaCodeVault ;
import com.students.UltimateJavaCodeVault.MethodTemplate  ;

import java.util.InputMismatchException;
import java.util.*;

class EggCounter {
    
    public static void print(String message) {
        System.out.print(message) ;
    }

    public static void println(String message) {
        System.out.println(message);
    }

    public static void calcEgg(long eggNum) {
        if (eggNum >= 0) {
            long trayNum = eggNum / 30;
            long numToCompleteTray = 30 - (eggNum % 30);
            
            if (trayNum > 0) {
                println("\nTHE NO. OF EGG TRAYS ARE : " + trayNum);
                println("\nTHE NO. OF EGGS MORE NEEDED TO COMPLETE A TRAY ARE : " + numToCompleteTray);
            }
            
            long dozenNum = eggNum / 12;
            long numToCompleteDozen = 12 - (eggNum % 12);
            long extraDozens = ((eggNum) - (trayNum * 30)) / 12;
            long extraEggs = ((eggNum) - (trayNum * 30)) % 12;
            
            if (dozenNum > 0) {
                println("\nTHE TOTAL NO. OF DOZENS OF EGG ARE : " + dozenNum);
                println("\nTHE NO. OF EGGS MORE NEEDED TO MAKE A DOZEN ARE : " + numToCompleteDozen);
                println("\nTHE EXTRA NO. OF DOZENS OF EGGS THAT ARE NOT IN TRAYS : " + extraDozens);
            }
            
            if (extraEggs > 0) {
                println("\nTHE NO. OF EXTRA EGGS THAT ARE NOT IN EITHER DOZEN OR TRAYS : " + extraEggs);
            } else {
                println("\nTHE NO. OF EXTRA EGGS THAT ARE NOT IN EITHER DOZEN OR TRAYS : 0\n");
            }
        } else {
            println("NO. OF EGGS CAN'T BE NEGATIVE! WHAT A FOOL 😒\nNever Mind 😁\n");
        }
    }
    
    public static void main(String[] args) {
        println("WELCOME TO THE PROGRAM FOR CALCULATING THE NO. EGGS IN DOZENS AND TRAYS \n");

        Scanner sc = new Scanner(System.in);

        boolean continueChecking ; 

        do {
            long eggNum = MethodTemplate.validLongInput(sc, "PLEASE ENTER THE NO. OF EGGS : ");

            calcEgg(eggNum);
            
            continueChecking = MethodTemplate.validYesNoInput(sc, "DO YOU WANT TO CHECK MORE?\nPLEASE ENTER 1 FOR YES OR 0 FOR NO: ");
        
        } while (continueChecking);

        println("THANK YOU FOR USING THE PROGRAM");
    }
}

// copy paste this into your java IDE and edit as you want.

/* 
EXPLANATION OF THE CODE 👇

This Java program calculates the number of eggs in dozens and trays. Let's go through the code step by step:

1. The program begins with the `EggCounter` class declaration.

2. The `print` method is defined to print a given message without a newline character.

3. The `println` method is defined to print a given message with a newline character.

4. The `validLongInput` method is defined to get valid long input from the user. It takes a `Scanner` object and a prompt message as parameters. 

   Inside the method, a while loop is used to repeatedly ask for user input until a valid long value is entered. If the user enters an invalid value, an `InputMismatchException` is caught, an error message is printed, and the invalid input is consumed using `sc.next()`.

5. The `calculateEggCounts` method is defined to calculate and display the number of trays, dozens, and extra eggs based on the given number of eggs.

   It first checks if the number of eggs is greater than or equal to 0. If not, it prints an error message.

   If the number of eggs is valid, the method calculates the number of trays by dividing the egg number by 30. It calculates the number of eggs needed to complete a tray by taking the remainder of the division.

   If a non-zero number of trays exist, it prints the number of trays and the number of eggs needed to complete a tray.

   Next, it calculates the number of dozens by dividing the egg number by 12. It calculates the number of eggs needed to complete a dozen by taking the remainder of the division. It also calculates the extra dozens by dividing the remainder by 12.

   If a non-zero number of dozens exist, it prints the number of dozens, the number of eggs needed to complete a dozen, and the extra dozens.

   Finally, it checks if any extra eggs exist that are not in either dozens or trays. If so, it prints the number of extra eggs. Otherwise, it prints zero.

6. The `validYesNoInput` method is defined to get a valid yes or no input from the user. It takes a `Scanner` object and a prompt message as parameters.

   Inside the method, a while loop is used to repeatedly ask for user input until a valid numeric value (0 or 1) is entered. If the user enters an invalid value, an `InputMismatchException` is caught, an error message is printed, and the invalid input is consumed using `sc.next()`.

7. The `main` method is the entry point of the program. It starts by printing a welcome message.

8. It creates a `Scanner` object to read user input.

9. It initializes the `continueChecking` variable to `true`.

10. The program enters a do-while loop that allows the user to repeatedly calculate egg counts.

11. Inside the loop, the `getValidLongInput` method is called to get the number of eggs from the user.

12. The `calcEgg` method is called with the entered egg number as an argument to calculate and display the egg counts.

13. The `validYesNoInput` method is called to ask the user if they want to continue checking egg counts. The result is stored in the `continueChecking` variable.

14. The loop continues as long as the user chooses to continue.

15. After the loop ends, a thank you message is printed.

That's the complete explanation of the code. */