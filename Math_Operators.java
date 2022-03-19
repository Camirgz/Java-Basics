import java.util.Scanner;

public class Math_Operators {
        public static void main(String[ ] args) {
            Scanner input = new Scanner(System.in);
            System.out.printf("Enter your first number: ");
            int number1 = input.nextInt();
            System.out.printf("Enter your second number: ");
            int number2 = input.nextInt();
            int result = number1+number2;
            System.out.println(number1 + " + " + number2 + " = " + result);
        }
}

