import proxy.BanqueService;
import proxy.BanqueServiceService;
import proxy.Compte;
import java.util.List;

public class JaxClient {
    public static void main(String[] args) {

        BanqueService stub = new BanqueServiceService().getBanqueServicePort();
        List<Compte> comptes = stub.getComptes();

        comptes.stream().forEach(compte -> {
            System.out.println(compte.getId() + " | " + compte.getSolde() + " | " + compte.getDate());
        });
    }
    }
