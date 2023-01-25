package io.github.dft.dearinventory.model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomPrice {

    @JsonProperty("ProductID")
    private String productId;

    @JsonProperty("ProductName")
    private String productName;

    @JsonProperty("ProductSKU")
    private String productSku;

    @JsonProperty("Price")
    private Double price;
}