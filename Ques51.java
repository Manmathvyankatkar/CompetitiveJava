import java.io.*;

class Filecopy
{
    public static void main(String A[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the directory name : ");
        String fileName1 = br.readLine();

        System.out.print("Enter the directory name : ");
        String fileName2 = br.readLine();

        FileInputStream fin = new FileInputStream(fileName1);
        FileOutputStream fout = new FileOutputStream(fileName2);

        int ch;
        
        while ((ch = fin.read()) != -1)
        {
            fout.write(ch);
        }

        fin.close();
        fout.close();

        System.out.println("File copied successfully.");       
    }
}