import java.util.*;

class Ques93
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iDigit = 0;
        int iSum = 0;
        int iMul = 1;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        while(iNo != 0){
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iMul = iMul * iDigit;   
            iNo = iNo / 10;
        }

        if(iSum == iMul){
            System.out.println("It is a Spy number.");
        }else{
            System.out.println("It is not a Spy number.");
        }
    }
}