import java.util.*;

class Ques60
{
    public static void main(String A[])throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        int  i = 0;
        int Average = 0, Tmarks = 0;


        System.out.println("Enter the no. of subjects : ");
        int iSub = sobj.nextInt();

        int Marks[] = new int[iSub];
        
        for(i = 0; i < Marks.length; i++){
            System.out.println("Enter the Marks of "+(Marks[i] + 1)+" subject : ");
            Marks[i] = sobj.nextInt();
            if(Marks[i] < 35){
                System.out.println("Fail");
                break;
            }
            Tmarks = Tmarks + Marks[i];
        }

        System.out.println("Total marks : "+Tmarks);

        Average = (Tmarks / Marks.length);

        if(Average >= 75){
            System.out.println("Average Marks : "+Average);
            System.out.println("Final Result : Distinction");
        }else if(Average >= 60){
            System.out.println("Average Marks : "+Average);
            System.out.println("Final Result : First class");
        }else if(Average >= 50){
            System.out.println("Average Marks : "+Average);
            System.out.println("Final Result : Second class");
        }if(Average < 50){
            System.out.println("Average Marks : "+Average);
            System.out.println("Final Result : Pass");
        }
        
    }
}