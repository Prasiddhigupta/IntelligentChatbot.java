import java.util.Scanner;

public class IntelligentChatbot
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot: Hello! How can I assist you today?");
        
        while(true)
        {
            System.out.print("User: ");
            String userInput = scanner.nextLine();

            String botResponse = getResponse(userInput);
            System.out.println("Chatbot: " + botResponse);

            if(userInput.equalsIgnoreCase("exit"))
            {
                System.out.println("Chatbot: Goodbye! Have a great day.");
                break;
            }
        }
        scanner.close();
    }
    public static String getResponse(String userInput)
    {
        if(userInput.contains("hi")||userInput.contains("hello"))
        {
            return "Hi there! How can I help you?";
        }
        else if(userInput.contains("how are you"))
        {
            return "I'm justa chatbot, but I'm here to assist you!";
        }
        else if(userInput.contains("thank you"))
        {
            return "You're welcome! Feel free to ask me anything.";
        }
        else
        {
            return "I'm sorry, I didn't understand that.can you please rephrase?";
        }
    }
}
