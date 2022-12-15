package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Prepayments {

    @JsonProperty("Reference")
    private String reference;

    @JsonProperty("Amount")
    private Double amount;

    @JsonProperty("DatePaid")
    private String datePaid;

    @JsonProperty("Account")
    private String account;

    @JsonProperty("CurrencyRate")
    private Double currencyRate;
}