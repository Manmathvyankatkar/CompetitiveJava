import java.util.*;

class Ques85
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = new int[7];

        int Goal = 10000;
        int Steps = 0;
        int iCnt = 0;
        int iMax = 0;

        System.out.println("Enter the steps : ");

        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();

            if(Arr[i] < 0){
                System.out.println("Steps cannot be negative.");
                return;
            }

            if(Arr[i] >= Goal){
                iCnt++;
            }

            if(Arr[i] > iMax){
                iMax = Arr[i];
            }
        }

        System.out.println("Goal Achieved Days : "+iCnt);
        
        System.out.print("Maximum steps in week : "+iMax);
    }
}