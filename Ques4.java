class Logic
{
    void findMin(int a, int b, int c)
    {
        int iNo1 = 0, iNo2 = 0, iNo3 = 0;
        int iMin = 0;

        iNo1 = a;
        iNo2 = b;
        iNo3 = c;

        iMin = iNo1;

        if(iNo2 < iMin){
            iMin = iNo2;
        }
        if(iNo3 < iMin){
            iMin = iNo3;
        }
        
        System.out.println("Minimum no is : "+iMin);
    }
}

class ques4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.findMin(5, 3, 2);
    }
}