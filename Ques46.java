import java.io.*;

class Fileopen
{
    public static void main(String A[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the file name : ");
        String fileName = br.readLine();

        FileInputStream fin = new FileInputStream(fileName);

        System.out.println("File opened successfully.");

        fin.close();
    }
}