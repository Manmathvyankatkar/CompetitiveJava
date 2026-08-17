import java.util.*;

class Ques69
{
    public static void main(String A[])
    {
        int Marks = 0;
        int Attendance = 0;
        int Income = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Obtained Marks : ");
        Marks = sobj.nextInt();

        System.out.println("Enter Attendance : ");
        Attendance = sobj.nextInt();

        System.out.println("Enter Family income : ");
        Income = sobj.nextInt();

        if(Marks >= 80 && Attendance >= 75 && Income <= 300000){
            System.out.println("Scholarship Approved.");
        }else{
            System.out.println("Scholarship Rejected.");
        }
    }
}