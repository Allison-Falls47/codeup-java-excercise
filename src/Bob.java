import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type here: ");
        String input = scanner.next();
        if (input.endsWith("?")) {
            System.out.println("Sure");
        }


        if (input.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        }

        if (input.equals("") || input.equals(" ")) {
            System.out.println("Fine. Be that way!");
        }

    }
}
