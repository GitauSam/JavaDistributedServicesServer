package dsserver;

import java.net.*;

public class DsServer {
    
    public static void main(String[] args) {

        SocketServer ss = new SocketServer();
        ss.run();
        
    }
    
}
