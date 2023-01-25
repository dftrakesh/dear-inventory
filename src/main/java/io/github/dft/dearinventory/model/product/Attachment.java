package io.github.dft.dearinventory.model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Attachment {

    @JsonProperty("ID")
    private String id;

    @JsonProperty("ContentType")
    private String contentType;

    @JsonProperty("FileName")
    private String fileName;

    @JsonProperty("DownloadUrl")
    private String downloadUrl;
}