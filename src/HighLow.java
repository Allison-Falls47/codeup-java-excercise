public class HighLow {

    static int randomNumber = MethodsExercises.randomNumbers(1, 100);

    public static int promptToGuess(){
        System.out.println("guess the number: ");
        int userGuessNumber = MethodsExercises.getInteger(1, 100);
        return userGuessNumber;
    }


    public static void game(){

        int randomNumber = MethodsExercises.randomNumbers(1, 100);
        int userLastGuess;
        do{
            userLastGuess = promptToGuess();

            if (userLastGuess > randomNumber){
                System.out.println("You need to go lower!");
            }else if (userLastGuess < randomNumber){
                System.out.println("You need to go higher!");
            }
        }while (userLastGuess != randomNumber);

        System.out.println("you got it!");

    }

    public static void main(String[] args) {
      game();
    }

}
