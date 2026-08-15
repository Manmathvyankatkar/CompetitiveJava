import java.io.*;

class Filecreate
{
    public static void main(String A[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the directory name : ");
        String dirName = br.readLine();

        File fobj = new File(dirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            String files[] = fobj.list();

            System.out.println("File and their sizes are : ");

            for(int i = 0; i < files.length; i++)
            {
                System.out.println(files[i].getName() + " : " " + " files[i].length() + "bytes");
            }
        }
        else
        {
            System.out.println("Directory does not exist.")
        }
    }
}