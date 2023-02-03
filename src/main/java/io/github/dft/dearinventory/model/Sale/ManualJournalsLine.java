package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ManualJournalsLine {

    @JsonProperty("Reference")
    private String reference;

    @JsonProperty("Amount")
    private String amount;

    @JsonProperty("Date")
    private String date;

    @JsonProperty("Debit")
    private String debit;

    @JsonProperty("Credit")
    private String credit;
}