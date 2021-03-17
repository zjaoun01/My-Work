import java.util.Stack;
import java.util.Scanner;
/**
 * Displays words in a line in reverse order
 *
 * @author Zackery Jaouni
 * @version 4/17/20
 */
public class ReverseByStack
{
    String text;
    /**
     * Constructor for objects of class ReverseByStack
     */
    public ReverseByStack(String text)
    {
        this.text = text;
        Stack<String> reverse = createStack();
        printStack(reverse);
    }

    /**
     * Creates a Stack of Strings out of the instance variable text
     *
     * @return Stack of words based on the String text   
     */
    public Stack<String> createStack()
    {
        Stack<String> reverse = new Stack<String>();
        String[] words = text.split(" ");
        for(int i=0; i < words.length; i++)
        {
            reverse.push(words[i]);
        }
        return reverse;   
    }
    
    /**
     * Takes a stake of strings and prints them starting at the top of the stack to 
     * the bottom of the stack
     *
     * @param s Stack of Strings to print
     */
    public void printStack(Stack<String> s)
    {
        while(s.isEmpty() == false)
        {
            System.out.print(s.pop() + " ");
        }
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a line of text to reverse: ");
        String text = input.nextLine();
        ReverseByStack rbs = new ReverseByStack(text);
    }
}
