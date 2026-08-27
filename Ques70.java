import java.util.*;

class Ques69
{
    public static void main(String A[])
    {
        int Pweight = 0;
        int Ccharge = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the parcel weight : ");
        Pweight = sobj.nextInt();

        if(Pweight <= 1){
            Ccharge = 50;
        }else if(Pweight <= 5){
            Ccharge = 50 + (Pweight * 20);
        }else{
            Ccharge = 150 + (Pweight * 30);
        }

        System.out.println("Courier charge : "+Ccharge);

    }
}