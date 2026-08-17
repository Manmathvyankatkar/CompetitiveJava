import java.util.*;

class Fees
{   
    int Pcharge(int hours)
    {
        int Pfees = 0;

        if(hours <= 2){
            Pfees = 20;
        }else if(hours > 2){
            Pfees = hours*10;
        }else{
            Pfees = hours*10+50;
        }

        return Pfees;
    }
}
class Ques63
{
    public static void main(String A[])
    {
        int Hours = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        Fees fee = new Fees();
        
        System.out.print("Enter parking duration : ");
        Hours = sobj.nextInt();

        iRet = fee.Pcharge(Hours);

        System.out.println("Total parking fee : "+iRet);
    }
}