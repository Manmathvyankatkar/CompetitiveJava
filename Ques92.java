import java.io.*;

class Ques92
{
    public static void main(String A[])throws Exception
    {
        int iNo = 0;
        int iCnt = 0;
        int iSeq = 0;
        int iDen = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number : ");
        iNo = Integer.parseInt(bobj.readLine());

        int iTemp = iNo;

        iSeq = iNo * iNo;

        while(iNo != 0){
            iCnt++;
            iNo = iNo / 10;
        }

        iDen = (int)Math.pow(10,iCnt);

        if((iSeq % iDen) == iTemp){
            System.out.println("It is a Automorphic number.");
        }else{
            System.out.println("It is not a Automorphic number.");
        }
    }
}