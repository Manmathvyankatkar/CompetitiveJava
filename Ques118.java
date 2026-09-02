import java.io.*;
import java.net.*;

class Ques118
{
    public static void main(String A[])
    {
        try
        {
            ServerSocket serversocket = new ServerSocket(9000);

            System.out.println("-----------------------------------");
            System.out.println("---- Marvellous Server Started ----");
            System.out.println("-----------------------------------");

            //Loop for Multiple client request
            while(true)
            {
                System.out.println("Server is waiting for client");

                Socket clientsocket = serversocket.accept();

                System.out.println("Client connected successfully");

                // Thread gets created for client
                Thread t = new Thread(() -> HandleClientRequest(clientsocket));

                t.start();
            }// End of while
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : "+e);
        }
    }// End of main

    public static void HandleClientRequest(Socket socket)
    {
        try
        {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            dos.writeUTF("Connected to Marvellous server");

            while(true)
            {
                String command = dis.readUTF();

                System.out.println("Command Received from client "+command);

                String parts[] = command.split(" ");

                String operation = parts[0].toUpperCase();

                if(operation.equals("QUIT")){
                    dos.writeUTF("Disconnected from server");
                    break;
                }

                if(parts.length != 3){
                    dos.writeUTF("Invalid command format");
                    continue;
                }

                double No1 = Double.parseDouble(parts[1]);
                double No2 = Double.parseDouble(parts[2]);

                double result = 0.0;

                if(operation.equals("ADD"))
                {
                    result = No1 + No2;

                    dos.writeUTF("Result is : "+result);
                }
                else if(operation.equals("SUB"))
                {
                    result = No1 - No2;

                    dos.writeUTF("Result is : "+result);
                }
                else if(operation.equals("MUL"))
                {
                    result = No1 * No2;

                    dos.writeUTF("Result is : "+result);
                }
                else if(operation.equals("DIV"))
                {
                    result = No1/No2;

                    dos.writeUTF("Result is : "+result);
                }

                

            }// End of while
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : "+e);
        }

    }// End of Function
    
}// End of class