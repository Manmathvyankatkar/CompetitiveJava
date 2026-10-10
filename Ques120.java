class Ques120
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

                if(parts.length != 2){
                    dos.writeUTF("Invalid command format");
                    continue;
                }

                int iNo = Integer.parseInt(parts[1]);

                int result = 0;

                if(operation.equals("LENGTH"))
                {
                    if(iNo % 2 == 0){
                        dos.writeUTF(iNo+" is a Even number.");
                    }else{
                        dos.writeUTF(iNo+" is not a Even number.");
                    }
                }
                else if(operation.equals("ODD"))
                {
                    if(iNo % 2 != 0){
                        dos.writeUTF(iNo+" is a Odd number.");
                    }else{
                        dos.writeUTF(iNo+" is not a Odd number.");
                    }
                }
                else if(operation.equals("PRIME"))
                {
                    if(iNo % 1 == 0 && iNo % iNo == 0){
                        dos.writeUTF(iNo+" is a Prime number.");
                    }else{
                        dos.writeUTF(iNo+" is not a Prime number.");
                    }
                }
                else if(operation.equals("PERFECT"))
                {
                    // DEBUG LINE: Find out what the server actually thinks iNo is!
                    System.out.println("DEBUG: Server received iNo = " + iNo);

                    // Guard clause: Perfect numbers must be positive and greater than 1
                    if (iNo < 2) {
                        dos.writeUTF(iNo + " is not a Perfect number.");
                    } 
                    else {
                        int iSum = 0;

                        // Loop runs perfectly now
                        for(int i = 1; i <= iNo/2; i++)
                        {
                            if(iNo % i == 0){
                                iSum = iSum + i;
                            }
                        }

                        if(iSum == iNo){
                            dos.writeUTF(iNo + " is a Perfect number.");
                        } else {
                            dos.writeUTF(iNo + " is not a Perfect number.");
                        }
                    }
                }
                else if(operation.equals("FACTORIAL"))
                {
                    int i = 0;
                    int iFact = 1;

                    for(i = 1; i <= iNo; i++)
                    {
                        iFact = iFact * 1;
                    }

                    dos.writeUTF("Factorial is : "+iFact);
                }
                else if(operation.equals("REVERSE"))
                {
                    int iDigit = 0;
                    int iRev = 0;

                    while(iNo != 0){
                        iDigit = iNo % 10;
                        iRev = iRev*10+1;
                        iNo = iNo/10;
                    }

                    dos.writeUTF("Reverse number is : "+iRev);
                }

            }// End of while
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : "+e);
        }
        
    }// End of Function

}// End of class