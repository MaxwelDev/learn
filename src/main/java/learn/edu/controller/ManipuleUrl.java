package learn.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ManipuleUrl {

    private static final String URL = "http://localhost:9000/login/espnwatch?state=";

    @Autowired
    private RestTemplate restTemplateConfig;


    @GetMapping("/login/espnwatch")
    public void manipulete(@RequestParam String login_token) {

        restTemplateConfig.getForObject(URL.concat(login_token), String.class);
    }
}

