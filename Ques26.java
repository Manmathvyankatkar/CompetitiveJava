/*
    Write a program which checks whether 15th bit is ON or OFF
 */

import java.util.*;

class BitwiseX
{
    public void checksBit(int iNo, int iPos)
    {
        int iMask =0X1;

        iMask = iMask << (iPos - 1);

        if((iNo & iMask) == iMask){
            System.out.println("Entered numbers 15Th bit is ON.");
        }else{
            System.out.println("Entered numbers 15Th bit is OFF.");
        }

    }
}

class Ques26
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iLocation = 15;

        Scanner sobj = new Scanner(System.in);
        BitwiseX bobj = new BitwiseX();

        System.out.print("Enter the number : ");
        iValue = sobj.nextInt();

        sobj.nextLine();

        bobj.checksBit(iValue, iLocation);

        sobj.close();
    }
}