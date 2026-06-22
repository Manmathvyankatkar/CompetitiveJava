class Logic
{
    void countEvenOddRange(int N)
    {
        int eCount = 0, oCount = 0;

        while(N != 0)
        {
            if(N % 2 == 0){
               eCount++; 
            }else{
                oCount++;
            }
            N--;
        }

        System.out.println("Event numbers are : "+eCount);
        System.out.println("Odd numbers are : "+oCount); 
    }
}

class Ques22
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.countEvenOddRange(35);
    }
}