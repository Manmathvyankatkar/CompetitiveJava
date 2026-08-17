import java.util.*;

class Ques65
{
    public static void main(String A[])
    {
        int Cstock = 0;
        int Rquantity = 0;
        int Rstock = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter current stock : ");
        Cstock = sobj.nextInt();

        System.out.println("Enter requested quantity : ");
        Rquantity = sobj.nextInt();

        Rstock = Cstock - Rquantity;

        if(Cstock > 0 && Rquantity > 0){
            if(Cstock > Rquantity){
                System.out.println("Order Processed Successfully.");
                System.out.print("Remaining Stock : "+Rstock);

                if(Rstock <= 5){
                    System.out.println(" -> Low Stock Alert!");
                }
            }else{
                System.out.println("Order Failed : Insufficient Stock");
            }
        }else{
            System.out.println("Invalid input.");
        }
    }
}