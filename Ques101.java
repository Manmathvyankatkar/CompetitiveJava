import java.util.*;

class Ques101
{
    

    public static void main(String A[])
    {
        String str1 = null;
        int i = 0;
        int iCount = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first string : ");
        str1 = sobj.nextLine();

        char Arr[] = str1.toCharArray();

        HashMap<Character, Integer> hobj = new HashMap<Character, Integer> ();

        for(char ch : Arr)
        {
            if(hobj.containsKey(ch)){
                iCount = hobj.get(ch);
                hobj.put(ch , iCount+1);
            }else{
                hobj.put(ch, 1);
            }
        }

        System.out.println(hobj);
        
        for(char cValue : hobj.keySet())
        {
            System.out.println(cValue+" -> "+hobj.get(cValue));  
        }
    }
}