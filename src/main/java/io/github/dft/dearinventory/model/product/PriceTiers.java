package io.github.dft.dearinventory.model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceTiers {

    @JsonProperty("Tier 1")
    private Double tier1;

    @JsonProperty("Tier 2")
    private Double tier2;

    @JsonProperty("Tier 3")
    private Double tier3;

    @JsonProperty("Tier 4")
    private Double tier4;

    @JsonProperty("Tier 5")
    private Double tier5;

    @JsonProperty("Tier 6")
    private Double tier6;

    @JsonProperty("Tier 7")
    private Double tier7;

    @JsonProperty("Tier 8")
    private Double tier8;

    @JsonProperty("Tier 9")
    private Double tier9;

    @JsonProperty("Tier 10")
    private Double tier10;
}