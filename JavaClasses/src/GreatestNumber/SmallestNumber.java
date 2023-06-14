package GreatestNumber;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        int num1,num2,num3,temp,smallest;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        num2 = sc.nextInt();
        System.out.print("Enter third number : ");
        num3 = sc.nextInt();
        temp = Math.min(num1,num2);
        smallest = Math.min(num3,temp);
        System.out.println("Smallest number is : "+smallest);
    }
}
