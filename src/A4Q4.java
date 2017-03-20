
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a scanner
        Scanner input = new Scanner(System.in);

        //food cost
        System.out.println("How much does the food cost?: ");
        double food = input.nextDouble();

        //DJ cost
        System.out.println("How much does the DJ cost?: ");
        double dj = input.nextDouble();

        //hall cost
        System.out.println("How much will it cost to rent out the hall?: ");
        double hall = input.nextDouble();

        //decoration cost
        System.out.println("How much will the decorations cost?: ");
        double decor = input.nextDouble();

        //staff cost
        System.out.println("How much will the staff need to be paid?: ");
        double staff = input.nextDouble();

        //misc cost
        System.out.println("How much will miscellaneous costs be?; ");
        double misc = input.nextDouble();

        //display total price
        System.out.print("Your total cost is $");
        System.out.println(food + dj + hall + decor + staff + misc);

        //display how many tickets must be sold to break even
        double tickets = (food + dj + hall + decor + staff + misc) / 35;
        System.out.println("You will need to sell " + tickets + " tickets to break even.");
    }
}
