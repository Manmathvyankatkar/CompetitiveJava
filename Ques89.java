import java.util.*;

class Ques89
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iSum = 0;
        int iCnt = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        for(iCnt = 1; iCnt <= iNo/2; iCnt++){
            if(iNo % iCnt == 0){
                iSum = iSum + iCnt;
            }
        }

        if(iSum == iNo){
            System.out.println("It is a perfect number.");
        }else{
            System.out.println("It is not a perfect number.");
        }
    }
}