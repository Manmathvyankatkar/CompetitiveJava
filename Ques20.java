class Logic
{
    void findSmallestDigit(int N)
    {
        int iCnt = 0, iDigit = 0, iSma = 9;

        while(N != 0)
        {
            iDigit = N % 10;
            if(iDigit < iSma)
            {
                iSma = iDigit;
            }
            N = N / 10;            
        }
        System.out.println("This is the Samllest Digit : "+iSma);
    }
}

class Ques20
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.findSmallestDigit(4682);
    }
}