package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ship {

    @JsonProperty("Status")
    private String status;

    @JsonProperty("RequireBy")
    private String requireBy;

    @JsonProperty("ShippingAddress")
    private Address shippingAddress;

    @JsonProperty("ShippingNotes")
    private String shippingNotes;

    @JsonProperty("Lines")
    private List<ShipLine> shipLineList;
}