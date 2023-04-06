package com.company;
import java.util.Scanner;

public class Fibonacci {

    static int fib(int t1,int n,int t2) {
        int sum=0;
        while (t1<n) {
            System.out.println(t1 + " ");
            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n, t1 = 0, t2 = 1;
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the fibonacci series length:" );
        n = scan.nextInt();
        fib(n,t1,t2);
    }
}
