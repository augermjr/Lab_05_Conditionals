import java.util.Scanner;
public class TheaterKiosk {
    public static void main(String[] args)
    {
        String trash = "";
        Scanner age = new Scanner(System.in);
        System.out.println("Input your age in number of years: ");
        if (age.hasNextInt() && age.nextInt() >= 21) {
            System.out.println("Please take a wrist band.");
        }
        else {
            trash = age.nextLine();
            return;
        }
    }
}
