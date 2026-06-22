class Logic
{
    int iDigit = 0;

    void printDigits(int iNo)
    {
        while(iNo != 0){
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }
    }
}

class Ques14
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.printDigits(259);
    }
}