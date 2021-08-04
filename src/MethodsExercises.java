import java.util.Scanner;
public class MethodsExercises {

//    public static int addition(int a, int b) {
//        return a + b;
//    }
//
//    public static int subtraction(int a, int b) {
//        return a - b;
//    }
//
//    public static int multiplication(int a, int b) {
//        return a * b;
//    }
//
//    public static int division(int a, int b) {
//        return a / b;
//    }
//
//    public static int modulus(int a, int b) {
//        return a % b;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(addition(4, 5));
//        System.out.println(subtraction(7, 4));
//        System.out.println(multiplication(7, 4));
//        System.out.println(division(20, 4));
//        System.out.println(modulus(2, 3));
//    }

    public static int getInteger(int min, int max){

     Scanner input = new Scanner(System.in);

     System.out.print("enter a number between " + min + " - " + max + ": ");

     int response = input.nextInt();

     if (response >= min && response <= max){
         return response;
     }else{
         System.out.println(response + " is not within range.");
         return getInteger(min, max);
     }
    }

    public static void main(String[] args) {
        System.out.println(getInteger(1, 10));
    }




}
