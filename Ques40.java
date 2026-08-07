/*
    Write a program which accept one number from user and toggle contents of first and last 
    nibble of the number. Return modified number.
*/

import java.util.*;

class BitwiseX
{
    public int ToggleNibble(int iNo)
    {
        int iMask = 0XF00000F;
        int iResult = 0;

        iResult = iNo ^ iMask;

        return iResult;
    }
}

class Ques40
{
    public static void main(String A[])
    {
        int iValue = 0, iLocation = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);
        BitwiseX bobj = new BitwiseX();

        System.out.print("Enter the number : ");
        iValue = sobj.nextInt();

        iRet = bobj.ToggleNibble(iValue);

        System.out.println("Updated number is : "+iRet);
    }
}