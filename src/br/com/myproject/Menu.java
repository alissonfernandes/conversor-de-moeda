package br.com.myproject;

import br.com.myproject.api.Exchange;
import br.com.myproject.api.Result;
import br.com.myproject.exception.InvalidAmountValueException;
import br.com.myproject.exception.InvalidMenuOptionException;

import java.io.IOException;

public class Menu {

    private Exchange exchange;
    private double amount;
    private int option;

    public Menu() {
        exchange = new Exchange();
    }

    public void show() {
        print();
        System.out.println("Escolha um par de moeda para fazer a conversão.");
        System.out.println("1) [BRL] Real Brasileiro        >> [USD] Dolar Norte Americano");
        System.out.println("2) [BRL] Real Brasileiro        >> [EUR] Euro");
        System.out.println("3) [USD] Dolar Norte Americano  >> [BRL] Real Brasileiro");
        System.out.println("4) [USD] Dolar Norte Americano  >> [EUR] Euro");
        System.out.println("5) [EUR] Euro                   >> [BRL] Real Brasileiro");
        System.out.println("6) [EUR] Euro                   >> [USD] Dolar Norte Americano"  );
        System.out.println("7) Sair");
    }

    public void select(int option)  {
        if (option < 0 || option > 7) throw new InvalidMenuOptionException("Opção inválida.");
        else this.option = option;
    }

    public void setAmount(double amount) {
        if (amount < 0) throw new InvalidAmountValueException("O valor a ser covertido deve ser maior do que 0 (ZERO)");
        else this.amount = amount;
    }

    public void execute() throws IOException, InterruptedException {
        switch (option) {
            case 1:
                showResult(exchange.changePair("BRL", "USD", amount));
                break;
            case 2:
                showResult(exchange.changePair("BRL", "EUR", amount));
                break;
            case 3:
                showResult(exchange.changePair("USD", "BRL", amount));
                break;
        }
    }

    private void showResult(Result r) {
        print();
        System.out.println("Resultado da conversão:");
        System.out.println("[" + r.getBaseCode()+"]: " + amount);
        System.out.println("[" + r.getTargetCode() + "]: " + r.getConversionResult());
        System.out.println(amount + " "+ r.getBaseCode() + " equivale a " + r.getConversionResult() + " " + r.getTargetCode());
    }

    private void print() {
        System.out.println("\n====================================================================================");
    }
}
