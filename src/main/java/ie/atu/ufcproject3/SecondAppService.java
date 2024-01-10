package ie.atu.ufcproject3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SecondAppService {

    @Value("${second.app.url}")
    private String secondAppUrl;

    private final RestTemplate restTemplate;

    public SecondAppService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public UserDetails getFighterDetailsFromSecondApp(String name) {
        String endpoint = secondAppUrl + "/get-fighter-details/" + name;
        return restTemplate.getForObject(endpoint, UserDetails.class);
    }
}
