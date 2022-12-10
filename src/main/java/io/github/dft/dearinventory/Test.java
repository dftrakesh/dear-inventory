package io.github.dft.dearinventory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import io.github.dft.dearinventory.model.auth.AccessCredential;
import java.util.HashMap;

public class Test {

    public static void main(String[] arge) throws JsonProcessingException {

        AccessCredential accessCredential = new AccessCredential();
        accessCredential.setAccountId("2804f676-812d-48ae-9821-cd8f8a06c8d8");
        accessCredential.setApplicationKey("1176320c-2394-03ec-879d-cb6aba989a3d");

//        ProductsAPI productsAPI = new ProductsAPI(accessCredential);
//        GetProduct getProduct = productsAPI.getProducts(null);
//        System.out.println(getJson(getProduct.getProducts().get(0)));

        HashMap<String, String> params = new HashMap<>();
        params.put("page", "1");
        params.put("limit", "1");

        SalesAPI salesAPI = new SalesAPI(accessCredential);
        Object getSales = salesAPI.getSaleList(params);
        System.out.println(getJson(getSales));
        for (int i = 0; i < 1; i++) {
            new Thread(() -> {
                System.out.println("getMyFeesEstimateResponse: " + salesAPI.getSaleList(params));
            }).start();
        }
    }

    private static String getJson(Object reports) throws JsonProcessingException {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(reports);
        return json;
    }
}