import java.util.*;

class Ques100
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

        System.out.println("Duplicate characters are : ");

        for(Map.Entry<Character, Integer> eobj : hobj.entrySet())
        {
            if(eobj.getValue() > 1){
                System.out.println(eobj.getKey());
            }
        }
    }
}