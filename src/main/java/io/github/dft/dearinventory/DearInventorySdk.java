package io.github.dft.dearinventory;

import lombok.SneakyThrows;
import org.apache.http.client.utils.URIBuilder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import static io.github.dft.dearinventory.constantcode.ConstantCodes.MAX_ATTEMPTS;
import static io.github.dft.dearinventory.constantcode.ConstantCodes.TIME_OUT_DURATION;

public class DearInventorySdk {
    protected HttpClient client;

    public DearInventorySdk() {
        client = HttpClient.newHttpClient();
    }

    @SneakyThrows
    public <T> T getRequestWrapped(HttpRequest request, HttpResponse.BodyHandler<T> handler) {

        return client.sendAsync(request, handler)
            .thenComposeAsync(response -> tryResend(client, request, handler, response, 1))
            .get()
            .body();
    }

    @SneakyThrows
    public <T> CompletableFuture<HttpResponse<T>> tryResend(HttpClient client,
                                                            HttpRequest request,
                                                            HttpResponse.BodyHandler<T> handler,
                                                            HttpResponse<T> resp, int count) {
        if (resp.statusCode() == 503 && count < MAX_ATTEMPTS) {
            Thread.sleep(TIME_OUT_DURATION);
            return client.sendAsync(request, handler)
                .thenComposeAsync(response -> tryResend(client, request, handler, response, count + 1));
        }
        return CompletableFuture.completedFuture(resp);
    }

    protected void addParameters(URIBuilder uriBuilder, HashMap<String, String> params) {
        if (params == null || params.isEmpty()) return;
        for (String key : params.keySet()) {
            uriBuilder.addParameter(key, params.get(key));
        }
    }
}