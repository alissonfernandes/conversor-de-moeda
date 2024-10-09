package br.com.myproject.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Exchange {

    private String API_key;
    private String API_acess;
    private HttpClient client;
    private HttpRequest request;
    private HttpResponse<String> response;

    public Exchange() {
        API_key = "d997c6bd8c5a7bc7393f8e6b";
        API_acess = "https://v6.exchangerate-api.com/v6/";
        client = HttpClient.newHttpClient();
    }

    public String change(String base_currency) throws IOException, InterruptedException {
        request = HttpRequest.newBuilder()
                .uri(getRequestAddress(base_currency))
                .build();

        response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    private URI getRequestAddress(String base_currency) {
        return URI.create(API_acess + API_key + "/latest/" + base_currency);
    }

}
