package io.github.dft.dearinventory.model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetProducts {

    @JsonProperty("Total")
    private Integer total;

    @JsonProperty("Page")
    private Integer page;

    @JsonProperty("Products")
    private List<Product> products;

     @JsonProperty("ErrorCode")
     private String errorCode;

     @JsonProperty("Exception")
     private String exception;
}