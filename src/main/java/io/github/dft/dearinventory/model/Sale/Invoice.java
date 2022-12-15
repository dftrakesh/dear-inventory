package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Invoice {

    @JsonProperty("InvoiceNumber")
    private String invoiceNumber;

    @JsonProperty("Memo")
    private String nemo;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("Lines")
    private List<InvoiceLine> invoiceLines;

    @JsonProperty("AdditionalCharges")
    private List<AdditionalCharges> additionalCharges;

    @JsonProperty("Payments")
    private List<Payments> payments;

    @JsonProperty("InvoiceDate")
    private String invoiceDate;

    @JsonProperty("InvoiceDueDate")
    private String invoiceDueDate;

    @JsonProperty("TotalBeforeTax")
    private Double totalBeforeTax;

    @JsonProperty("Tax")
    private Double tax;

    @JsonProperty("Total")
    private Double total;

    @JsonProperty("Paid")
    private Double paid;
}