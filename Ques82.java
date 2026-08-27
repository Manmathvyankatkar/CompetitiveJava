import java.util.*;

class Logic
{

    public int Arr[][];
    public int iRow;
    public int iCol;
    public int iCnt;

    public Logic(int iRow, int iCol)
    {
        this.iRow = iRow;
        this.iCol = iCol;

        Arr = new int[iRow][iCol];
    }

    public void Accept()
    {
        int i = 0, j = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the position of seats : ");

        for(i = 0; i < iRow; i++){
            System.out.println("Enter the position of seats in "+(i+1)+"row :");
            for(j = 0; j < iCol; j++){
                Arr[i][j] = sobj.nextInt();
                if(Arr[i][j] == 1){
                    iCnt++;
                }    
            }
        }
    }

    public void Display()
    {
        int i = 0, j = 0;

        System.out.println("Seats overview : ");

        for(i = 0; i < iRow; i++){
            for(j = 0; j < iCol; j++){
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public int Count()
    {
        return iCnt;
    }

    public void Maximum()
    {
      int i = 0, j = 0, iSum = 0, iMax = 0;
        
        for(i = 0; i < iRow; i++){
            for(j = 0; j < iCol; j++){

               iSum = iSum+Arr[i][j];

               if(iSum > iMax){
                    iMax = iSum;
                }
            }
            iSum = 0;
        }
        System.out.println("Row with maximum booking : Row "+iMax);  
    }

    public void CheckRows()
    {
        int i = 0, j = 0, iSum = 0, iMax = 0;
        
        for(i = 0; i < iRow; i++){
            for(j = 0; j < iCol; j++){
               iSum = iSum+Arr[i][j];
            }   
        }
        
        if(iSum == 0){
            System.out.println("Full Row Exists : Yes");
        }else{
            System.out.println("Full Row Exists : No");
        }
    }
}

class Ques82
{
    public static void main(String A[])
    {
        int iRow = 0, iCol = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the no. rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter the no. columns : ");
        iCol = sobj.nextInt();

        Logic lobj = new Logic(iRow,iCol);

        lobj.Accept();
        lobj.Display();

        iRet = lobj.Count();
        System.out.println("Total Booked Seats : "+iRet);

        lobj.Maximum();
        lobj.CheckRows();

    }
}