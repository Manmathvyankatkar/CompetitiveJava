/*
    Write a program which checks whether 5th & 8th bit is ON or OFF
 */
import java.util.*;

class BitwiseX
{
    public void checkBits(int iNo)
    {
        int iMask1 = 0x10;
        int iMask2 = 0X200000;

        if((iNo & iMask1) == iMask1 || (iNo & iMask2) == iMask2){
            System.out.println("5th and 18th bit is ON.");
        }else{
            System.out.println("5th and 18th bit is OFF.");
        }
    }
}

class Ques27
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        BitwiseX bobj = new BitwiseX();

        System.out.print("Enter the number : ");
        iValue = sobj.nextInt();

        bobj.checkBits(iValue);
    }
}