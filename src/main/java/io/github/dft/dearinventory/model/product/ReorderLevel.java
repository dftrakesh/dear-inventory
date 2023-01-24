package io.github.dft.dearinventory.model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReorderLevel {

    @JsonProperty("LocationID")
    private String locationId;

    @JsonProperty("LocationName")
    private String locationName;

    @JsonProperty("MinimumBeforeReorder")
    private Double minimumBeforeReorder;

    @JsonProperty("ReorderQuantity")
    private Double reorderQuantity;

    @JsonProperty("StockLocator")
    private String stockLocator;

    @JsonProperty("PickZones")
    private String pickZones;
}
