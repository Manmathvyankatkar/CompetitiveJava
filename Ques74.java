import java.util.*;

class Ques74
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int SBasefare = 300;
        int AcBaseFare = 600;
        int AcBaseFare2 = 800;

        int Distance = 0;
        int BHbefore = 0;
        int Age = 0;
        String classType = null;
        int TotalFare = 0;

        System.out.println("Enter the Distance of travel : ");
        Distance = sobj.nextInt();

        System.out.println("Enter the Booking hour before travel : ");
        BHbefore = sobj.nextInt();

        System.out.println("Enter the age of passenger : ");
        Age = sobj.nextInt();

        System.out.println("Enter the class type of couch : ");
        classType = sobj.nextInt();

        if(BHbefore < 24){
            if(Distance < 200 && classType.equalsIgnoreCase("Sleeper")){
                TotalFare = SBasefare;
            }
            else if(Distance > 200 && Age < 60 && classType.equalsIgnoreCase("Sleeper")){
                TotalFare = (2*Distance);
            }
            else if(Distance > 200 && Age > 60 && classType.equalsIgnoreCase("Sleeper") && BHbefore > 24){
                TotalFare = (2*Distance)*40/100;
            }
            else if(Distance > 200 && Age > 60 && classType.equalsIgnoreCase("Sleeper")){
                TotalFare = (2*Distance)*40/100;
            }
            else if(Distance < 200 && classType.equalsIgnoreCase("3AC")){
                TotalFare = AcBaseFare;
            }
            else if(Distance < 200 && classType.equalsIgnoreCase("2AC")){
                TotalFare = AcBaseFare2;
            }
            
        }
    }
}