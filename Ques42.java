/*
    Write a program accept two numbers from user and display position
    of common ON bits from that two numbers.
*/
import java.util.Scanner;

class CommonOnBits
{
    public static void displayCommonOnBits(int no1, int no2)
    {
        int result = no1 & no2;

        System.out.print("Common ON bit positions are : ");

        int position = 1;

        while(result != 0)
        {
            if((result & 1) == 1)
            {
                System.out.print(position + " ");
            }

            result = result >> 1;
            position++;
        }

        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int no1 = sobj.nextInt();

        System.out.print("Enter second number : ");
        int no2 = sobj.nextInt();

        displayCommonOnBits(no1, no2);

        sobj.close();
    }
}