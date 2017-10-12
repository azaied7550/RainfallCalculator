package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        String answer="";

        do{
            // Getting data from user
            System.out.println("Enter Width: ");
            double width = Keyboard.nextDouble();

            System.out.println("Enter Length ");
            double length = Keyboard.nextDouble();

            System.out.println("Enter inches of rainfall: ");
            double rainfall = Keyboard.nextDouble();

            // Calling on the method to calculate the rainfall
            CalculateRain(width, length, rainfall);

            // Prompting user whether they want to perform another calculation
            System.out.println("Do you want to perform calculation? (Y/N)");
            answer = Keyboard.next();
        }
        while (answer.equalsIgnoreCase("Y"));


    }
        // Method to calculate rainfall
        private static void CalculateRain(double width1, double length1, double rainfall1){

        double areaInch = (width1 * 12) * (length1 * 12); // Converting the area to inches
        double rain = (areaInch * rainfall1)/231;         // Calculating rainfall then converting to gallons

        System.out.printf ("Rainfall on your roof; " + "%1$.2f", rain);
        System.out.println();

        }
    }
