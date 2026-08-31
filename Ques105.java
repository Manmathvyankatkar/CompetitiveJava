import java.util.*;

class Ques105
{
    public static void main(String A[])
    {
        String str = "education";
        int Vowels = 0;
        int Consnants = 0;
        int i = 0;

        char ch[] = str.toCharArray();

        for(i = 0; i < ch.length; i++)
        {
            if( ch[i] == 'a' || ch[i] == 'e' ||
                ch[i] == 'i' || ch[i] == 'o' ||
                ch[i] == 'u')
            {
                Vowels++;
            }else{
                Consnants++;
            }
        }

        System.out.println("Vowels : "+Vowels);
        System.out.println("Consnants : "+Consnants);
    }
}