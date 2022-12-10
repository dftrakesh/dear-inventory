package io.github.dft.dearinventory.model.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PriceTiers {

    @JsonProperty("Tier1")
    private Double tier1;

    @JsonProperty("Tier2")
    private Double tier2;

    @JsonProperty("Tier3")
    private Double tier3;

    @JsonProperty("Tier4")
    private Double tier4;

    @JsonProperty("Tier5")
    private Double tier5;

    @JsonProperty("Tier6")
    private Double tier6;

    @JsonProperty("Tier7")
    private Double tier7;

    @JsonProperty("Tier8")
    private Double tier8;

    @JsonProperty("Tier9")
    private Double tier9;

    @JsonProperty("Tier10")
    private Double tier10;
}