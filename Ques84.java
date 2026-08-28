import java.util.*;

class Ques84
{
    public static void main(String A[])
    {
        int Votes = 0, Vid = 0;
 
        Scanner sobj = new Scanner(System.in);
    
        System.out.println("Enter the number of votes : ");
        Votes = sobj.nextInt();

        if(Votes < 0){
            System.out.println("Invalid number of votes");
            return;
        }

        HashSet<Integer> hobj = new HashSet<Integer>();

        int ValidVoters = 0;
        int DuplicateVoters = 0;

        System.out.println("Enter id's of voted voter");

        for(int i = 0; i < Votes; i++)
        {
            Vid = sobj.nextInt();

            if(Vid < 0){
                System.out.println("Invalid voter id");
                continue;
            }

            if(hobj.contains(Vid)){
                DuplicateVoters++;
            }else{
                hobj.add(Vid);
                ValidVoters++;
            }
        }

        System.out.println("Valid Votes : "+ValidVoters);
        System.out.println("Rejected Duplicate Votes : "+DuplicateVoters);
    }
}