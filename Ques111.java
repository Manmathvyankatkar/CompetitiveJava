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

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements of matrix : ");

        for(int i = 0; i < iRow; i++)
        {
            System.out.println("Enter the elements "+(i+1)+" row : ");

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

    public int AddDiagonal()
    {
        int iSum = 0;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(i+j == (iRow-1))
                {
                    iSum = iSum+Arr[i][j];
                }
            }
        }

        return iSum;
    }

    public int MaxInDiagonal()
    {
        int iSum = 0;
        int iMax1 = 0;
        int iMax2 = 0;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(i == j )
                {
                    if(Arr[i][j] > iMax1)
                    {
                        iMax1 = Arr[i][j];
                    }
                }
            }
        }

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(i+j == (iRow-1))
                {
                    if(Arr[i][j] > iMax2)
                    {
                        iMax2 = Arr[i][j];
                    }
                }
            }
        }

        if(iMax1 > iMax2){
            return iMax1;
        }

        return iMax2;
    }

    public void  AddColumn()
    {
        int iSum = 0;
    
        for(int j = 0; j < iCol; j++)
        {
            iSum = 0;

            for(int i = 0; i < iRow; i++)
            {
                iSum = iSum+ Arr[i][j];
            }

            System.out.println("Addition of "+(j+1)+" column "+iSum);
        }
    }

    public void SwapRows()
    {
        int i = 0;
        int j = 0;
        int iTemp = 0;

        for(i = 0; i < iRow; i = i+2)
        { 
            for(j = 0; j < iCol; j++)
            {
               iTemp = Arr[i][j];
               Arr[i][j] = Arr[i+1][j];
               Arr[i+1][j] = iTemp;
            }
        }     

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

class Ques111
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

        iRet = mobj.AddDiagonal();
        System.out.println("Addition of diagonal is : "+iRet);

        iRet = mobj.MaxInDiagonal();
        System.out.println("Greatest number in both diagonal is : "+iRet);

        mobj.AddColumn();
        mobj.SwapRows();

        mobj = null;

        System.gc();

    }

}