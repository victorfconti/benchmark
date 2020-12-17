package br.com.victor.streammermultiquality.hdservice.service;

import br.com.victor.streammermultiquality.hdservice.model.VideoItem;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

@Service
public class DownloadService {

    @Value("${video.path}")
    private String path;

    @Value("${video.ext}")
    private String ext;

    public VideoItem execute() throws IOException {
        InputStream inputStreamResource = new ClassPathResource(path).getInputStream();
        return VideoItem
                .builder()
                .video(new InputStreamResource(inputStreamResource))
                .ext(ext)
                .size(193538L)
                .build();
    }

}
