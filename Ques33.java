/*
    Write a program which accept one number from user and toggle 7th bit of that number.
    Return modified number.
*/
import java.util.*;

class BitwiseX
{
    public int ToggleBit(int iNo)
    {
        int iMask = 0X40;
        int iResult = 0;

        iResult = iNo ^ iMask;

        return iResult;
    }
}

class Ques33
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);
        BitwiseX bobj = new BitwiseX();

        System.out.print("Enter the number : ");
        iValue = sobj.nextInt();

        iRet = bobj.ToggleBit(iValue,iLocation);

        System.out.println("Updated number : "+iRet);
    }
}