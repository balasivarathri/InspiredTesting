package GreatestNumber;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        int num1, num2, num3, temp, largest;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        num3 = sc.nextInt();
        temp = Math.max(num1, num2);
        largest = Math.max(temp, num3);
        System.out.println("larest number is :"+largest);
    }
}
