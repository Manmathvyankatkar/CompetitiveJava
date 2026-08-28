import java.util.*;

class Ques87
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.print("Enter the number : ");
        iNo = sobj.nextInt();

        int iDigit = 0;
        long iFact = 0, iSum = 0; 
        int iTemp = 0;

        iFact = 1;

        iTemp = iNo;

        while(iNo != 0){
            iDigit = iNo % 10;

            while(iDigit != 0){
                iFact = iFact * iDigit;
                iDigit--;
            }
            iSum = iSum + iFact;
            iNo = iNo / 10;
            iFact = 1;
        }

        if(iNo == iSum){
            System.out.println("It is a strong number.");
        }else{
            System.out.println("It is not a strong number.");
        }
    }
}