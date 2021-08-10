import java.util.Random;

public class ServerNameGenerator {
public static String[] adjectives = {"humorous", "loud", "short", "tall", "skinny", "big", "bright", "dim", "cold", "hot"};
public static String[] nouns = {"city", "house", "car", "church", "tree", "town", "computer", "school", "mouse", "human"};

    public static void main(String[] args) {
        System.out.println("Here is your server name: ");
        System.out.println(getWord(adjectives) + getWord(nouns));
    }

    public static String getWord(String[] choices) {
        Random random = new Random();
        int randomNumber = random.nextInt(choices.length);
        return choices[randomNumber];
    }

}
