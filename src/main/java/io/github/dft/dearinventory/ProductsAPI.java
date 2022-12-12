package io.github.dft.dearinventory;

import io.github.dft.dearinventory.handler.JsonBodyHandler;
import io.github.dft.dearinventory.model.auth.AccessCredential;
import io.github.dft.dearinventory.model.product.GetProducts;
import lombok.SneakyThrows;
import org.apache.http.client.utils.URIBuilder;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import static io.github.dft.dearinventory.constantcode.ConstantCodes.API_AUTH_ACCOUNT_ID;
import static io.github.dft.dearinventory.constantcode.ConstantCodes.API_AUTH_APPLICATION_KEY;
import static io.github.dft.dearinventory.constantcode.ConstantCodes.BASE_END_POINT;
import static io.github.dft.dearinventory.constantcode.ConstantCodes.CONTENT_TYPE;
import static io.github.dft.dearinventory.constantcode.ConstantCodes.CONTENT_TYPE_VALUE;
import static io.github.dft.dearinventory.constantcode.ConstantCodes.PRODUCT_LIST_END_POINT;

public class ProductsAPI extends DearInventorySdk {

    protected AccessCredential accessCredential;

    @SneakyThrows
    public ProductsAPI(AccessCredential accessCredential) {
        this.accessCredential  =accessCredential;
    }

    @SneakyThrows
    public GetProducts getProducts(HashMap<String, String> params) {

        URIBuilder uriBuilder = new URIBuilder(BASE_END_POINT + PRODUCT_LIST_END_POINT);
        addParameters(uriBuilder, params);

        HttpRequest request = HttpRequest.newBuilder(uriBuilder.build())
                                         .header(API_AUTH_ACCOUNT_ID, accessCredential.getAccountId())
                                         .header(API_AUTH_APPLICATION_KEY, accessCredential.getApplicationKey())
                                         .header(CONTENT_TYPE, CONTENT_TYPE_VALUE)
                                         .build();

        HttpResponse.BodyHandler<GetProducts> handler = new JsonBodyHandler<>(GetProducts.class);

        return getRequestWrapped(request, handler);
    }
}