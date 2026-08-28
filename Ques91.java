import java.util.*;

class Ques91
{
    public static void main(String A[])
    {
        int iNo = 0, iDigit = 0;
        int iSeq = 0, iSum = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        iSeq = iNo * iNo;

        while(iSeq != 0){
            iDigit = iSeq % 10;
            iSum = iSum + iDigit;
            iSeq = iSeq / 10;
        }

        if(iSum == iNo){
            System.out.println("It is a neon number.");
        }else{
            System.out.println("It is not a neon number.");
        }
    }
}