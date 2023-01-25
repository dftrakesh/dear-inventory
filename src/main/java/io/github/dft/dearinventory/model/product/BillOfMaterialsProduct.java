package io.github.dft.dearinventory.model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BillOfMaterialsProduct {

    @JsonProperty("ComponentProductID")
    private String componentProductId;

    @JsonProperty("ProductCode")
    private String productCode;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Quantity")
    private Double quantity;

    @JsonProperty("WastagePercent")
    private Double wastagePercent;

    @JsonProperty("WastageQuantity")
    private Double wastageQuantity;

    @JsonProperty("CostPercentage")
    private Double costPercentage;
}