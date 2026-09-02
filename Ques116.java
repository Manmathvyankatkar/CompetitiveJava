class Ques116
{
    public static void main(String A[])
    {
        int Arr[][] = { {1,8,3,0},
                        {0,1,0,5},
                        {0,3,1,0},
                        {0,9,3,1}
                      };

        int i = 0;
        int j = 0;
        int iRow = Arr.length;
        int iCol = Arr[0].length;
        boolean bFlag = false;
        int ACnt = 0;
        int BCnt = 0;

        for(i = 0; i < iRow; i++)
        { 
            for(j = 0; j < iCol; j++)
            {
                if((Arr[i][j] == 0))
                {
                    ACnt++;
                }else{
                    BCnt++;
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

        if(ACnt > BCnt){
            System.out.println("It is a Sparse matrix");
        }else{
            System.out.println("It is not a Sparse matrix");
        }
        
    }
}