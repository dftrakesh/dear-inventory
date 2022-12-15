package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PackLine {

    @JsonProperty("ProductID")
    private String productId;

    @JsonProperty("SKU")
    private String sku;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Location")
    private String location;

    @JsonProperty("Box")
    private String box;

    @JsonProperty("Quantity")
    private Double quantity;

    @JsonProperty("Batch")
    private String batch;

    @JsonProperty("ExpiryDate")
    private String expiryDate;

    @JsonProperty("NonInventory")
    private Boolean nonInventory;

    @JsonProperty("WarrantyRegistrationNumber")
    private String warrantyRegistrationNumber;
}