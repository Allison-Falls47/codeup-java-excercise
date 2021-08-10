package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }
    public String getString() {
        System.out.println("Type here:");
        String userString = scanner.nextLine();
        return userString;
    }

    public boolean yesNo(){
        System.out.println("(Y/N) ");
        String userAns = scanner.nextLine();
        return userAns.equals("y");
    }
    public int getInt(int min, int max){
     //   System.out.println("Enter a integer: ");
        int userInt = scanner.nextInt();

        if (userInt < min || userInt > max){
            System.out.println("Try again!");
            return getInt(min, max);
        }
        else{
//            System.out.println("Valid integer");
            return userInt;
        }
    }

    public int getInt(){
        System.out.println("Type an integer: ");
        int userInt = scanner.nextInt();
        return userInt;
    }

    public double getDouble(double min, double max){
        System.out.println("Enter a integer: ");
        double userDouble = scanner.nextDouble();

        if (userDouble < min || userDouble > max){
            System.out.println("Try again!");
            return getDouble(min, max);
        }
        else{
            System.out.println("Valid decimal");
            return userDouble;
        }
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        double userDouble = scanner.nextDouble();
        return userDouble;
    }

}
