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

    public String changePair(String base_currency, String target_currency, double amount) throws IOException, InterruptedException {
        URI uri = URI.create(API_acess + API_key + "/pair/" + base_currency + "/" + target_currency + "/" + amount);
        return getRequest(uri).body();
    }

    private HttpResponse<String> getRequest(URI requestAddress) throws IOException, InterruptedException {
        request = HttpRequest.newBuilder()
                .uri(requestAddress)
                .build();
        return client.send(request, HttpResponse.BodyHandlers.ofString());
    }

}
