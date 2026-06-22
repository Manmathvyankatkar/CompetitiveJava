class Logic
{
    void displayFactors(int N)
    {
        int iCnt = 0, iCount = 0;

        for(iCnt = 1; iCnt <= N/2; iCnt++)
        {
            if(N % iCnt == 0)
            {
                iCount++;
            }
        }
        System.out.println("Total count of factors is : "+iCount);
    }
}

class Ques24
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.displayFactors(6);
    }
}