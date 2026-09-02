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

        for(i = 0; i < iRow; i++)
        { 
            for(j = 0 , k = iCol - 1; j <= k; j++, k--)
            {
                iTemp = Arr[i][j];
                Arr[i][j] = Arr[i][k];
                Arr[i][k] = iTemp;
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