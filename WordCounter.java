import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Get the sentence input from the user
        String sentence = getSentenceInput(scanner);
        
        // Count the number of words in the sentence
        int wordCount = countWords(sentence);
        
        // Display the word count
        System.out.println("The sentence has " + wordCount + " words.");
        
        // Close the scanner
        scanner.close();
    }
}
