package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {

    @JsonProperty("DisplayAddressLine1")
    private String displayAddressLine1;

    @JsonProperty("DisplayAddressLine2")
    private String displayAddressLine2;

    @JsonProperty("Line1")
    private String line1;

    @JsonProperty("Line2")
    private String line2;

    @JsonProperty("City")
    private String city;

    @JsonProperty("State")
    private String state;

    @JsonProperty("Postcode")
    private String postcode;

    @JsonProperty("Country")
    private String country;

    @JsonProperty("ShipToOther")
    private Boolean shipToOther;
}