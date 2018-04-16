package de.sadrab.dutchman.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deadmanschest")
public class DutchmanEndPoint {

    @GetMapping
    String getChest() {
        return "Haha Chest Is Here :D";
    }
}
