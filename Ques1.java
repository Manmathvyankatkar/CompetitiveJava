class Logic
{
    void sumOfDigits(int num)
    {
        
        int iDigit = 0, iSum = 0, iCnt = 0;

        while(num != 0){
            iDigit = num % 10;
            iSum = iSum + iDigit;
            num = num / 10;
        }
        
        System.out.println("Sum of Digits is : "+iSum);
    }
}

class ques1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.sumOfDigits(1234);
    }
}