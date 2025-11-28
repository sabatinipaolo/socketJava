import java.net.ServerSocket;
import java.net.Socket;

class TCPServer {
    public static void main(String[] argv) throws Exception {
        System.out.println("Hello I'm SERVER - 00 C esercizio Thread");
        ServerSocket serverSocket = new ServerSocket(9999);

        while (true) {
            Socket connectionSocket = serverSocket.accept();
            System.out.println("oh! Ho una connessione!!" +
                    " da " + connectionSocket.getInetAddress() +
                    ":" + connectionSocket.getPort());

            new Thread(new GestoreClient(connectionSocket)).start();
        }
    }
}
