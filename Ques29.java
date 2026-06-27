/*
    Write a program which checks whether 7th, 8th & 9th bit is ON or OFF
 */
import java.util.*;

class BitwiseX
{
    public void checkBits(int iNo)
    {
        int iMask = 0X1c0;

        if((iNo & iMask) == iMask){
            System.out.println("7th, 8th and 9th bit is ON.");
        }else{
            System.out.println("7th, 8th and 9th bit is OFF.");
        }
    }
}
class Ques29
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