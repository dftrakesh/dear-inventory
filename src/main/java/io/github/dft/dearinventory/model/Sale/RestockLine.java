package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RestockLine {

    @JsonProperty("ProductID")
    private String productId;

    @JsonProperty("SKU")
    private String sku;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Location")
    private String location;

    @JsonProperty("Quantity")
    private Double quantity;

    @JsonProperty("Batch")
    private String batch;

    @JsonProperty("ExpiryDate")
    private String expiryDate;
}