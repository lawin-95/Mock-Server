package com.MockServer;




import de.sprengnetter.webservices.t2c.ws.v12.BewerteDFHV;
import de.sprengnetter.webservices.t2c.ws.v12.BewerteEFHZFH;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class SprengnetterEndpoint {

    private static final String NAMESPACE_URI = "http://ws.t2c.webservices.sprengnetter.de/v12";

    private final AdminService adminService;
    private final SprengnetterRepository sprengnetterRepository;

   @Autowired
    public SprengnetterEndpoint(AdminService adminService, SprengnetterRepository sprengnetterRepository) {
        this.adminService = adminService;
        this.sprengnetterRepository = sprengnetterRepository;

    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "BewerteDFHV")
    @ResponsePayload
    public BewerteDFHV bewerteDFHV(@RequestPayload BewerteDFHV request) {
        String customer = adminService.getCustomer();
        BewerteDFHV response = new BewerteDFHV();
        response.setUser(request.getUser());
        response.setAdresse(request.getAdresse());
        response.setBewertungsDaten(request.getBewertungsDaten());
        response.setObjektDFHV(sprengnetterRepository.bewerteDFHV(customer));
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "BewerteEFHZFH")
    @ResponsePayload
    public BewerteEFHZFH bewerteEFHZFH(@RequestPayload BewerteEFHZFH request) {
        String customer = adminService.getCustomer();
        BewerteEFHZFH response = new BewerteEFHZFH();
        response.setUser(request.getUser());
        response.setAdresse(request.getAdresse());
        response.setBewertungsDaten(request.getBewertungsDaten());
        response.setObjektEFHZFH(sprengnetterRepository.bewerteEFHZFH(customer));
        return response;
    }

}
