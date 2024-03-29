package io.github.dft.dearinventory.model.Sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ManualJournals {

    @JsonProperty("Status")
    public String status;

    @JsonProperty("Lines")
    public List<ManualJournalsLine> lines;
}