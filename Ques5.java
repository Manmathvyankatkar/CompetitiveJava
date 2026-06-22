class Logic
{
    void printTable(int iNum)
    {
        int iNo = 1, iTable = 0;

        while(iNo != 11){
            iTable = iNum * iNo;
            System.out.println(+iTable);
            iNo++;
        }
    }
}

class ques5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.printTable(3);
    }
}