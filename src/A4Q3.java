
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peraa0837
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a scanner
        Scanner input = new Scanner(System.in);
        //ask to input 4 numbers on separate lines
        System.out.println("Please enter 4 numbers on different lines");
        
        //store entered numbers in variables
        double one = input.nextDouble();
        double two = input.nextDouble();
        double three = input.nextDouble();
        double four = input.nextDouble();
        
        System.out.println("Your numbers were " + one + ", " + two + ", " + three + " and " + four);
    }
}
