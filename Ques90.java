import java.util.*;

class Ques90
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iTemp = 0;
        int iSum = 0;
        int iDigit = 0;

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        iTemp = iNo;

        while(iNo != 0){
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo/10;
        }

        iNo = iTemp;

        if((iNo % iSum) == 0){
            System.out.println("It is a harshad number.");
        }else{
            System.out.println("It is not a harshad number.");
        }

    }
}