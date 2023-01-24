package io.github.dft.dearinventory.model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {

    @JsonProperty("ID")
    private String id;

    @JsonProperty("SKU")
    private String sku;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Category")
    private String category;

    @JsonProperty("Brand")
    private String brand;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("CostingMethod")
    private String costingMethod;

    @JsonProperty("DropShipMode")
    private String dropShipMode;

    @JsonProperty("DefaultLocation")
    private String defaultLocation;

    @JsonProperty("Length")
    private Double length;

    @JsonProperty("Width")
    private Double width;

    @JsonProperty("Height")
    private Double height;

    @JsonProperty("Weight")
    private Double weight;

    @JsonProperty("UOM")
    private String uom;

    @JsonProperty("WeightUnits")
    private String weightUnits;

    @JsonProperty("DimensionsUnits")
    private String dimensionsUnits;

    @JsonProperty("Barcode")
    private String barcode;

    @JsonProperty("MinimumBeforeReorder")
    private Double minimumBeforeReorder;

    @JsonProperty("ReorderQuantity")
    private Double reorderQuantity;

    @JsonProperty("AlwaysShowQuantity")
    private Double alwaysShowQuantity;

    @JsonProperty("PriceTier1")
    private Double priceTier1;

    @JsonProperty("PriceTier2")
    private Double priceTier2;

    @JsonProperty("PriceTier3")
    private Double priceTier3;

    @JsonProperty("PriceTier4")
    private Double priceTier4;

    @JsonProperty("PriceTier5")
    private Double priceTier5;

    @JsonProperty("PriceTier6")
    private Double priceTier6;

    @JsonProperty("PriceTier7")
    private Double priceTier7;

    @JsonProperty("PriceTier8")
    private Double priceTier8;

    @JsonProperty("PriceTier9")
    private Double priceTier9;

    @JsonProperty("PriceTier10")
    private Double priceTier10;

    @JsonProperty("PriceTiers")
    private PriceTiers priceTiers;

    @JsonProperty("AverageCost")
    private Double averageCost;

    @JsonProperty("ShortDescription")
    private String shortDescription;

    @JsonProperty("InternalNote")
    private String internalNote;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("AdditionalAttribute1")
    private String additionalAttribute1;

    @JsonProperty("AdditionalAttribute2")
    private String additionalAttribute2;

    @JsonProperty("AdditionalAttribute3")
    private String additionalAttribute3;

    @JsonProperty("AdditionalAttribute4")
    private String additionalAttribute4;

    @JsonProperty("AdditionalAttribute5")
    private String additionalAttribute5;

    @JsonProperty("AdditionalAttribute6")
    private String additionalAttribute6;

    @JsonProperty("AdditionalAttribute7")
    private String additionalAttribute7;

    @JsonProperty("AdditionalAttribute8")
    private String additionalAttribute8;

    @JsonProperty("AdditionalAttribute9")
    private String additionalAttribute9;

    @JsonProperty("AdditionalAttribute10")
    private String additionalAttribute10;

    @JsonProperty("AttributeSet")
    private String attributeSet;

    @JsonProperty("DiscountRule")
    private String discountRule;

    @JsonProperty("Tags")
    private String tags;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("StockLocator")
    private String stockLocator;

    @JsonProperty("COGSAccount")
    private String cogsAccount;

    @JsonProperty("RevenueAccount")
    private String revenueAccount;

    @JsonProperty("ExpenseAccount")
    private String expenseAccount;

    @JsonProperty("InventoryAccount")
    private String inventoryAccount;

    @JsonProperty("PurchaseTaxRule")
    private String purchaseTaxRule;

    @JsonProperty("SaleTaxRule")
    private String saleTaxRule;

    @JsonProperty("LastModifiedOn")
    private String lastModifiedOn;

    @JsonProperty("Sellable")
    private Boolean sellable;

    @JsonProperty("PickZones")
    private String pickZones;

    @JsonProperty("CartonInnerQuantity")
    private String cartonInnerQuantity;

    @JsonProperty("BillOfMaterial")
    private Boolean billOfMaterial;

    @JsonProperty("AutoAssembly")
    private Boolean autoAssembly;

    @JsonProperty("AutoDisassembly")
    private Boolean autoDisassembly;

    @JsonProperty("QuantityToProduce")
    private String quantityToProduce;

    @JsonProperty("AssemblyInstructionURL")
    private String assemblyInstructionURL;

    @JsonProperty("AssemblyCostEstimationMethod")
    private String assemblyCostEstimationMethod;

    @JsonProperty("ReorderLevels")
    private List<ReorderLevel> reorderLevelList;

    @JsonProperty("BillOfMaterialsProducts")
    private List<BillOfMaterialsProduct> billOfMaterialsProductList;

    @JsonProperty("BillOfMaterialsServices")
    private List<BillOfMaterialsService> billOfMaterialsServiceList;

    @JsonProperty("Movements")
    private List<Movement> movementList;

    @JsonProperty("Attachments")
    private List<Attachment> attachmentsList;

    @JsonProperty("BOMType")
    private String bomType;

    @JsonProperty("WarrantyName")
    private String warrantyName;

    @JsonProperty("CustomPrices")
    private List<CustomPrice> customPricesList;

    @JsonProperty("CartonHeight")
    private Double cartonHeight;

    @JsonProperty("CartonWidth")
    private Double cartonWidth;

    @JsonProperty("CartonLength")
    private Double cartonLength;

    @JsonProperty("CartonQuantity")
    private Double cartonQuantity;
}