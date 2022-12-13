package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuoteLine {

    @JsonProperty("ProductID")
    private String productID;

    @JsonProperty("SKU")
    private String sKU;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Quantity")
    private Double quantity;

    @JsonProperty("Price")
    private Double price;

    @JsonProperty("Discount")
    private Double discount;

    @JsonProperty("Tax")
    private Double tax;

    @JsonProperty("Total")
    private Double total;

    @JsonProperty("AverageCost")
    private Double averageCost;

    @JsonProperty("TaxRule")
    private String taxRule;

    @JsonProperty("Comment")
    private String comment;
}