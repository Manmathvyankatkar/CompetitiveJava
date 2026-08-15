import java.io.*;

class CheckRegularFile
{
    public static void main(String A[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the directory name : ");
        String fileName = br.readLine();

        File fobj = new File(fileName);

        if(fobj.exists()){
            if(fobj.isFile())
            {
                System.out.println("It is a regular file.")
            }
            else
            {
                System.out.println("It is not a regular file.");
            }
        }
        else{
            System.out.println("File does not exist.")
        }

    }
}