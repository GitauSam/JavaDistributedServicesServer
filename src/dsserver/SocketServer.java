package dsserver;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SocketServer implements Runnable{

    int portNumber;
    ArrayList<String> studentDetails = new ArrayList<>();
    
    public SocketServer() {
    }

    public SocketServer(int portNumber) {
        this.portNumber = portNumber;
    }
    
    @Override
    public void run() {

        try (
            ServerSocket serverSocket = new ServerSocket(4747);
            Socket clientSocket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
           ) {
            
            String inputLine, outputLine;
            
            System.out.println("Server is running");
            
            if ((inputLine = dataInputStream.readUTF().trim()) != null) {
                System.out.println("Input: " + inputLine);
            }          
            
        } catch(IOException e) {
            System.out.println("Exception caught when trying to listen on port" + 
                    portNumber + "or listening for a connection");
                System.err.println(e.getMessage());
        }
    }
    
}
