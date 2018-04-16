package de.sadrab.jacksparrow.endpoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping
public class JackSparrowEndPoint {
    private RestTemplate restTemplate;

    @Value("${diadalma.url}")
    private String tiaDalmaUrl;

    public JackSparrowEndPoint(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    String getChest(){
        String dutchmanUrl = getDutchmanUrl();
        return restTemplate.getForEntity(dutchmanUrl,String.class).getBody();
    }

    private String getDutchmanUrl() {
        ResponseEntity<String> response = restTemplate.getForEntity(tiaDalmaUrl, String.class);
        return response.getBody();
    }
}
