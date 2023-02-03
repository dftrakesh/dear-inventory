package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceLine {

    @JsonProperty("ProductID")
    private String productID;

    @JsonProperty("SKU")
    private String sku;

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

    @JsonProperty("Account")
    private String account;

    @JsonProperty("Comment")
    private String comment;

    @JsonProperty("ProductLength")
    public Double productLength;

    @JsonProperty("ProductWidth")
    public Double productWidth;

    @JsonProperty("ProductHeight")
    public Double productHeight;

    @JsonProperty("ProductWeight")
    public Double productWeight;

    @JsonProperty("WeightUnits")
    public String weightUnits;

    @JsonProperty("DimensionsUnits")
    public String dimensionsUnits;

    @JsonProperty("ProductCustomField1")
    public String productCustomField1;

    @JsonProperty("ProductCustomField2")
    public String productCustomField2;

    @JsonProperty("ProductCustomField3")
    public String productCustomField3;

    @JsonProperty("ProductCustomField4")
    public String productCustomField4;

    @JsonProperty("ProductCustomField5")
    public String productCustomField5;

    @JsonProperty("ProductCustomField6")
    public String productCustomField6;

    @JsonProperty("ProductCustomField7")
    public String productCustomField7;

    @JsonProperty("ProductCustomField8")
    public String productCustomField8;

    @JsonProperty("ProductCustomField9")
    public String productCustomField9;

    @JsonProperty("ProductCustomField10")
    public String productCustomField10;
}