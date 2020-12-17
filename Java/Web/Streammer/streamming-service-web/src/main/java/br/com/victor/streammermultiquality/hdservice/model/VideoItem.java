package br.com.victor.streammermultiquality.hdservice.model;

import lombok.Builder;
import lombok.Value;
import org.springframework.core.io.InputStreamResource;

@Value
@Builder
public class VideoItem {
    InputStreamResource video;
    Long size;
    String ext;
}
