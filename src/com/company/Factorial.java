package com.company;
import java.util.Scanner;

public class Factorial {

    static int fact(int n)
    {
        int output;
        if(n==1){
            return 1;
        }
        output = fact(n-1)*n;
        return output;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        // Scanner object created for storing user input

        System.out.println("Enter the number for factorial: ");

        int num = scanner.nextInt();
        //Stored the entered value in variable "num"

        int factorial = fact(num);
        //Calling the user defined function fact

        System.out.println("Factorial of the entered number is: " + factorial);

    }
}
