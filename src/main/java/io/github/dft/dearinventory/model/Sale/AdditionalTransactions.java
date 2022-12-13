package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdditionalTransactions {

    @JsonProperty("Status")
    private String status;

    @JsonProperty("Lines")
    private List<AdditionalTransactionLine> additionalTransactionLines;
}