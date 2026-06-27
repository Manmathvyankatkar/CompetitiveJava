/*
    Write a program which accept one number from user and on its first 4 bits.
    Return modified number.
*/
import java.util.*;

class BitwiseX
{
    public int ToggleBits(int iNo)
    {
        int iMask = 0XF;
        int iResult = 0;

        iResult = iNo ^ iMask;

        return iResult;
    }
}

class Ques35
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        BitwiseX bobj = new BitwiseX();

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        iRet = bobj.ToggleBits(iValue);

        System.out.println("Updated number : "+iRet);
    }
}