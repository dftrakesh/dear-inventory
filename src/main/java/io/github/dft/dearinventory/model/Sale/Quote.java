package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    @JsonProperty("Memo")
    private String memo;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("prepaymentsList")
    private List<Prepayments> prepaymentsList;

    @JsonProperty("Lines")
    private List<QuoteLine> quoteLines;

    @JsonProperty("AdditionalCharges")
    private List<AdditionalCharges> additionalChargesList;

    @JsonProperty("TotalBeforeTax")
    private Double totalBeforeTax;

    @JsonProperty("Tax")
    private Double tax;

    @JsonProperty("Total")
    private Double total;
}