import java.util.*;



class Ques62
{
    public static void main(String A[])
    {
        int PurValue = 0;
        String Mtype = null;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the purchase amount : ");
        PurValue = sobj.nextInt();

        sobj.nextLine();

        System.out.print("Enter the membership type : ");
        Mtype = sobj.nextLine();

        int Discount = 0;
        int pDiscount = 0;
        int FAmount = 0;

        if(PurValue < 0){
            System.out.println("Invalid Amount");
        }else if(PurValue > 5000){
            Discount = PurValue*20/100;
            FAmount = PurValue - Discount;

            if(Mtype.equalsIgnoreCase("Premium")){
                pDiscount = FAmount*5/100;
                FAmount = FAmount - pDiscount;
                Discount = Discount+pDiscount;
            }
        }else if(PurValue > 2000){
            Discount = PurValue*10/100;
            FAmount = PurValue - Discount;

            if(Mtype.equalsIgnoreCase("Premium")){
                pDiscount = FAmount*5/100;
                FAmount = FAmount - pDiscount;
                Discount = Discount+pDiscount;
            }
        }else{
            System.out.println("No discount applied.");
        }

        System.out.println("Total Bill : "+PurValue);
        System.out.println("Total Discount : "+Discount);
        System.out.println("Final payable amount : "+FAmount);
       
    }
}