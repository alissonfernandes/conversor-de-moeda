package br.com.myproject;

import br.com.myproject.exception.InvalidAmountValueException;
import br.com.myproject.exception.InvalidMenuOptionException;


import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

       Menu menu = new Menu();
       Scanner scanner = new Scanner(System.in);

       while (true) {

           menu.show();
           System.out.print("Opção: ");
           int opcao = scanner.nextInt();
           if (opcao == 7) break;

           try {

               menu.select(opcao);
               System.out.print("Digite um valor para conversão: ");
               double amount = scanner.nextDouble();
               menu.setAmount(amount);
               menu.execute();

           } catch (InvalidMenuOptionException e) {
               System.out.println(e.getMessage());
           } catch (InvalidAmountValueException e) {
               System.out.println(e.getMessage());
           }
       }
    }
}
