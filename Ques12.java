class Logic
{
    void displayGrade(int Marks)
    {
        if(Marks >= 90){
            System.out.println("A");
        }else if(Marks >= 80){
            System.out.println("B");
        }else if(Marks >= 70){
            System.out.println("c");
        }else{
            System.out.println("D");
        }
    }
}

class Ques12
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.displayGrade(89);
    }
}