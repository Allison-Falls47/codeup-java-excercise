import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type here: ");
        boolean letsContinue = true;
        do {
            String input = scanner.nextLine().trim();
            if (input.endsWith("?")) {
                System.out.println("Sure");
            } else if (input.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (input.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }

            System.out.println("would you like to continue? (y/n)");
            String response = scanner.nextLine();
            if (!response.equals("y")) {
                letsContinue = false;
                System.out.println("Later Dude");
            } else {
                System.out.println("What do you want dude?");
            }
        } while (letsContinue);

    }
}
