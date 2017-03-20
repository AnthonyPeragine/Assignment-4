
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a measurement in inches.");
        double inches = input.nextDouble();
        //conversion from inches to cm
        double cm = 2.54 * inches;
        System.out.println(cm + " cm");
    }
}
