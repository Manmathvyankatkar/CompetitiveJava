import java.util.*;


class Ques66
{
    public static void main(String A[])
    {
        String Helmet = null;
        String License = null;
        String Ovspeed = null;

        int Fine = 0;

        int HFine = 500;
        int LFine = 1000;
        int OSFine = 1500;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Helmet worn : ");
        Helmet = sobj.nextLine();

        System.out.print("License available : ");
        License = sobj.nextLine();

        System.out.print("Overspeeding : ");
        Ovspeed = sobj.nextLine();
        
        if(Helmet.equalsIgnoreCase("Yes") || Helmet.equalsIgnoreCase("No") && License.equalsIgnoreCase("Yes") || License.equalsIgnoreCase("No") && Ovspeed.equalsIgnoreCase("Yes") || Ovspeed.equalsIgnoreCase("No"))
        {
            
            
            if(Helmet.equalsIgnoreCase("No") && License.equalsIgnoreCase("No") && Ovspeed.equalsIgnoreCase("Yes"))
            {
                System.out.println("Total Fine amount : "+(HFine + LFine + OSFine));
            }
            else if(Helmet.equalsIgnoreCase("No") && License.equalsIgnoreCase("No"))
            {
                System.out.println("Total Fine amount : "+(HFine + LFine));
            }
            else if(Helmet.equalsIgnoreCase("No") && Ovspeed.equalsIgnoreCase("Yes"))
            {
                System.out.println("Total Fine amount : "+(HFine + OSFine));
            }
            else if(License.equalsIgnoreCase("No") && Ovspeed.equalsIgnoreCase("Yes"))
            {
                System.out.println("Total Fine amount : "+(LFine + OSFine));
            }
            else if(Helmet.equalsIgnoreCase("No"))
            {
                System.out.println("Total Fine amount : "+(HFine));
            }
            else if(License.equalsIgnoreCase("No"))
            {
                System.out.println("Total Fine amount : "+(LFine));
            }
            else if(Ovspeed.equalsIgnoreCase("Yes"))
            {
                System.out.println("Total Fine amount : "+(OSFine));
            }
            
        }else{
            System.out.println("Invalid input");
        }
    }
}