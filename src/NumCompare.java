import java.util.Scanner;
public class NumCompare {
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        String trash = "";
        double numOne = 0;
        double numTwo = 0;
        System.out.println("Enter the first number to compare: ");
        if (num.hasNextDouble()) {
            numOne = num.nextDouble();
        }
        else {
            trash = num.nextLine();
            System.out.println("Invalid input, please start over and try again.");
            return;
        }

        System.out.println("Enter the second number to compare: ");
        if (num.hasNextInt()) {
            numTwo = num.nextInt();
        }
        else {
            trash = num.nextLine();
            System.out.println("Invalid input, please start over and try again.");
            return;
        }

        if (numOne == numTwo) {
            System.out.println(numOne + " and " + numTwo + " are equal!");
        }
        else if (numOne < numTwo) {
            System.out.println(numOne + " is less than " + numTwo);
        }
        else if (numTwo < numOne) {
            System.out.println(numTwo + " is less than " + numOne);
        }
        else {
            System.out.println("Error");
        }
    }
}
