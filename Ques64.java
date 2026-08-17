import java.util.*;


class Ques64
{
    public static void main(String A[])
    {
        int Age = 0;
        int Mincome = 0;
        int Cscore = 0;
        String UnLoan = null;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Age : ");
        Age = sobj.nextInt();

        System.out.print("Enter Monthly income : ");
        Mincome = sobj.nextInt();

        System.out.print("Enter Credit score : ");
        Cscore = sobj.nextInt();

        sobj.nextLine();

        System.out.print("Existing unpaid loan : ");
        UnLoan = sobj.nextLine();
        
        if(Age > 0 && Mincome > 0 && Cscore > 0 && UnLoan == "Yes" || UnLoan == "No")
        {
            if(Age > 21 || Age < 60 && Mincome >= 25000 && Cscore >= 700 && UnLoan == "No"){
                System.out.println("Loan Approved.");
            }else{
            System.out.println("Loan Rejected : ");
        }
        }else{
            System.out.println("Invalid input");
        }
    }
}