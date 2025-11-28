import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class TCPServer {
    public static void main(String[] argv) throws Exception {
        System.out.println("Hello I'm SERVER - 00 b");
        ServerSocket serverSocket = new ServerSocket(9999);

        while (true) {
            Socket connectionSocket = serverSocket.accept();
            System.out.println("oh! Ho una connessione!!" +
                    " da " + connectionSocket.getInetAddress() +
                    ": " + connectionSocket.getPort());


            Scanner scanner = new Scanner(connectionSocket.getInputStream());
            String messaggio = scanner.nextLine();
            System.out.println("Messaggio ricevuto: " + messaggio);

        }
    }
}