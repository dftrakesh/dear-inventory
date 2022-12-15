package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreditNote {

    @JsonProperty("CreditNoteNumber")
    private String creditNoteNumber;

    @JsonProperty("Memo")
    private String memo;

    @JsonProperty("Status")
    private String Status;

    @JsonProperty("RestockStatus")
    private String restockStatus;

    @JsonProperty("CreditNoteDate")
    private String creditNoteDate;

    @JsonProperty("Lines")
    private List<CreditNoteLine> creditNoteLines;

    @JsonProperty("AdditionalCharges")
    private List<AdditionalCharges> additionalCharges;

    @JsonProperty("Refunds")
    private List<Refund> refunds;

    @JsonProperty("Restock")
    private List<RestockLine> restock;

    @JsonProperty("TotalBeforeTax")
    private Double totalBeforeTax;

    @JsonProperty("Tax")
    private Double tax;

    @JsonProperty("Total")
    private Double total;
}