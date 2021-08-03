import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type here: ");
        String input = scanner.nextLine().trim();
        if (input.endsWith("?")) {
            System.out.println("Sure");
        }


        else if (input.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        }

        else if (input.isEmpty()) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }

    }
}
