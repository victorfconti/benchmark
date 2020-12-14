package br.com.victor.streammermultiquality.hdservice.model;

import com.amazonaws.services.s3.model.S3ObjectInputStream;
import lombok.Builder;
import lombok.Getter;
import lombok.Value;

@Value
@Builder
public class VideoItem {
    S3ObjectInputStream video;
    Long size;
    String ext;
}
