import java.io.*;
import java.util.zip.CRC32;

class FileChecksum
{
    public static void main(String A[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the directory name : ");
        String dirName = br.readLine();

        FileInputStream fin = new FileInputStream(fileName);

        CRC32 crc = new CRC32();

        int ch;

        while((ch = fin.read()) != -1)
        {
            crc.update(ch);
        }

        fin.close();

        System.out.println("Checksum of file is : " + crc.getValue());
    }
}