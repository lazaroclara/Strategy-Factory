package org.example;

import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy{
    String numCartao;

    public void coletarNumCartao(String numCartao) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o número do cartão: ");
        this.numCartao = scanner.nextLine();
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Pagamento de R$" + amount + "realizado pelo cartão" + numCartao + "finalizado com sucesso!");
    }
}
