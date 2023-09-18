import java.util.Scanner;
public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double shipPrice = 0;
        double totalPrice = 0;
        String trash = "";
        System.out.println("Enter the price of your item in USD: ");

        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine();
        }
        else {
            trash = in.nextLine();
            System.out.println("Invalid input, please try again.");
            return;
        }
        if (itemPrice >= 100) {
            shipPrice = 0;
            System.out.println("Your shipping is free! \nTotal price is: $" + itemPrice);
        }
        if (itemPrice < 100) {
            shipPrice = 0.02 * itemPrice;
            totalPrice = shipPrice + itemPrice;
            System.out.println("Your shipping cost is: $" + shipPrice + "\nYour total price is: $" + totalPrice);
        }
    }
}