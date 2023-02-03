package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dft.dearinventory.model.product.Attachment;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Sale {

    @JsonProperty("ID")
    private String id;

    @JsonProperty("Customer")
    private String customer;

    @JsonProperty("CustomerID")
    private String customerId;

    @JsonProperty("ShipBy")
    private String shipBy;

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

    @JsonProperty("ShippingNotes")
    private String shippingNotes;

    @JsonProperty("BaseCurrency")
    private String baseCurrency;

    @JsonProperty("CustomerCurrency")
    private String customerCurrency;

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

    @JsonProperty("SaleOrderDate")
    private String saleOrderDate;

    @JsonProperty("LastModifiedOn")
    private String lastModifiedOn;

    @JsonProperty("Note")
    private String note;

    @JsonProperty("CustomerReference")
    private String customerReference;

    @JsonProperty("COGSAmount")
    private Double cOGSAmount;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("CombinedPickingStatus")
    private String combinedPickingStatus;

    @JsonProperty("CombinedPackingStatus")
    private String combinedPackingStatus;

    @JsonProperty("CombinedShippingStatus")
    private String combinedShippingStatus;

    @JsonProperty("FulFilmentStatus")
    private String fulFilmentStatus;

    @JsonProperty("CombinedInvoiceStatus")
    private String combinedInvoiceStatus;

    @JsonProperty("CombinedPaymentStatus")
    private String combinedPaymentStatus;

    @JsonProperty("CombinedTrackingNumbers")
    private String combinedTrackingNumbers;

    @JsonProperty("Carrier")
    private String carrier;

    @JsonProperty("CurrencyRate")
    private Double currencyRate;

    @JsonProperty("SalesRepresentative")
    private String salesRepresentative;

    @JsonProperty("ServiceOnly")
    private Boolean serviceOnly;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("BillingAddress")
    private Address billingAddress;

    @JsonProperty("ShippingAddress")
    private Address shippingAddress;

    @JsonProperty("SourceChannel")
    private String sourceChannel;

    @JsonProperty("Quote")
    private Quote quote;

    @JsonProperty("Order")
    private Order order;

    @JsonProperty("Fulfilments")
    private List<Fulfilment> fulfilments;

    @JsonProperty("Invoices")
    private List<Invoice> invoices;

    @JsonProperty("ManualJournals")
    private ManualJournals manualJournals;

    @JsonProperty("ExternalID")
    private String externalID;

    @JsonProperty("CreditNotes")
    private List<CreditNote> creditNotes;

    @JsonProperty("AdditionalAttributes")
    private AdditionalAttributes additionalAttributes;

    @JsonProperty("Attachments")
    private List<Attachment> attachments;

    @JsonProperty("InventoryMovements")
    private List<InventoryMovement> inventoryMovements;

    @JsonProperty("Transactions")
    private List<Transaction> transactions;
}