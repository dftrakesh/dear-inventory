package io.github.dft.dearinventory;

import io.github.dft.dearinventory.handler.JsonBodyHandler;
import io.github.dft.dearinventory.model.Sale.GetSaleList;
import io.github.dft.dearinventory.model.Sale.Sale;
import io.github.dft.dearinventory.model.auth.AccessCredential;
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
import static io.github.dft.dearinventory.constantcode.ConstantCodes.SALES_LIST_END_POINT;
import static io.github.dft.dearinventory.constantcode.ConstantCodes.SALE_END_POINT;

public class SalesAPI extends DearInventorySdk {

    protected AccessCredential accessCredential;
    @SneakyThrows
    public SalesAPI(AccessCredential accessCredential) {
        this.accessCredential = accessCredential;
    }

    @SneakyThrows
    public GetSaleList getSaleList(HashMap<String, String> params) {

        URIBuilder uriBuilder = new URIBuilder(BASE_END_POINT + SALES_LIST_END_POINT);
        addParameters(uriBuilder, params);

        HttpRequest request = HttpRequest.newBuilder(uriBuilder.build())
                                         .header(API_AUTH_ACCOUNT_ID, accessCredential.getAccountId())
                                         .header(API_AUTH_APPLICATION_KEY, accessCredential.getApplicationKey())
                                         .header(CONTENT_TYPE, CONTENT_TYPE_VALUE)
                                         .build();

        HttpResponse.BodyHandler<GetSaleList> handler = new JsonBodyHandler<>(GetSaleList.class);

        return getRequestWrapped(request, handler);
    }

    @SneakyThrows
    public Sale getSale(HashMap<String, String> params) {

        URIBuilder uriBuilder = new URIBuilder(BASE_END_POINT + SALE_END_POINT);
        addParameters(uriBuilder, params);

        HttpRequest request = HttpRequest.newBuilder(uriBuilder.build())
            .header(API_AUTH_ACCOUNT_ID, accessCredential.getAccountId())
            .header(API_AUTH_APPLICATION_KEY, accessCredential.getApplicationKey())
            .header(CONTENT_TYPE, CONTENT_TYPE_VALUE)
            .build();

        HttpResponse.BodyHandler<Sale> handler = new JsonBodyHandler<>(Sale.class);

        return getRequestWrapped(request, handler);
    }
}