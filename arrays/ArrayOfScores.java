package arrays;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class ArrayOfScores 
{
    // Reads in 5 scores and shows how much each score differs from the highest score
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(in);
        double[] scores = new double[5];
        int index;
        double max;

        out.print("Type in 5 score values >>: ");
        scores[0] = keyboard.nextDouble();
        max = scores[0];
        for(index = 1; index < scores.length; index++)
        {
            scores[index] = keyboard.nextDouble();
            if(scores[index] > max)
            {
                max = scores[index];
            }
        }
        keyboard.close();
        out.println("The highest score is " + max);
        out.println("The scores are: ");
        for(index = 0; index < scores.length; index++)
        {
            out.println(scores[index] + " differs from max by " + (max - scores[index]));
        }
    }    
}
