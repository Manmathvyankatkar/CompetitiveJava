class Logic
{
    void checkDivisible(int N)
    {
        if(N % 5 == 0 && N % 11 == 0){
            System.out.println("It is Divisible by 5 of 11.");
        }else{
            System.out.println("It is not Divisible.");
        }
    }
}
class Ques13
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.checkDivisible(5);
    }
}