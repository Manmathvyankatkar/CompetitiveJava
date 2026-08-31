class Ques107
{
    public static void main(String A[])
    {
        int Arr[][] = {{3,2,5,9}, {4,3,2,2}, {8,4,1,5}, {3,9,7,5}}; 

        int i = 0, j = 0, iSum = 0;
            
        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                if(i == j){
                    iSum = iSum+Arr[i][j];
                }
            }
        }

        System.out.println("Addition of diagonal is : "+iSum);
    }
}
