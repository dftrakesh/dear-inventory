package io.github.dft.dearinventory.constantcode;

public interface ConstantCodes {

    String BASE_END_POINT = "https://inventory.dearsystems.com/ExternalApi/";

    String SALES_LIST_END_POINT = "SaleList";

    String PRODUCT_LIST_END_POINT = "Products";

    String API_AUTH_ACCOUNT_ID = "api-auth-accountid";

    String API_AUTH_APPLICATION_KEY = "api-auth-applicationkey";

    String CONTENT_TYPE = "Content-type";

    String CONTENT_TYPE_VALUE = "application/json;charset=UTF-8";

    int MAX_ATTEMPTS = 50;

    int TIME_OUT_DURATION = 3000;
}