package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Payments {

    @JsonProperty("ID")
    private String iD;

    @JsonProperty("TaskID")
    private String taskID;

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

    @JsonProperty("DateCreated")
    private String dateCreated;

    @JsonProperty("Type")
    private String type;
}