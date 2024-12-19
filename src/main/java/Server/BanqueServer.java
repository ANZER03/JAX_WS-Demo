package Server;

import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class BanqueServer {
    public static void main(String[] args) {
        String URL = "http://0.0.0.0:5050/";
        BanqueService server = new BanqueService();
        System.out.println("Server running in port 5050...");
        Endpoint.publish(URL, server);

    }
}
