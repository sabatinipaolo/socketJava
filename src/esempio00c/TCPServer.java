import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class TCPServer {
    public static void main(String[] argv) throws Exception {
        System.out.println("Hello I'm SERVER - 00 C");
        ServerSocket serverSocket = new ServerSocket(9999);

        while (true) {
            Socket connectionSocket = serverSocket.accept();
            System.out.println("oh! Ho una connessione!!" +
                    " da " + connectionSocket.getInetAddress() +
                    ":" + connectionSocket.getPort());


            Scanner scanner = new Scanner(connectionSocket.getInputStream());
            
            String messaggio;
            do {
                 messaggio = scanner.nextLine();
                 System.out.println("Messaggio ricevuto da "+ connectionSocket.getInetAddress() +
                    ":" + connectionSocket.getPort() +"=" + messaggio);
                    
            } while (!messaggio.equalsIgnoreCase("@exit"));
            
            connectionSocket.close();
            scanner.close();
            System.out.println("Connessione chiusa dal client"+ connectionSocket.getInetAddress() +
                    ":" + connectionSocket.getPort());
        }
    }
}