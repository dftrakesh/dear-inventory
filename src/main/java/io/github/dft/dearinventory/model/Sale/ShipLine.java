package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShipLine {

    @JsonProperty("ID")
    private String id;

    @JsonProperty("ShipmentDate")
    private String shipmentDate;

    @JsonProperty("Carrier")
    private String carrier;

    @JsonProperty("Boxes")
    private String boxes;

    @JsonProperty("TrackingNumber")
    private String trackingNumber;

    @JsonProperty("IsShipped")
    private Boolean isShipped;
}