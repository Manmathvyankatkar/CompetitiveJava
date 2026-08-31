import java.util.*;

class Ques102
{
    public static void main(String A[])
    {
        String str = "Java is powerful";
        int i = 0;

        String words[] = str.split(" ");
        
        for(i = 0; i < words.length; i++)
        {
            StringBuilder  sb = new StringBuilder(words[i]);

            System.out.print(sb.reverse()+" ");
        }
        
        System.out.println();
        
    }
}