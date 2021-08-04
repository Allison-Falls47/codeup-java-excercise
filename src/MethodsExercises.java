import java.util.Locale;
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

//    public static void main(String[] args) {
//        System.out.println(getInteger(1, 10));
//    }

    public static String factorialString(int number){
        String returnString = "";
        for (int i = 1; i <= number; i++){
            if (i == number){
                returnString +=i;
            }else{
                returnString += i + " x ";
            }
        }

        return returnString;
    }

    public static int factorialSum(int number){

        int sum = 1;

        for (int i = 2; i <= number; i++){
            sum *= i;
        }
        return sum;
    }

public static void factorial(){
  int factorialN = getInteger(1, 10);

  for (int i = 1; i <= factorialN; i++){
      System.out.printf("%d! = ", i);
      System.out.printf("%-18s", factorialString(i));
      System.out.printf("= %d\n", factorialSum(i));
    }
}
//    public static void main(String[] args) {
//        factorial();
//    }


    public static int randomNumbers(int min, int max){
        return (int) ((Math.random() * (max- min)) + min);
    }

public static void dice(){
    Scanner input = new Scanner(System.in);
        System.out.println("How many sides does the dice have?");
        int sides = getInteger(2, 20);

        int firstRoll = randomNumbers(1, sides);
        int secondRoll = randomNumbers(1, sides);

    System.out.printf(" first Die ==> %d\nsecond die ===> %d\n",firstRoll,secondRoll);
    System.out.println("Would you like to continue?");
    String userResponse = input.nextLine();
    boolean doesUser = userResponse.toLowerCase().contains("y");

    if (doesUser){
        dice();
    }

}
//    public static void main(String[] args) {
//    dice();
//    }



}
