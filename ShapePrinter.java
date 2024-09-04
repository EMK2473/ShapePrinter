//  Program Title: Shape Area Calculator
//   Student Name: Eric Keeton
  
//   Input: The user selects a shape (Triangle, Square, Trapezoid, or Rectangle)
//          by entering either the corresponding number or typing the shape's name.
//          The program then prompts the user to input the necessary dimensions 
//          (e.g., base and height for a triangle) to calculate the area.
  
//   Output: The program calculates and displays the area of the selected shape.
//           After displaying the result, it asks the user if they want to calculate
//           the area of another shape. If the user chooses to continue, the menu is
//           displayed again; otherwise, the program ends with a message.
  
//   Purpose: This program allows the user to calculate the area of various geometric 
//            shapes (Triangle, Square, Trapezoid, or Rectangle) by providing the
//            corresponding dimensions.

import java.util.Scanner;

public class ShapePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram){
        System.out.println("Which shape would you like to calculate the area for?");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Trapezoid");
        System.out.println("4. Rectangle");

        System.out.print("Enter the name or number corresponding to your choice: ");
        String choice = sc.next().toLowerCase();

        switch (choice){
            case "1":
            case "triangle":
                System.out.println("Enter triangle base: ");
                double triBase = sc.nextDouble();
                System.out.println("Enter triangle height: ");
                double triHeight = sc.nextDouble();
                double triArea = 0.5 * triBase * triHeight;
                System.out.println("Area of the triangle: " + triArea);
                break;
            case "2":
            case "square":
                System.out.println("Enter square length: ");
                double sqLength = sc.nextDouble();
                System.out.println("Enter square width: ");
                double sqWidth = sc.nextDouble();
                double sqArea = (2 * sqLength) + (2 * sqWidth);
                System.out.println("Area of the square is: " + sqArea);
                break;
            case "3":
            case "trapezoid":
                System.out.println("Enter trapezoid base(1): ");
                double trapBase1 = sc.nextDouble();
                System.out.println("Enter trapezoid base(2): ");
                double trapBase2 = sc.nextDouble();
                System.out.println("Enter trapezoid height: ");
                double trapHeight = sc.nextDouble();
                double trapArea = 0.5 * trapHeight * (trapBase1 + trapBase2);
                System.out.println("Area of the trapezoid is: " + trapArea);
            case "4":
            case "rectangle":
                System.out.println("Enter rectangle length: ");
                double recLength = sc.nextDouble();
                System.out.println("Enter rectangle width: ");
                double recWidth = sc.nextDouble();
                double recArea = recLength * recWidth;
                System.out.println("Area of the rectangle is: " + recArea);
            default:
                System.out.println("Invalid selection. Please select again.");
                break;
        }
        System.out.print("Would you like to calculate the area of another shape? (yes/no): ");
        String continueResponse = sc.next().toLowerCase();
        if (!continueResponse.equals("yes")) {
            System.out.println("Thank you for using the Shape Printer. Goodbye!");
            continueProgram = false;
            }
        }
        sc.close();
    }
}
