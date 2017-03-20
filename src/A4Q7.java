
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a scanner
        Scanner input = new Scanner(System.in);


        int square = 1;
        System.out.println("You are one the 1st square.");
        while (square < 100) {
            if (square == 100) {
                System.out.println("Congratulations! You win!");
            }
            //gets the sum of the dice
            System.out.println("What was the sum of the rolled dice?: ");
            int dice = input.nextInt();
            //shows player what square they are on
            if (dice >= 2 && dice <= 12) {
                System.out.print("You are now on square ");
                System.out.println(square + dice);
                square = square + dice;
                //snake and ladder traps
                if (square == 9) {
                    square = 34;
                    System.out.println("You're on a ladder! You are now on square 34.");
                }
                if (square == 40) {
                    square = 64;
                    System.out.println("You're on a ladder! You are now on square 64.");
                }
                if (square == 67) {
                    square = 86;
                    System.out.println("You're on a ladder! You are now on square 86.");
                }
                if (square == 54) {
                    square = 19;
                    System.out.println("Uh oh, you're on a snake! You are now on square 19.");
                }
                if (square == 90) {
                    square = 48;
                    System.out.println("Uh oh, you're on a snake! You are now on square 48.");
                }
                if (square == 99) {
                    square = 77;
                    System.out.println("Uh oh, you're on a snake! You are now on square 77.");
                }
                if (square >= 100) {
                    System.out.println("Congratulations! You win!");
                }
            } else {
                //winning statement
                System.out.println("You entered an invalid roll! You lose!!");
                break;
            }

        }
    }
}
