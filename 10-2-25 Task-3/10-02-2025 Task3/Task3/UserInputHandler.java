import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInputHandler {

    public static void readUsingBufferedReader() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please type a message : ");
        String userMessage = reader.readLine();
        System.out.println("Your message: " + userMessage);
    }

    public void readUsingScanner() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String sentence = scanner.nextLine();
        System.out.println("You typed: " + sentence);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Integer: " + number);
        scanner.close(); 
    }
}
