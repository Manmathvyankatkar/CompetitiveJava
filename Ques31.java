/*
    Write a program which accept one number from user and off 7th bit of that number if it is ON. Return modified number.
*/
import java.util.*;

class BitwiseX
{
    public int ToggleBit(int iNo, int iPos)
    {
        int iMask = 0X40;
        int iResult = 0;

        iResult = iNo ^ iMask;

        return iResult;
    }
}

class Ques31
{
    public static void main(String A[])
    {
        int iValue = 0, iLocation = 7, iRet = 0;

        Scanner sobj = new Scanner(System.in);
        BitwiseX bobj = new BitwiseX();

        System.out.print("Enter the number : ");
        iValue = sobj.nextInt();

        iRet = bobj.ToggleBit(iValue,iLocation);

        System.out.println("Updated Number : "+iRet);
    }
}