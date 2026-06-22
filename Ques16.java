class Logic
{
    int iSum = 0;
    int iCnt = 0;

    void sumEvenNumbers(int N)
    {
        for(iCnt = 1; iCnt <= N; iCnt++){
            if(iCnt % 2 == 0){
                iSum = iSum + iCnt;
            }
        }
        System.out.println("Summation of Even no. : "+iSum);
    }
}

class Ques16
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.sumEvenNumbers(20);
    }
}