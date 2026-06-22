class Logic
{
    void checkPerfect(int N)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1; iCnt <= N/2; iCnt++)
        {
            if(N % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        if(iSum == N)
        {
            System.out.println("This is perfect number.");
        }else{
            System.out.println("This is Notperfect number.");
        }
    }
}

class Ques18
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.checkPerfect(6);
    }
}