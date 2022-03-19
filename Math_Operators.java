// import the package for taking user input
import java.util.Scanner;

public class Math_Operators {
        public static void main(String[ ] args) {

//          Variable initialization
            int number1;
            int number2;
            String decision;

//          Scanner Object Creation, Name = input
            Scanner input = new Scanner(System.in);

//          User Interaction with scanner object usage for receiving input
            System.out.print("Enter your first number: ");
            number1 = input.nextInt();
            System.out.print("Enter your second number: ");
            number2 = input.nextInt();
            System.out.print("Enter the operation you would like to commit to those numbers: ");
            decision = input.next();

//            If Decision and result printing
            if (decision.equals("+"))
            {
                System.out.println(number1 + " + " + number2 + " = " + (number1+number2));
            }
            if (decision.equals("-"))
            {
                System.out.println(number1 + " - " + number2 + " = " + (number1-number2));
            }
            if (decision.equals("/"))
            {
                System.out.println(number1 + " / " + number2 + " = " + (number1/number2));
            }
            if (decision.equals("*"))
            {
                System.out.println(number1 + " * " + number2 + " = " + (number1*number2));
            }
        }
}