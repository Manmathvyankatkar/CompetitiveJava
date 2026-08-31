import java.util.*;

class Ques106
{
    public static void main(String A[])
    {
        String str1 = null;
        String str2 = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first string : ");
        str1 = sobj.nextLine();

        System.out.println("Enter second string : ");
        str2 = sobj.nextLine();

        if(str1.length() == str2.length())
        {
            String str3 = str1 + str1;

            if(str3.contains(str2))
            {
                System.out.println("String is a rotation.");
            }
            else
            {
                System.out.println("String is not a rotation.");
            }
        }
        else
        {
            System.out.println("String is not a rotation.");
        }
    }
}
