package com.LickingHeights;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declare phase
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        Double number;

        System.out.println("This is the Magic 8Ball.");
        System.out.println("Insert a number from the range of 1 to 100.");
        System.out.println("Once you insert a number you'll get the answer to every single one of your questions.");
        number = keyboard.nextDouble();

        if (10>=number && number>0){
            System.out.println("Most likely NOT");
        }
        else if (20>=number && number>10){
            System.out.println("Most likely");
        }
        else if  (30>=number && number>20){
            System.out.println("it is not certain");
        }
        else if (40>=number && number>30){
            System.out.println("it is very certain");
        }
        else if (50>=number && number>40){
            System.out.println("I highly doubt that");
        }
        else if (60>=number && number>50){
            System.out.println("Without a doubt");
        }
       



    }
}
