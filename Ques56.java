```java id="y5x3qp"
import java.io.*;

class DirectoryFileNames
{
    public static void main(String A[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter directory name : ");
        String dirName = br.readLine();

        System.out.print("Enter new file name : ");
        String fileName = br.readLine();

        File fobj = new File(dirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File files[] = fobj.listFiles();

            FileOutputStream fout = new FileOutputStream(fileName);

            for(int i = 0; i < files.length; i++)
            {
                if(files[i].isFile())
                {
                    fout.write((files[i].getName() + "\n").getBytes());
                }
            }

            fout.close();

            System.out.println("File names written successfully.");
        }
        else
        {
            System.out.println("Directory does not exist.");
        }
    }
}
```
