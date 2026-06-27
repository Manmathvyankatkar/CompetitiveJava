/*
    Write a program which accept one number from user and OFF 7th and 10th bit of that number.
    Return modified number.
*/

import java.util.*;

class BitwiseX
{
    public int ToggleBit(int iNo, int iPos1, int iPos2)
    {
        int iMask = 0X240;
        int iResult = 0;

        iResult = iNo ^ iMask;

        return iResult;
    }
}

class Ques32
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0, iLocation1 = 7, iLocation2 = 10;

        Scanner sobj = new Scanner(System.in);
        BitwiseX bobj = new BitwiseX();

        System.out.print("Enter the number : ");
        iValue = sobj.nextInt();

        iRet = bobj.ToggleBit(iValue,iLocation1, iLocation2);

        System.out.println("Updated number : "+iRet);
    }
}