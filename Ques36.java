/*
    Write a program which accept one number and position from user and check whether bit at that position is ON or OFF.
    If bit is one return TRUE otherwise return FALSE.
*/
import java.util.*;

class BitwiseX
{
    public boolean ToggleBit(int iNo, int iPos)
    {
        int iMask = 0X1;
        
        if(iPos < 1 || iPos > 32){
            System.out.println("Invalid position.");
        }

        iMask = iMask << (iPos - 1);

        if((iNo & iMask) == iMask){
            return true;
        }else{
            return false;
        }
    }
}

class Ques36
{
    public static void main(String A[])
    {
        int iValue = 0, iLocation = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        BitwiseX bobj = new BitwiseX();

        System.out.print("Enter the number : ");
        iValue = sobj.nextInt();

        System.out.print("Enter the position : ");
        iLocation = sobj.nextInt();

        bRet = bobj.ToggleBit(iValue,iLocation);

        if(bRet == true){
            System.out.println("The bit is ON.");
        }else{
            System.out.println("The bit is OFF.");
        }
    }
}