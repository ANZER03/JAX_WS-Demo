package ws;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.util.Date;
import java.util.List;

@WebService
public class BanqueService {

    @WebMethod
    public double conversion_euro_dh(@WebParam(name="montant") double mt) {
        double mt_dh;
        mt_dh = mt * 11;
        return mt_dh;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code) {
        return new Compte(code, new Date(), 1000 + Math.random() * 9000);
    }

    @WebMethod
    public List<Compte> getComptes() {
        return List.of(new Compte(1, new Date(), 1000 + Math.random() * 9000),
                new Compte(2, new Date(), 1000 + Math.random() * 9000),
                new Compte(3, new Date(), 1000 + Math.random() * 9000));
    }

}
