
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peraa0837
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String name;
       // sets "input" as a scanner that gets input from keyboard 
        Scanner input = new Scanner(System.in);
        //prints "what's your name?:"
        System.out.print("What's your name?: ");
        name = input.nextLine();
        //next line greets you
        System.out.println("Hello " + name);
    }
}
