import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        double pi = 3.14159;

        Scanner scanner = new Scanner(System.in);

//        System.out.format("The value pi is approximately: %.2f", pi);
//
//
//        System.out.println("Give an integer!");
//        int userInt = scanner.nextInt();
//        System.out.println("you entered: " + userInt);

//        System.out.print("Enter three words: ");
//        String wordInput1 = scanner.next();
//        String wordInput2 = scanner.next();
//        String wordInput3 = scanner.next();
//
//        System.out.println("You entered: --> \"" + wordInput1 + wordInput2 + wordInput3 + "\" <--");

//        System.out.print("Enter a sentence: ");
//        String sentInput = scanner.nextLine();
//
//        System.out.println("The sentence is: \"" + sentInput + "\" ");

//
        System.out.println("Enter width: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter length: ");
        double length = Double.parseDouble(scanner.nextLine());
        double area = width * length;
        double perimeter = (width * 2) + (length * 2);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

    }
}
