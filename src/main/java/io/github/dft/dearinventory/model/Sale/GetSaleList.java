package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetSaleList {

    @JsonProperty("Total")
    private Integer total;

    @JsonProperty("Page")
    private Integer page;

    @JsonProperty("SaleList")
    private List<Sale> saleList;

    @JsonProperty("ErrorCode")
    private String errorCode;

    @JsonProperty("Exception")
    private String exception;
}