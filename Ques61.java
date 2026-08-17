import java.util.*;

class Ques61
{
    public static void main(String A[])throws Exception
    {
        int Units = 0, Telectticity = 0, URate = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the no. of units used : ");
        Units = sobj.nextInt();

        if(Units <= 100){
            Telectticity = (Units * 5);
        }else if(Units >= 200){
            Telectticity = (500 + ((Units * 7) - 100));
        }else{
            Telectticity = (1200 + ((Units * 10) - 200));
        }

        System.out.println("Total Electricity Bill : "+Telectticity);
    }
}