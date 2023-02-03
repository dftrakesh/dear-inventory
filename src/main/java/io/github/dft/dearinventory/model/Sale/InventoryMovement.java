package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class InventoryMovement {

    @JsonProperty("TaskID")
    private String taskId;

    @JsonProperty("ProductID")
    private String productId;

    @JsonProperty("Date")
    private String date;

    @JsonProperty("COGS")
    private Double cogs;
}