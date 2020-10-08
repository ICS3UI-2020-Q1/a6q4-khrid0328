import java.util.Scanner;
/**
 * This program takes in two 3D vectors and computes their dot product
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // create a scanner for user input
    Scanner input = new Scanner(System.in);
    
    // declare a constant
    final int THREE_ELEMENTS = 3;

    // create an array with 3 spots for the first vectors
    double[] elements1 = new double[THREE_ELEMENTS];

    // ask the user to type in the 3 values for the first vectors
    System.out.println("Please enter the 3 values for the first vector");

    // put the three values of the first vector into the array using a loop
    for(int i = 0; i < THREE_ELEMENTS; i++){

      // putting the user's value into the array
      elements1 [i] = input.nextDouble();
    }

    // create a secont array with three spots for the second vector
    double[] elements2 = new double[THREE_ELEMENTS];

    // ask the user to enter the 3 values of the second vector
    System.out.println("Please enter the 3 values for the second vector");

    // put the three values of the second vector into an array using a loop
    for(int i = 0; i < THREE_ELEMENTS; i++){

      // putting the user's value into the array
      elements2 [i] = input.nextDouble();
    }

    // create a variable to store the sum
    double sum = 0;

    // calculate the dot product using a loop
    for(int i = 0; i < 3; i++){

      // calculate the product of the first value in both arrays
      double products = elements1[i] * elements2[i];

      // add the products to sum
      sum = sum + products;

    }

    // print the dot product of the two vectors
    System.out.println("The dot product is " + sum);





  }
}
