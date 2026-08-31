import java.util.*;

class Ques104
{
    public static void main(String A[])
    {
        String str = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        str = sobj.nextLine();

        boolean Visited[] = new boolean[256];

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(Visited[ch] == false)
            {
                result.append(ch);
                Visited[ch] = true;
            }
        }

        System.out.println("String after removing duplicates : " + result);
    }
}
