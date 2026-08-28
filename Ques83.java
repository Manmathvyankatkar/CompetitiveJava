import java.util.*;

class Ques83
{
    public static void main(String A[])
    {
        int Days = 0, Bill = 0,Discount = 0, fBill = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Number of days stayed : ");
        Days = sobj.nextInt();

        if(Days > 7){
            Bill = Days*3000;
            Discount = Bill*5/100;
            fBill = Bill - Discount;
        }else{
            fBill = Days*3000;
        }

        System.out.print("Final Bill Amount : "+fBill);
    }
}