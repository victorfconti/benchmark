package br.com.victor.streammermultiquality.hdservice.service;

import br.com.victor.streammermultiquality.hdservice.model.VideoItem;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DownloadService {
    private final S3Service s3Service;

    @Value("${video.path}")
    private String path;

    @Value("${video.size}")
    private Long size;

    @Value("${video.ext}")
    private String ext;

    public DownloadService(S3Service s3Service){
        this.s3Service = s3Service;
    }

    public VideoItem execute(){
        return VideoItem
                .builder()
                .video(s3Service.execute(path))
                .size(size)
                .ext(ext)
                .build();
    }

}
