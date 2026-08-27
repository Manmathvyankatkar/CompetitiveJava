import java.util.*;

class Logic
{

    public int Arr[][];
    public int iStudents;
    public int iSubjects;

    public Logic(int iStudents, int iSubjects)
    {
        this.iStudents = iStudents;
        this.iSubjects = iSubjects;

        Arr = new int[iStudents][iSubjects];
    }

    public void Accept()
    {
        int i = 0, j = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Marks of each Students : ");

        for(i = 0; i < iStudents; i++){
            System.out.println("Enter the marks of student "+(i+1)+" :");
            for(j = 0; j < iSubjects; j++){
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        int i = 0, j = 0;

        System.out.println("Marks of each student by subjects : ");

        for(i = 0; i < iStudents; i++){
            for(j = 0; j < iSubjects; j++){
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public void CalculateM()
    {
        int i = 0, j = 0, iSum = 0, iMax = 0;

        for(i = 0; i < iStudents; i++){
            for(j = 0; j < iSubjects; j++){

                iSum = iSum+Arr[i][j];
            
                if(iSum > iMax){
                    iMax = iSum;
                }
            }

            System.out.println("Total marks of Student "+(i+1)+" : "+iSum);
            iSum = 0;
        }
        System.out.println("Topper of the class is with marks : "+iMax);
    }

    public void AverageX()
    {
        int iAverage = 0, iSum = 0;

        for(int i = 0; i < iStudents; i++){
            for(int j = 0; j < iSubjects; j++){

                iSum = iSum+Arr[i][j];
                iAverage = iSum/iSubjects;

            }
            System.out.println("Average of  Student "+(i+1)+" : "+iAverage+"%");
            iSum = 0;
        }
    }

    public void CheckPF()
    {
        System.out.println("Failed Students : ");

        for(int i = 0; i < iStudents; i++){
            for(int j = 0; j < iSubjects; j++){
                if(Arr[i][j] <= 35){
                    System.out.println("Student : "+j);
                }
            } 
        }
    }
    
}

class Ques81
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iStudents = 0, iSubjects = 0;
        int iRet = 0;

        System.out.println("Enter the no. of Students : ");
        iStudents = sobj.nextInt();

        System.out.println("Enter the no. of Subjects : ");
        iSubjects = sobj.nextInt();

        Logic lobj = new Logic(iStudents, iSubjects);

        lobj.Accept();
        lobj.Display();
        lobj.CalculateM();
        lobj.AverageX();
        lobj.CheckPF();
        
    }
}