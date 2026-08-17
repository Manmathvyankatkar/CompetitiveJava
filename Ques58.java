import java.util.*;

class Ques58
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int Fine = 0;

        System.out.print("Enter the name of book : ");
        String Bname = sobj.nextLine();

        System.out.print("Enter total No. of days : ");
        Integer iDays = sobj.nextInt();

        if(iDays <= 7){
            System.out.println("Returned on time. No fine applied");
        }else if(iDays <= 12){
            Fine = (iDays * 5);
            System.out.println("Total fine to be paid : "+Fine);
        }else{
            Fine = (iDays * 10);
            System.out.println("Total fine to be paid : "+Fine);
        } 
    }
}