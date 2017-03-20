
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peraa0837
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a scanner
        Scanner input = new Scanner(System.in);
        
        //prompt user for speed limit
        System.out.println("What was the speed limit?: ");
        int limit = input.nextInt();
        
        //prompt user for their recorded speed
        System.out.println("What was your speed?: ");
        int speed = input.nextInt();
        
        //calculation
        int calc = limit - speed;
        //if statement
        if( calc >= 0){
            System.out.println("Congratulations! You were within the speed limit.");
        }else{
            if(calc < 0 && calc > -21){
                System.out.println("You were speeding and your fine is $100.");
            }
            if(calc < -20 && calc > -31){
                System.out.println("You were speeding and your fine is $270.");
            }
            if(calc <= -31){
                System.out.println("You were speeding and your fine is $500.");
            }
        }
    }
}
