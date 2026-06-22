class Logic
{
    void findLargestDigit(int N)
    {
        int iCnt = 0, iDigit = 0, iMax = 0;

        while(N != 0)
        {
            iDigit = N % 10;
            if(iMax < iDigit)
            {
                iMax = iDigit;
            }
            N = N / 10;            
        }
        System.out.println("This is the Largest Digit : "+iMax);
    }
}

class Ques19
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.findLargestDigit(7683);
    }
}