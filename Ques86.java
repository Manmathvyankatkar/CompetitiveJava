import java.util.*;

class Ques86
{
    public static void main(String A[])
    {
        int Duration = 0;
        int Tcharge = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter call duration : ");
        Duration = sobj.nextInt();

        if(Duration <= 5){
            Tcharge = 0;
        }else if(Duration <= 15){
            Tcharge = Duration - 5;
        }else{
            Tcharge = 10 +(( Duration - 15) * 2);
        }

        System.out.println("Call duration : "+Duration);
        System.out.println("Total call charge : "+Tcharge);
    }
}