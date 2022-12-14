package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PickLine {

    @JsonProperty("ProductID")
    private String productId;

    @JsonProperty("SKU")
    private String sku;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Quantity")
    private Double quantity;

    @JsonProperty("Location")
    private String location;

    @JsonProperty("Batch")
    private String batch;

    @JsonProperty("ExpiryDate")
    private String expiryDate;

    @JsonProperty("NonInventory")
    private Boolean nonInventory;

    @JsonProperty("RestockDate")
    private String restockDate;

    @JsonProperty("RestockLocationID")
    private String restockLocationID;

    @JsonProperty("RestockLocation")
    private String restockLocation;
}