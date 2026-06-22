class Logic
{
    void printReverse(int N)
    {
        int iCnt = 0;

        for(iCnt = N; iCnt >= 1; iCnt--)
        {
            System.out.println(iCnt);
        }
    }
}

class Ques17
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.printReverse(20);
    }
}