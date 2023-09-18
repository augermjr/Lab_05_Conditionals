import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of your birth month(1-12): ");
        int bmonth = 0;
        bmonth = in.nextInt();
        if (bmonth >= 1 && bmonth <= 12) {
            System.out.println("Your birth month is: " + bmonth);
            in.nextLine();
        }
        else {
            System.out.println("You entered an incorrect month value: " + bmonth);
        }
    }
}
