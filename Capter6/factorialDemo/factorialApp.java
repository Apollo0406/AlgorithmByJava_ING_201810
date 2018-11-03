package factorialDemo;

import java.util.Scanner;

public class factorialApp {
    static int theAnswer;
    public static void main(String[] args) {
        System.out.print("enter a number:");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        theAnswer = factorial(n);
        System.out.println("the answer:"+theAnswer);
    }

    public static int factorial(int n){
        if(n == 0)
            return 1;
        else
            return n*factorial(n-1);
    }
}
