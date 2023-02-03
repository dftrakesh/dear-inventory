package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaleList {

    @JsonProperty("SaleID")
    private String saleId;

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

    @JsonProperty("CombinedPickingStatus")
    private String combinedPickingStatus;

    @JsonProperty("CombinedPaymentStatus")
    private String combinedPaymentStatus;

    @JsonProperty("CombinedTrackingNumbers")
    private String combinedTrackingNumbers;

    @JsonProperty("CombinedPackingStatus")
    private String combinedPackingStatus;

    @JsonProperty("CombinedShippingStatus")
    private String combinedShippingStatus;

    @JsonProperty("CombinedInvoiceStatus")
    private String combinedInvoiceStatus;

    @JsonProperty("CreditNoteStatus")
    private String creditNoteStatus;

    @JsonProperty("FulFilmentStatus")
    private String fulFilmentStatus;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("SourceChannel")
    private String sourceChannel;

    @JsonProperty("ExternalID")
    private String externalId;

    @JsonProperty("OrderLocationID")
    private String orderLocationId;

    @JsonProperty("RestockStatus")
    private String restockStatus;
}