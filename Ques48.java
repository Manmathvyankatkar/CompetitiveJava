import java.io.*;

class Filewrite
{
    public static void main(String A[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the file name : ");
        String fileName = br.readLine();

        FileOutputStream fout = new FileOutputStream(fileName, true);

        System.out.print("Enter data to write : ");
        String data = br.readLine();

        fout.write(data.getBytes());

        fout.close();

        System.out.println("Data written successfully.");
    }
}