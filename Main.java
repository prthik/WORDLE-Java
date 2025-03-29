import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Database randomWord = new Database();
      ASCIIArt asciiArt = new ASCIIArt();
      String input = "";

      System.out.println("Welcome to Wordle!");
      System.out.println("The rules are simple...");
      System.out.println(" - You have six tries to guess a five-letter word");
      System.out.println(" - Type in your guess and submit your word by hitting the 'enter' key on your keyboard");
      System.out.println(" - After each guess, you will see a code to help you:");
      // Figure out output code

      Validation validator = new Validation(input, randomWord);
      // Might need to restructure Validation() call for looping
   }
}
