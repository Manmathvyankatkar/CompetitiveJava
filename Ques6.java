class Prime
{
    void checkPrime(int num)
    {
        int iCnt = 0;

        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                iCnt++;
            }
        }

        if(iCnt == 2)
        {
            System.out.println(num + " is Prime Number");
        }
        else
        {
            System.out.println(num + " is Not Prime Number");
        }
    }
}

class Ques6
{
    public static void main(String A[])
    {
        Prime pobj = new Prime();
        pobj.checkPrime(11);
    }
}