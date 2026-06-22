class Logic
{
    void productOfDigits(int N)
    {
        int iPro = 1, iDigit = 0;

        while(N != 0)
        {
            iDigit = N % 10;
            iPro = iPro * iDigit;
            N = N / 10;
        }
        System.out.println("The product of digits is : "+iPro);
    }
}

class Ques21
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.productOfDigits(4682);
    }
}