class Logic
{
    void printOddNumbers(int N)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= N; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}
class Ques8
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.printOddNumbers(20);
    }
}