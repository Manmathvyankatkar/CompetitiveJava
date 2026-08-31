import java.util.*;

class Ques99
{
    public static boolean CheckPangram(String str1)
    {
        int i = 0;

        str1.trim();
        str1.replaceAll("\\s", " ");
        str1.toLowerCase();
        char Arr[] = str1.toCharArray();
        int Frequency1[] = new int[26];

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Frequency1[(int)Arr[i] - 97]++;
            }
        }

        for(i = 0; i < Frequency1.length; i++)
        {
            if(Frequency1[i] == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String A[])
    {
        String str1 = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first string : ");
        str1 = sobj.nextLine();

        boolean bRet = false;

        bRet = CheckPangram(str1);

        if(bRet == true){
            System.out.println("String is a Pangram.");
        }else{
            System.out.println("String is not a Pangram.");
        }
    }
}