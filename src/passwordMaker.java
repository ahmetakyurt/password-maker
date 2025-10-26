import java.util.Random;
import java.util.Scanner;

public class passwordMaker {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to our banking system!");
        System.out.println("Enter your password size: ");

        int passwordSize = keyboard.nextInt();
        String letters = "abcdefghijklmnopjrstuvyz";
        String special_chars = "-+/*?=)(/&%+/*";
        StringBuilder password = new StringBuilder();

        for (int i = 0; i<passwordSize; i++) {
            int char_num = rand.nextInt(4);

            switch (char_num) {
                case 0:
                    int random_index = rand.nextInt(letters.length()-1);
                    String letter = letters.toLowerCase().charAt(random_index)+"";
                    password.append(letter);
                    break;
                case 1:
                    random_index = rand.nextInt(letters.length()-1);
                    letter = letters.toUpperCase().charAt(random_index)+"";
                    password.append(letter);
                    break;
                case 2:
                    int random_num = rand.nextInt(10);
                    password.append(random_num);
                    break;
                case 3:
                    random_index = rand.nextInt(special_chars.length()-1);
                    String character = special_chars.charAt(random_index)+"";
                    password.append(character);
                    break;
            }
        }
        System.out.println("Your password is: " + password.toString());
    }
}
