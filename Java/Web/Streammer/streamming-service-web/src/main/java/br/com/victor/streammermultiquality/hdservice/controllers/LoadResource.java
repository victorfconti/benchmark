package br.com.victor.streammermultiquality.hdservice.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("v1")
public class LoadResource {

    @GetMapping(path = "/load", produces = "video/mp4")
    public ResponseEntity<InputStreamResource> get(@Value("classpath:${video.path}")Resource video) throws IOException {
        MediaType mediaType = MediaType.parseMediaType("video/mp4");

        return ResponseEntity.ok()
                .contentType(mediaType)
                .contentLength(video.contentLength())
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + video.getFilename() +"\"")
                .body(new InputStreamResource(video.getInputStream()));
    }
}
