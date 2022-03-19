// import the package for taking user input
import java.util.Scanner;

public class Math_Operators {
        public static void main(String[ ] args) {

//          Variable initialization
            int number1;
            int number2;

//          Scanner Object Creation, Name = input
            Scanner input = new Scanner(System.in);

//          User Interaction with scanner object usage for receiving input
            System.out.printf("Enter your first number: ");
            number1 = input.nextInt();
            System.out.printf("Enter your second number: ");
            number2 = input.nextInt();
//          Print the result of the numbers
            System.out.println(number1 + " + " + number2 + " = " + (number1+number2));
        }
}