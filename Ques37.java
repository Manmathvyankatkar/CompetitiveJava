/*
    Write a program which accept one number and position from user and OFF that bit.
    Return modified number.
*/
import java.util.*;

class BitwiseX
{
    public int offBit(int iNo, int iPos)
    {
        int iMask = 0X1;
        int iResult = 0;

        if(iPos < 1 || iPos > 32){
            System.out.println("Invalid Position.");
        }

        iMask = iMask << (iPos - 1);
        iMask = ~iMask;
        iResult = iNo & iMask;

        return iResult;
    }
}

class Ques37
{
    public static void main(String A[])
    {
        int iValue = 0, iLocation = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);
        BitwiseX bobj = new BitwiseX();

        System.out.print("Enter the number : ");
        iValue = sobj.nextInt();

        System.out.print("Enter the Position : ");
        iLocation = sobj.nextInt();

        iRet = bobj.offBit(iValue,iLocation);

        System.out.println("Updated number is : "+iRet);
    }
}