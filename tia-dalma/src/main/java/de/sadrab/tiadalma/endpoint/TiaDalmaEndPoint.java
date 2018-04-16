package de.sadrab.tiadalma.endpoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/dutchman")
public class TiaDalmaEndPoint {

    @Value("${dutchman.url}")
    private String dutchmanUrl;

    @GetMapping
    String getChest(){
        return dutchmanUrl;
    }

}
