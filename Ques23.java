class Logic
{
    void displayFactors(int N)
    {
        int iCnt = 0, iFact = 0;

        for(iCnt = 1; iCnt <= N/2; iCnt++)
        {
            if(N % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        } 
    }
}

class Ques23
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.displayFactors(6);
    }
}