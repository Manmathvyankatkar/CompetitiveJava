import java.util.*;

class Ques67
{
    public static void main(String A[])
    {
        int Distance = 0;
        String Phour = null;
        int iTemp = 0;
        int TFare = 0;
        int BFare = 50;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Traveled Distance : ");
        Distance = sobj.nextInt();

        sobj.nextLine();

        System.out.print("Is it peak hour : ");
        Phour = sobj.nextLine();

        if(Distance < 10 ){
            TFare = BFare + (Distance*12);
        }else if(Distance > 10){
            TFare = BFare + (Distance*15);
        }

        iTemp = TFare

        if(Phour.equalsIgnoreCase("Yes")){
            TFare = iTemp + (iTemp*20/100);
        }

        System.out.println("Total Fare : "+TFare);
 
    }
}