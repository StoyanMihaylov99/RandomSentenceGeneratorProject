import java.util.Random;
import java.util.Scanner;

public class src {
    public static void main(String[] args) {
        System.out.println("Hello, this is your random-generator, and I'm here just for fun!");
        System.out.println("My first random-generated sentence is:");


        String[] names = {"Peter", "Josh", "Steve", "Ivan", "Maria", "George"};
        String[] places = {"Sofia", "Plovdiv", "Berlin", "London", "Burgas"};
        String[] verbs = {"eats", "sees", "bring", "play with", "jump over", "make friends with"};
        String[] nouns = {"stones", "cake", "apple", "bikes", "strangers", "cars"};
        String[] adverbs = {"slowly", "diligently", "warmly", "sadly", "happy", "excited"};
        String[] details = {"near the river", "at home", "at hotel", "in the park", "at work", "on the street"};
        Scanner scanner = new Scanner(System.in);

        while (true) {
    String randomName = getRandomWord(names);
    String randomPlace = getRandomWord(places);
    String randomVerb = getRandomWord(verbs);
    String randomNoun = getRandomWord(nouns);
    String randomAdverb = getRandomWord(adverbs);
    String randomDetail = getRandomWord(details);

            System.out.printf("%s from %s %s %s %s %s.%n",randomName,randomPlace,randomAdverb,randomVerb,randomNoun,randomDetail);
            System.out.printf("Click [Enter] to generate a new one.%n");
            String input = scanner.nextLine();
        }

    }

    public static String getRandomWord(String[] words) {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String word = words[randomIndex];
        return word;
    }
}
