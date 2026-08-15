import java.io.*;

class Filecreate
{
    public static void main(String A[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the file name : ");
        String fileName = br.readLine();

        File fobj = new File(fileName);

        if(fobj.createNewFile())
        {
            System.out.println("File created successfully.");
        }
        else
        {
            System.out.println("File already exists.")
        }
    }
}