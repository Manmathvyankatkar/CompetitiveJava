/*
    Write  a program which accept one number and position from user and toggle that bit.
    Return modified number.
*/
import java.util.*;

class BitwiseX
{
    public int ToggleBit(int iNo, int iPos)
    {
        int iMask = 0X1, iResult = 0;

        iMask = iMask << (iPos - 1);

        iResult = iNo ^ iMask;

        return iResult;
    }
}

class Ques39
{
    public static void main()
    {
        int iValue = 0, iLocation = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);
        BitwiseX bobj = new BitwiseX();

        System.out.print("Enter the number : ");
        iValue = sobj.nextInt();

        System.out.print("Enter the position : ");
        iLocation = sobj.nextInt();

        iRet = bobj.ToggleBit(iValue,iLocation);

        System.out.println("Updated number : "+iRet);
    }
}