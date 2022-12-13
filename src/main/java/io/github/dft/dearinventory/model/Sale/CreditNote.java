package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreditNote {

    @JsonProperty("CreditNoteNumber")
    private String CreditNoteNumber;

    @JsonProperty("Memo")
    private String Memo;

    @JsonProperty("Status")
    private String Status;

    @JsonProperty("RestockStatus")
    private String RestockStatus;

    @JsonProperty("CreditNoteDate")
    private String CreditNoteDate;

    @JsonProperty("Lines")
    private List<CreditNoteLine> creditNoteLines;

    @JsonProperty("AdditionalCharges")
    private List<AdditionalCharges> AdditionalCharges;

    @JsonProperty("Refunds")
    private List<Refund> refunds;

    @JsonProperty("Restock")
    private List<RestockLine> restock;

    @JsonProperty("TotalBeforeTax")
    private Double TotalBeforeTax;

    @JsonProperty("Tax")
    private Double Tax;

    @JsonProperty("Total")
    private Double Total;
}