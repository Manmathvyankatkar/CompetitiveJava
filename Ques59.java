import java.util.*;

class Ques59
{
    public static void main(String A[])
    {
        int Cbalance = 0, Wamount = 0, Rbalance = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the Current balance : ");
        Cbalance = sobj.nextInt();

        System.out.println("Enter the Withdrawal amount : ");
        Wamount = sobj.nextInt();

        Rbalance = Cbalance - Wamount;

        if(Cbalance < 0 || Wamount <= 0){
            System.out.println("Invalid amount.");
        }else if(Wamount >= 1000 || Wamount <= 25000){
            System.out.println("Transaction Successful."); 
            System.out.println("Remaining Balance : "+(Cbalance - Wamount));
        }else{
            System.out.println("Tracsaction failed.");
        }
    }
}