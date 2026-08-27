import java.util.*;

class Ques73
{
    public static void main(String A[])
    {
        int Days = 0;
        int medicineBill = 0;
        int consultationFee = 0;
        String insured = null;
        String wardType = null;
        int totalBill = 0;
        int finalPay = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the no. of days : ");
        Days = sobj.nextInt();

        sobj.nextLine();

        System.out.println("Enter the ward type : ");
        wardType = sobj.nextLine();

        System.out.println("Enter the medicine bill : ");
        medicineBill = sobj.nextInt();

        System.out.println("Enter the consultation fees : ");
        consultationFee = sobj.nextInt();

        sobj.nextLine();

        System.out.println("You have insurance : ");
        insured = sobj.nextLine();

        

        if(wardType.equalsIgnoreCase("ICU")){
            totalBill = 3000*Days+medicineBill+consultationFee;
        }else if(wardType.equalsIgnoreCase("Normal")){
            totalBill = (1000*Days)+medicineBill+consultationFee;
        }else{
            System.out.println("Invalid ward type entered");
            return;
        }

        if(insured.equalsIgnoreCase("Yes")){
            finalPay = (totalBill*70/100);
        }else if(insured.equalsIgnoreCase("No")){
            finalPay = totalBill;
        }else{
            System.out.println("Invalid insurance status entered");
            return;
        }


        System.out.println("Total bill : "+totalBill);
        System.out.println("Insurance Cover : "+insured);
        System.out.println("Final payable bill : "+finalPay);

    }
}