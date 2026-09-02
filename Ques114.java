class Ques113
{
    public static void main(String A[])
    {
        int Arr[][] = { {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        int i = 0;
        int j = 0;
        int k = 0;
        int iRow = Arr.length;
        int iCol = Arr[0].length;
        int iTemp = 0;

        for(j = 0; j < iCol; j++)
        { 
            for(i = 0 , k = iRow - 1; i <= k; i++, k--)
            {
                iTemp = Arr[i][j];
                Arr[i][j] = Arr[k][j];
                Arr[k][j] = iTemp;
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
        
    }
}