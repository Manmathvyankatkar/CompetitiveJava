class Logic
{
    void findMax(int a, int b)
    {
        int iNo1 = 0, iNo2 = 0;

        iNo1 = a;
        iNo2 = b;

        if(iNo1 > iNo2){
            System.out.println("a is the Maximum.");
        }else{
            System.out.println("b is the Maximum.");
        }
    }
}

class ques3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.findMax(29, 38);
    }
}