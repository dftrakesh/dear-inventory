package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdditionalTransactionLine {

    @JsonProperty("Reference")
    private String reference;

    @JsonProperty("Debit")
    private String debit;

    @JsonProperty("Credit")
    private String credit;

    @JsonProperty("Amount")
    private Double amount;

    @JsonProperty("Date")
    private String date;
}