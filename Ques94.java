import java.util.*;

class Ques95
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iNum = 0;
        long iSroot = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        iNum = iNo + 1;

        iSroot = (int)Math.sqrt(iNum);

        if(iSroot % 1 == 0){
            System.out.println("It is a Sunny number.");
        }else{
            System.out.println("It is not a Sunny number.");
        }
    }
}