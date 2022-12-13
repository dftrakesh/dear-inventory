package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Sale {

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
    private Boolean isServiceOnlySale;

    @JsonProperty("Contact")
    private String contact;

    @JsonProperty("Phone")
    private String phone;

    @JsonProperty("Email")
    private String email;

    @JsonProperty("DefaultAccount")
    private String defaultAccount;

    @JsonProperty("SkipQuote")
    private Boolean skipQuote;

    @JsonProperty("TaxRule")
    private String taxRule;

    @JsonProperty("TaxCalculation")
    private String taxCalculation;

    @JsonProperty("Terms")
    private String terms;

    @JsonProperty("PriceTier")
    private String priceTier;

    @JsonProperty("Location")
    private String location;

    @JsonProperty("Created")
    private String created;

    @JsonProperty("LastModifiedOn")
    private String lastModifiedOn;

    @JsonProperty("Note")
    private String note;

    @JsonProperty("COGSAmount")
    private Double cOGSAmount;

    @JsonProperty("CurrencyRate")
    private Double currencyRate;

    @JsonProperty("SalesRepresentative")
    private String salesRepresentative;

    @JsonProperty("ServiceOnly")
    private boolean serviceOnly;

    @JsonProperty("Carrier")
    private String carrier;

    @JsonProperty("BillingAddress")
    private Address billingAddress;

    @JsonProperty("ShippingAddress")
    private Address shippingAddress;

    @JsonProperty("Quote")
    private Quote quote;

    @JsonProperty("Order")
    private Order order;

    @JsonProperty("Pick")
    private Pick pick;

    @JsonProperty("Pack")
    private Pack pack;

    @JsonProperty("Ship")
    private Ship ship;

    @JsonProperty("Invoice")
    private Invoice invoice;

    @JsonProperty("CreditNote")
    private CreditNote creditNote;

    @JsonProperty("AdditionalTransactions")
    private AdditionalTransactions additionalTransactions;

    @JsonProperty("AdditionalAttributes")
    private AdditionalAttributes additionalAttributes;
}