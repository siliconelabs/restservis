package com.firstrerstfulservis.restservis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/firstrequest")
public class userController {

    @GetMapping("/selam")
    public String getHelloMessage() {

        return "merhaba hosgeldin";
    }

}
