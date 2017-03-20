
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a scanner
        Scanner input = new Scanner(System.in);

        //ask student for name
        System.out.println("Please enter your name:");
        String name = input.nextLine();

        //first test
        System.out.println("What was the first test out of?: ");
        double firstoutof = input.nextDouble();
        System.out.println("What did you get?: ");
        double firstscore = input.nextDouble();

        //second test
        System.out.println("What was the second test out of?: ");
        double secondoutof = input.nextDouble();
        System.out.println("What did you get?: ");
        double secondscore = input.nextDouble();

        //third test
        System.out.println("What was the third test out of?: ");
        double thirdoutof = input.nextDouble();
        System.out.println("What did you get?: ");
        double thirdscore = input.nextDouble();

        //fourth test
        System.out.println("What was the fourth test out of?: ");
        double fourthoutof = input.nextDouble();
        System.out.println("What did you get?: ");
        double fourthscore = input.nextDouble();

        //final test
        System.out.println("What was the fifth test out of?: ");
        double fifthoutof = input.nextDouble();
        System.out.println("What did you get?: ");
        double fifthscore = input.nextDouble();

        //average for each test
        double one = firstscore / firstoutof * 100;
        double two = secondscore / secondoutof * 100;
        double three = thirdscore / thirdoutof * 100;
        double four = fourthscore / fourthoutof * 100;
        double five = fifthscore / fifthoutof * 100;

        System.out.println("Scores for " + name);
        System.out.println("Test 1: " + one + "%");
        System.out.println("Test 2: " + two + "%");
        System.out.println("Test 3: " + three + "%");
        System.out.println("Test 4: " + four + "%");
        System.out.println("Test 5: " + five + "%");

        //display overall average
        double overalloutof = firstoutof + secondoutof + thirdoutof + fourthoutof + fifthoutof;
        double overallscore = firstscore + secondscore + thirdscore + fourthscore + fifthscore;
        double overallaverage = overallscore / overalloutof * 100;
        System.out.println("Overall average: " + overallaverage + "%");
    }
}
