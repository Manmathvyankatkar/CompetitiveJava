class Ques112
{
    public static void main(String A[])
    {
        int Arr[][] = { {3,2,5,9},
                        {4,3,2,2},
                        {8,4,1,5},
                        {3,9,7,5}};

        int i = 0;
        int j = 0;
        int iTemp = 0;

        for(i = 0; i < Arr.length; i++)
        { 
            for(j = i+1; j < Arr[0].length; j++)
            {
                iTemp = Arr[i][j];
                Arr[i][j] = Arr[j][i];
                Arr[j][i] = iTemp;
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