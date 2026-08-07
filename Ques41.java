/*
    Write a program which accept one number from user and 
    count number of ON bits in it without % and / operator
*/
import java.util.*;

class BitwiseX
{
    public CountOnBits(int iNo)
    {
        int iCount = 0;

        
    }
}

class Ques41
{
    int iValue = 0, iRet = 0;

    Scanner sobj = new Scanner(System.in);
    BitwiseX bobj = new BitwiseX();

    System.out.print("Enter the number : ");
    iValue = sobj.nextInt();

    iRet = bobj.CountOnBits(iValue);

    System.out.println("The no. of ON bits is : "+iRet);
}