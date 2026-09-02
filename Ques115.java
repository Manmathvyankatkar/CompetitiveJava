class Ques115
{
    public static void main(String A[])
    {
        int Arr[][] = { {1,0,0,0},
                        {0,1,0,0},
                        {0,0,1,0},
                        {0,0,0,1}
                      };

        int i = 0;
        int j = 0;
        int iRow = Arr.length;
        int iCol = Arr[0].length;
        boolean bFlag = false;

        for(i = 0; i < iRow; i++)
        { 
            for(j = 0; j < iCol; j++)
            {
                if((i == j && Arr[i][j] != 1) || (i != j && Arr[i][j] != 0))
                {
                    bFlag = false;
                }else{
                    bFlag = true;
                }
            }
        }     

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[0].length; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }

        if(bFlag == true){
            System.out.println("It is a identity matrix");
        }else{
            System.out.println("It is not a identity matrix");
        }
        
    }
}