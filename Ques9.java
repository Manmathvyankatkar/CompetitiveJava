class Logic
{
    void sumEvenOddNumbers(int N)
    {
        int iCnt = 0, iEven = 0, iOdd = 0, iSum = 0;

        for(iCnt = 1; iCnt <= N; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iEven = iCnt + iEven;                
            }
            else
            {
                iOdd = iCnt + iOdd;
            }
        }
        System.out.println("Sum of Even : "+iEven);
        System.out.println("Sum of Odd : "+iOdd);
    }
}
class Ques9
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.sumEvenOddNumbers(20);
    }
}