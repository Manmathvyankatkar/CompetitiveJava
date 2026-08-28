import java.util.*;

class Logic
{
    public boolean StrongNumber(int iNo)
    {
        int iFact[] = {1,1,2,6,24,120,720,5040,40320,362880};
        long iSum = 0;
        int iTemp = 0;
        int iDigit = 0;

        iTemp = iNo;

        while(iNo != 0){
            iDigit = iNo % 10;

            iSum = iSum + iFact[iDigit];
            iNo = iNo/10;

            if(iSum > iTemp){
                break;
            }
        }

        if(iSum == iTemp){
            return true;
        }else{
            return false;
        }
        
    }
}

class Ques88
{
    public static void main(String A[])
    {
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        Logic lobj = new Logic();

        bRet = lobj.StrongNumber(iNo);

        if(bRet == true){
            System.out.println("It is strong number.");
        }else{
            System.out.println("It is not strong number.");
        }

    }
}