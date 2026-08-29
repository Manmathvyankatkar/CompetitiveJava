import java.util.*;

class Ques95
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iCount = 0;
        int iDigit = 0;
        int iTemp = 0;
        int iSum = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        String strNo = String.valueOf(iNo);

        iCount = strNo.length();

        iTemp = iNo;

        while(iNo != 0){
            iDigit = iNo % 10;
            iSum = iSum+(int)Math.pow(iDigit, iCount);
            iNo = iNo / 10;
            iCount--;
        }

        if(iSum == iTemp){
            System.out.println("It is a Disarium number.");
        }else{
            System.out.println("It is not a Disarium number.");
        }
    }
}