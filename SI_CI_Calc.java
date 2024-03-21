/** 
 Simple and compoumd interest calculator
 created by Dark-Devil09 
*/ 

package com.students.UltimateJavaCodeVault ;
import com.students.UltimateJavaCodeVault.MethodTemplate  ;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SI_CI_Calc {

    static short userChoice;
    static double principal, rate, simpleInterest, compoundInterest;
    static int timePeriod;
    
    static Scanner sc = new Scanner(System.in);

    public static void print(String message) {
        System.out.print(message);
    }

    public static void println(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        println("WELCOME TO THE PROGRAM FOR CALCULATING SIMPLE AND COMPOUND INTEREST\n");

        boolean continueChecking ;

        do {

            userChoice = MethodTemplate.readShortInput(sc, "PLEASE ENTER 0 FOR SIMPLE INTEREST OR 1 FOR COMPOUND INTEREST: ");
            principal = MethodTemplate.readDoubleInput(sc, "PLEASE ENTER THE PRINCIPAL: ");
            rate = MethodTemplate.readDoubleInput(sc, "PLEASE ENTER THE RATE OF INTEREST: ");
            timePeriod = MethodTemplate.readIntInput(sc, "PLEASE ENTER THE TIME PERIOD: ");

            if (userChoice == 0) {
                simpleInterest = (principal * rate * timePeriod) / 100;
                println("\nSIMPLE INTEREST IS: " + simpleInterest);
            } else if (userChoice == 1) {
                compoundInterest = principal * Math.pow((1 + (rate / 100)), timePeriod);
                println("\nCOMPOUND INTEREST IS: " + compoundInterest);
            }

            continueChecking = MethodTemplate.validYesNoInput(sc, "DO YOU WANT TO CHECK MORE?\nPLEASE ENTER 1 FOR YES OR 0 FOR NO: ");
           
           } while (continueChecking);

        println("THANK YOU FOR USING THE PROGRAM");
    }

}

// copy paste this into your java IDE and edit as you want.

