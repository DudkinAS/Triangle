// Alia Dudkin
// COSC 1430 -501
// Project #4
// Due date: 3/28/2018
// Description: Nested for loops used to make a triangle of asterisks, size of triangle given by user input.

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        // create instance of scanner
        Scanner keyboard = new Scanner(System.in);

        // ask for user input of integer for triangle size
        System.out.print("Enter a number 1-50: ");

        //define integer 'number' and store user keyboard input here
        int number = keyboard.nextInt();

        //create integer variable for how many asterisks will be in one line
        int amount = 0;

        // the outside loop controls number of lines to write
        for (int i = 0; i < number + number - 1; i++) {

            // increment/decrement 'amount' variable
            if (i < number) amount++;
            else amount--;

            // inside loop prints asterisks dictated by 'amount' and 'j' variables
            for (int j = 0; j < amount; j++) {
                System.out.print('*');
            }
            // go to next line after printing one line of stars
            System.out.println("");
        }

        keyboard.close();
    }

}

