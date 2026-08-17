import java.util.*;

class Ques67
{
    public static void main(String A[])
    {
        int Aincome = 0;
        int Ttax = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Annual Income : ");
        Aincome = sobj.nextInt();

        if(Aincome < 250000){
            System.out.println("No tax applied.");
        }else if(Aincome <= 500000){
            Ttax = Aincome*5/100;
            System.out.println("Total tax payable : "+Ttax);
        }else if(Aincome <= 1000000){
            Ttax = Aincome*20/100;
            System.out.println("Total tax payable : "+Ttax);
        }else if(Aincome > 1000000){
            Ttax = Aincome*30/100;
            System.out.println("Total tax payable : "+Ttax);
        }
    }
}