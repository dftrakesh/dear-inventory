package io.github.dft.dearinventory.model.auth;

import lombok.Data;

@Data
public class AccessCredential {

    private String accountId;
    private String applicationKey;
}