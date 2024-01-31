package arrays;
import static java.lang.System.out;

public class DifferentEquals 
{
    public static void main(String[] args) 
    {
        // A demonstration to show how ==  and an equalsArray method are different
        int[] c = new int[10];   
        int[] d = new int[10];
        
        int i;
        for(i = 0; i < c.length; i++)
        {
            c[i] = i;
        }
        for(i = 0; i < d.length; i++)
        {
            d[i] = i;
        }
        if(c == d)
        {
            out.println("c and d are equal by ==");
        }
        else
        {
            out.println("c and d are NOT equal by ==");
        }

        out.println("== only tests memory addresses.");

        if(equalsArray(c,d))
        {
            out.println("c and d are equal by the equalsArray method.");
        }
        else
        {
            out.println("c and d are NOT equal by the equalsArray method.");
        }
        out.println("An equalsArray method is usually a more useful test.");
    }
    
    public static boolean equalsArray(int[] a, int[] b)
    {
        if(a.length != b.length)
        {
            return false;
        }
        else
        {
            int i = 0;
            while(i < a.length)
            {
                if(a[i] != b[i])
                {
                    return false;
                }
                i++;
            }
        }
        return true;
    }
}
