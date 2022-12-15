package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdditionalAttributes {

    @JsonProperty("AdditionalAttribute1")
    private String additionalAttribute1;

    @JsonProperty("AdditionalAttribute2")
    private String additionalAttribute2;

    @JsonProperty("AdditionalAttribute3")
    private String additionalAttribute3;

    @JsonProperty("AdditionalAttribute4")
    private String additionalAttribute4;

    @JsonProperty("AdditionalAttribute5")
    private String additionalAttribute5;

    @JsonProperty("AdditionalAttribute6")
    private String additionalAttribute6;

    @JsonProperty("AdditionalAttribute7")
    private String additionalAttribute7;

    @JsonProperty("AdditionalAttribute8")
    private String additionalAttribute8;

    @JsonProperty("AdditionalAttribute9")
    private String additionalAttribute9;

    @JsonProperty("AdditionalAttribute10")
    private String additionalAttribute10;
}