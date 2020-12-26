package br.com.victor.streammermultiquality.hdservice.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("v1")
public class LoadController {
    @GetMapping(path = "/load")
    public Mono<Resource> get(@Value("classpath:${video.path}") Resource resource,
                              ServerHttpResponse response) {
        response.getHeaders().add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename()+"\"");
        return Mono.just(resource);
    }
}
