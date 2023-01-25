package io.github.dft.dearinventory.model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Movement {

    @JsonProperty("TaskID")
    private String taskId;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Date")
    private String date;

    @JsonProperty("Number")
    private String number;

    @JsonProperty("Quantity")
    private Double quantity;

    @JsonProperty("Amount")
    private Double amount;

    @JsonProperty("Location")
    private String location;

    @JsonProperty("BatchSN")
    private String batchSN;

    @JsonProperty("ExpiryDate")
    private String expiryDate;

    @JsonProperty("FromTo")
    private String fromTo;
}