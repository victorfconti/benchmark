package br.com.victor.streammermultiquality.hdservice.controller;

import br.com.victor.streammermultiquality.hdservice.model.VideoItem;
import br.com.victor.streammermultiquality.hdservice.service.DownloadService;
import org.springframework.core.io.InputStreamResource;
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
    private final DownloadService downloadService;

    public LoadResource(DownloadService downloadService) {
        this.downloadService = downloadService;
    }

    @GetMapping(path = "/load", produces = "video/mp4")
    public ResponseEntity<InputStreamResource> get() throws IOException {
        VideoItem videoItem = downloadService.execute();

        MediaType mediaType = MediaType.parseMediaType("video/mp4");
        long len = videoItem.getSize();

        return ResponseEntity.ok()
                .contentType(mediaType)
                .contentLength(len)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + videoItem.getExt()+"\"")
                .body(videoItem.getVideo());
    }

}
