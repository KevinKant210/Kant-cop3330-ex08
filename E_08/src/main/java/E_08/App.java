package E_08;

import java.util.Scanner;

/**
 * *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  *  Copyright 2021 Kevin Kant
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);

        System.out.print( "How Many People are there? " );
        int people = reader.nextInt();
        System.out.print("How many Pizza's do you have? ");
        int pies = reader.nextInt();
        System.out.print("How many slices per pizza? ");
        int numslices = reader.nextInt();

        System.out.println(people + " People with " + pies + " Pizzas ( " + numslices*pies + " slices )");

        System.out.println("Each person gets " + pies*numslices/people + " slices of pizza");
        System.out.println("There are " + pies*numslices%people + " leftover number of slices");


    }
}
