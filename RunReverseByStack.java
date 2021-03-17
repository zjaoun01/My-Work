import java.util.Scanner;
/**
 * Run the class EverseByStack using input from the user.
 *
 * @author Zackery Jaouni
 * @version 4/10/2020
 */
public class RunReverseByStack
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a line of text to reverse: ");
        String text = input.nextLine();
        ReverseByStack rbs = new ReverseByStack(text);
    }
}
