package CoreJava;

import java.util.Arrays;
import java.util.Scanner;

public class ClassA084 
{
    void meth1() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to book your show"); // Print a welcome message
        System.out.println("Please feel free to select an option"); // Prompt the user to select an option
        System.out.println("--");
        System.out.println("1> Avatar");
        System.out.println("2> 18 Pages");
        System.out.println("3> Circus");
        System.out.println("-----");
        switch(sc.nextInt()) 
        { // Get user input and switch based on the selected option
            case 1:
                System.out.println("How many tickets do you need for Avatar 2?"); // Prompt for the number of tickets
                int tickets1 = sc.nextInt(); // Get the number of tickets
                System.out.print("Please enter " + tickets1 + " names for seat booking"); // Prompt for names
                String[] names1 = new String[tickets1]; // Create an array to store names
                for (int i = 0; i < names1.length; i++) 
                {
                    names1[i] = sc.next(); // Read names from the user
                }
                System.out.println("Tickets were successfully booked for: " + Arrays.toString(names1)); // Print the booked tickets
                break;
            case 2:
                System.out.println("How many tickets do you need for 18 Pages?"); // Prompt for the number of tickets
                int tickets2 = sc.nextInt(); // Get the number of tickets
                System.out.print("Please enter " + tickets2 + " names for seat booking"); // Prompt for names
                String[] names2 = new String[tickets2]; // Create an array to store names
                for (int i = 0; i < names2.length; i++) 
                {
                    names2[i] = sc.next(); // Read names from the user
                }
                System.out.println("Tickets were successfully booked for: " + Arrays.toString(names2)); // Print the booked tickets
                break;
            case 3:
                System.out.println("How many tickets do you need for Circus?"); // Prompt for the number of tickets
                int tickets3 = sc.nextInt(); // Get the number of tickets
                System.out.print("Please enter " + tickets3 + " names for seat booking"); // Prompt for names
                String[] names3 = new String[tickets3]; // Create an array to store names
                for (int i = 0; i < names3.length; i++) 
                {
                    names3[i] = sc.next(); // Read names from the user
                }
                System.out.println("Tickets were successfully booked for: " + Arrays.toString(names3)); // Print the booked tickets
                break;
            default:
                break;
        }
    }
    
    public static void main(String[] args) 
    {
        new ClassA084().meth1(); // Create an instance of ClassA084 and call the meth1() method
    }
}
