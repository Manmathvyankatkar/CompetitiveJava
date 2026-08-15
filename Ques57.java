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
                    //Write file name
                    String name = files[i].getName(;)

                    fout.write((files[i].getName() + "\n").getBytes());

                    // Write file size 
                    long size = files[i].length(); 
                    
                    fout.write(("File Size : " + size + " bytes\n").getBytes());

                    //Open current file
                    FileInputStream fin = new FileInputStream(files[i])
            
                    int ch;
        
                    //Write file data
                    while((ch = fin.read()) != -1)
                    {
                        fout.write(ch);
                    }

                    fin.close;
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
