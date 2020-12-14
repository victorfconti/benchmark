package br.com.victor.streammermultiquality.hdservice.gateway.http;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusResource {

    @GetMapping("/status")
    @ResponseStatus(HttpStatus.OK)
    public String status(){
        return "OK";
    }

    @GetMapping("/health")
    @ResponseStatus(HttpStatus.OK)
    public String health(){
        return "OK";
    }

}
