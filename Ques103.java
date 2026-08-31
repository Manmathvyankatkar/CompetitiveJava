import java.util.*;

class Ques103
{
    public static void main(String A[])
    {
        String str = "Marvellous Infosystems Pune";

        String words[] = str.split(" ");

        int i = 0;
        int iMax = 0;
        String iTemp = null;
 
        for(i = 0; i < words.length - 1; i++)
        {
            if(words[i].length() > iMax){
                iMax = words[i].length();
                iTemp = words[i];
            }
        }

        System.out.println("Largest word length is : "+iTemp);
    }
}