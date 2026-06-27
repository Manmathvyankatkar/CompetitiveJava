/*
    Write a program which checks whether first and last bit is ON or OFF. 
    First bit means bit number 1 and last bit means bit number 32.
*/
import java.util.*;

class BitwiseX
{
    public void checkBits(int iNo)
    {
        int iMask = 0X80000001;

        if((iNo & iMask) == iMask){
            System.out.println("1st and 32th bit is ON.");
        }else{
            System.out.println("1st and 32th bit is OFF.");
        }
    }
}

class Ques30
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