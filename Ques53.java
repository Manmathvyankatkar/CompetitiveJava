import java.io.*;

class Directorycreate
{
    public static void main(String A[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the directory name : ");
        String dirName = br.readLine();

        File fobj = new File(dirName);

        if(fobj.mkdir())
        {
            System.out.println("Directory created successfully.");
        }
        else
        {
            System.out.println("Directory already exists.");
        }
    }
}