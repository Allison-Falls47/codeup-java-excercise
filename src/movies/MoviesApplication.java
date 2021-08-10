package movies;
import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {

        boolean running = true;

        while (running){
            System.out.println(returnMenu());

            int  response = returnChoice();

            running = userChoice(response);
        }

    }

    private static boolean userChoice(int choice){
        boolean app = true;
        switch(choice){
            case 0:
                System.out.println("Cya!");
                app = false;
                break;
            case 1:
                for (Movie movie: MoviesArray.findAll()){
                    System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                }
                break;

            case 2:
                System.out.println();
                movieByCategory("animated");
                System.out.println();
                break;
            case 3:
                System.out.println();
                movieByCategory("drama");
                System.out.println();
                break;
            case 4:
                System.out.println();
                movieByCategory("horror");
                System.out.println();
                break;
            case 5:
                System.out.println();
                movieByCategory("scifi");
                System.out.println();
                break;
        }
        return app;
    }


    private static int returnChoice(){
        Input input = new Input();
        System.out.println("Enter choice: ");
        int userResponse = input.getInt(0, 5);
        return userResponse;
    }

    private static void movieByCategory(String category){
        for (Movie movie: MoviesArray.findAll()){
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
            }
        }
    }

    private static String returnMenu(){
        String menu = "What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category";

        return menu;
    }

}
