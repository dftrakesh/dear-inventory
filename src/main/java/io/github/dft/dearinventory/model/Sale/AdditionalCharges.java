package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdditionalCharges {

    @JsonProperty("Description")
    private String description;

    @JsonProperty("Price")
    private Double price;

    @JsonProperty("Quantity")
    private Double quantity;

    @JsonProperty("Amount")
    private Double amount;

    @JsonProperty("Discount")
    private Double discount;

    @JsonProperty("Tax")
    private Double tax;

    @JsonProperty("Total")
    private Double total;

    @JsonProperty("TaxRule")
    private String taxRule;

    @JsonProperty("Comment")
    private String comment;
}