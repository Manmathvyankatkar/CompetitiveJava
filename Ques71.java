import java.util.*;

class Ques71
{
    public static void main(String A[])
    {
        int Bamount = 0;
        int Tamount = 0;
        int Rbalance = 0;
        int NoItems = 0;
        int Nprice = 0;
        int i = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the budget amount : ");
        Bamount = sobj.nextInt();

        System.out.println("Enter the No of items : ");
        NoItems = sobj.nextInt();

        for(i = 1; i <= NoItems; i++){
            System.out.println("Enter the price of " +i+ " item : ");
            Nprice = sobj.nextInt();
            Tamount = Tamount + Nprice;
        }

        if(Bamount >= 0 && Nprice >= 0 && Nprice >= 0){
            Rbalance = Bamount - Tamount;
            System.out.println("Items purchased : "+NoItems);
            System.out.println("Total payable amount  : "+Tamount);
            System.out.println("Remainig balance : "+Rbalance);
        }else{
            System.out.println("Invalid output.");
        }  

    }
}