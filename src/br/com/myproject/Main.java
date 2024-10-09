package br.com.myproject;

import br.com.myproject.api.Exchange;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Exchange exchange = new Exchange();
        String str = exchange.changePair("USD", "BRL", 1.00);
        System.out.println(str);
    }
}
