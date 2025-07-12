import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public void run() throws IOException {
        int port = 8010;//port no to listen the client requests
        ServerSocket socket = new ServerSocket(port);
        socket.setSoTimeout(10000);
        while(true){
            try {
                System.out.println("Server running on the port:"+port);
                Socket acceptConnection = socket.accept();
                System.out.println("Connection accepted from the client.."+acceptConnection.getRemoteSocketAddress());
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){

    }
}