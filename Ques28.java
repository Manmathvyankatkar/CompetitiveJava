/*
    Write a program which checks whether 7th, 15th, 21th & 28th bit is ON or OFF
 */
import java.util.*;

class BitwiseX
{
    public void checkBits(int iNo)
    {
        int iMask = 0x8104040;

        if((iNo & iMask) == iMask){
            System.out.println("7th, 15th, 21th and 28th bit is ON.");
        }else{
            System.out.println("7th, 15th, 21th and 28th bit is OFF.");
        }
    }
}

class Ques28
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