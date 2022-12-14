package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaleList {

    @JsonProperty("ID")
    private String id;

    @JsonProperty("OrderNumber")
    private String orderNumber;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("OrderDate")
    private String orderDate;

    @JsonProperty("InvoiceDate")
    private String invoiceDate;

    @JsonProperty("Customer")
    private String customer;

    @JsonProperty("CustomerID")
    private String customerId;

    @JsonProperty("InvoiceNumber")
    private String invoiceNumber;

    @JsonProperty("CustomerReference")
    private String customerReference;

    @JsonProperty("InvoiceAmount")
    private Double invoiceAmount;

    @JsonProperty("PaidAmount")
    private Double paidAmount;

    @JsonProperty("InvoiceDueDate")
    private String invoiceDueDate;

    @JsonProperty("ShipBy")
    private String shipBy;

    @JsonProperty("BaseCurrency")
    private String baseCurrency;

    @JsonProperty("CustomerCurrency")
    private String customerCurrency;

    @JsonProperty("CreditNoteNumber")
    private String creditNoteNumber;

    @JsonProperty("Updated")
    private String updated;

    @JsonProperty("QuoteStatus")
    private String quoteStatus;

    @JsonProperty("OrderStatus")
    private String orderStatus;

    @JsonProperty("PickStatus")
    private String pickStatus;

    @JsonProperty("PackStatus")
    private String packStatus;

    @JsonProperty("ShipStatus")
    private String shipStatus;

    @JsonProperty("InvoiceStatus")
    private String invoiceStatus;

    @JsonProperty("CreditNoteStatus")
    private String creditNoteStatus;

    @JsonProperty("IsServiceOnlySale")
    private boolean isServiceOnlySale;
}