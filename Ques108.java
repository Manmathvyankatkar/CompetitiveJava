import java.util.*;

class Matrix
{
    private int Arr[][];
    private int iRow;
    private int iCol;

    public Matrix(int iRow, int iCol)
    {
        System.out.println("Inside matrix constructor.");

        this.iRow = iRow;
        this.iCol = iCol;

        Arr = new int[iRow][iCol];
    }

    protected void finalize()
    {
        System.out.println("Inside finalize method");

        Arr = null;
        System.gc();
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements of matrix : ");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        System.out.println("elements of the matrix are : ");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public int Frequency(int iNo)
    {
        int iCount = 0;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == iNo){
                    iCount++;
                }
            }
        }

        return iCount;
    }

}

class Ques108
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0, iCol = 0;
        int i = 0, j = 0, iRet = 0;

        System.out.println("Enter no. of Rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter no. of Columns : ");
        iCol = sobj.nextInt();

        Matrix mobj = new Matrix(iRow, iCol);

        mobj.Accept();
        mobj.Display();

        iRet = mobj.Frequency(9);
        System.out.println("Frequency of 9 is : "+iRet);

        mobj = null;

        System.gc();

    }

}