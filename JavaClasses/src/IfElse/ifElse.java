package IfElse;

import java.util.Scanner;

public class ifElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        if (number%2==0){
            System.out.println(number + " is Even number");
        } else {
            System.out.println(number+ " is Odd number");
        }

//        By using Ternaroy operator
//        String output = (number%2==0)?"Even number":"Odd number";
//        System.out.println(output);
    }
}
