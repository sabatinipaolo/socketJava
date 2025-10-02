package esempio00a;

import java.net.ServerSocket;

class TCPServer {
    public static void main(String[] argv) throws Exception {
        System.out.println("Hello I'm SERVER - 00a");
        ServerSocket serverSocket = new ServerSocket(9999);

        while (true) {
            serverSocket.accept();
            System.out.println("oh! Ho una connessione!!");
        }
    }
}