class Logic
{
    void checkSign(int N)
    {
        if(N < 0){
            System.out.println("The no. is Negative.");
        }else if(N > 0){
            System.out.println("The no. is Positive.");
        }else{
            System.out.println("The no. is Zero.");
        }
    }
}
class Ques10
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.checkSign(-3);
    } 
}