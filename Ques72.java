import java.util.*;

class Ques72
{
    public static void main(String A[])
    {
        int BatterP = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Battery percentage : ");
        BatterP = sobj.nextInt();

        if(BatterP > 0 && BatterP <= 100){
            if(BatterP <= 5){
                System.out.println("Status : Critical");
            }else if(BatterP <= 15){
                System.out.println("Status : Low");
            }else{
                System.out.println("Status : Normal");
            }
        }else{
            System.out.println("Enter valid input.");
        }
    }
}