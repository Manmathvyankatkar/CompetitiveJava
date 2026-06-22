class Logic
{
    void checkLeapYear(int year)
    {
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
        {
            System.out.println("This year is a leap Year.");
        }else{
            System.out.println("This year is a Nonleap Year.");
        }
    }
}
class Ques11
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.checkLeapYear(2023);
    }
}