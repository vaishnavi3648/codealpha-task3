
import java.util.Scanner;
public class AIChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("AI Chatbot Started");
        System.out.println("Type 'exit' to stop");

        while (true) {

            System.out.print("You: ");
            String msg = sc.nextLine().toLowerCase();

            if (msg.equals("exit")) {
                System.out.println("Bot: Goodbye");
                break;
            }

            if (msg.contains("hello")) {
                System.out.println("Bot: Hi! How are you?");
            } else if (msg.contains("name")) {
                System.out.println(
                        "Bot: I am Java AI Chatbot");
            } else if (msg.contains("java")) {
                System.out.println(
                        "Bot: Java is an object-oriented language");
            } else if (msg.contains("bye")) {
                System.out.println(
                        "Bot: See you later!");
            } else {
                System.out.println(
                        "Bot: Sorry, I don't understand");
            }
        }
        sc.close();
    }
}
