import java.util.*;

class Ques97
{
    public static void main(String A[])
    {
       String str = null;

       Scanner sobj = new Scanner(System.in);

       System.out.println("Enter the string : ");
       str = sobj.nextLine(); 

       String reversed = new StringBuilder(str).reverse().toString();

       if(reversed.equals(str)){
        System.out.println("It is a palindrome string.");
       }else{
        System.out.println("It is not a palindrome string.");
       }
    }
}