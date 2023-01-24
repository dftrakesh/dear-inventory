package io.github.dft.dearinventory.model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BillOfMaterialsService {

     @JsonProperty("ComponentProductID")
     private String componentProductId;

     @JsonProperty("Name")
     private String name;

     @JsonProperty("Quantity")
     private Double quantity;

     @JsonProperty("ExpenseAccount")
     private String expenseAccount;

     @JsonProperty("PriceTier")
     private Integer priceTier;
}