class Logic
{
    void printDivisibleBy2and3(int N)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= N; iCnt++)
        {
            if(iCnt % 2 == 0 && iCnt % 3 == 0){
                System.out.println("Numbers that are divisible by both 2 & 3 : "+iCnt);
            }
        } 
    }
}

class Ques25
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.printDivisibleBy2and3(50);
    }
}