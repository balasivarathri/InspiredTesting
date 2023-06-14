package IfElse;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter age : ");
        int age = sc.nextInt();
        System.out.print("Please Enter Weight : ");
        int Weight = sc.nextInt();
        if(age>18){
            if(Weight<=80){
                System.out.println("you are eligible to donate blood");
            }else {
                System.out.println("You are too much weight to donate the blood");
            }
        }else {
            System.out.println("You are not eligible to donate blood");
        }
    }
}
