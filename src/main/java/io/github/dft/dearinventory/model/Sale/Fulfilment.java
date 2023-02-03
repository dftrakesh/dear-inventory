package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Fulfilment {

    @JsonProperty("TaskID")
    public String taskId;

    @JsonProperty("FulfillmentNumber")
    public Integer fulfillmentNumber;

    @JsonProperty("LinkedInvoiceNumber")
    public String linkedInvoiceNumber;

    @JsonProperty("FulFilmentStatus")
    public String fulFilmentStatus;

    @JsonProperty("Pick")
    public Pick pick;

    @JsonProperty("Pack")
    public Pack pack;

    @JsonProperty("Ship")
    public Ship ship;
}