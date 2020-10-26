package Chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author BlackHat
 */
public class Server {

    public static void main(String[] args) {
        try{
        
        ServerSocket server = new ServerSocket(1021);
     
        Socket socket = server.accept();
        
        
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        
        
        DataInputStream in = new DataInputStream(socket.getInputStream());

        Scanner input = new Scanner(System.in);

        while (true) {
            
            String str = in.readUTF(); 
            
            
            if (str.equalsIgnoreCase("q")) { 
                break;
            } else {
                System.out.println("Client: " + str);
            }
            
            System.out.print("\nI: ");
            out.writeUTF(input.nextLine()); 
            out.flush(); 
        }
       
        in.close();
        out.close();
        socket.close();
        server.close();
        
        } catch(IOException e){
            System.err.println("Lỗi gửi-nhận");
        }
    }
}