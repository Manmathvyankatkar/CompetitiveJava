import java.io.*;

class Ques96
{
    public static void main(String A[])
    {
        int iNo = 0;
        long iCube = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number : ");
        iNo = Integer.parseInt(bobj.readLine());

        iCube = iNo * iNo * iNo;

        if(String.valueOf(iCube).endsWith(String.valueOf(iNo))){
            System.out.println("It is a trimorphic number.");
        }else{
            System.out.println("It is not a trimorphic number.");
        }

    }
}