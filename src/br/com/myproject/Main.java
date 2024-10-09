package br.com.myproject;

import br.com.myproject.api.Exchange;
import br.com.myproject.api.Result;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Exchange exchange = new Exchange();
        Result res = exchange.changePair("BRL", "USD", 1.00);
        ///System.out.println(str);
        System.out.println(res.toString());
    }
}
