import java.util.Scanner;
public class PartyAffiliation {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your party affiliation(D, R, I or Other): ");
        String party = in.nextLine();
        if (party.toUpperCase().equals("D")) {
            System.out.println("You get a Democratic Donkey!");
        }
        else if (party.toUpperCase().equals("R")) {
            System.out.println("You get a Republican Elephant!");
        }
        else if (party.toUpperCase().equals("I")) {
            System.out.println("You get an Independent Person!");
        }
        else {
            System.out.println("You get an Other Otter!");
        }
    }
}
