package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Order {

    @JsonProperty("SaleOrderNumber")
    private String saleOrderNumber;

    @JsonProperty("Memo")
    private String memo;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("Lines")
    private List<SaleProduct> lines;

    @JsonProperty("AdditionalCharges")
    private List<AdditionalCharges> additionalCharges;

    @JsonProperty("TotalBeforeTax")
    private Double totalBeforeTax;

    @JsonProperty("Tax")
    private Double tax;

    @JsonProperty("Total")
    private Double total;
}