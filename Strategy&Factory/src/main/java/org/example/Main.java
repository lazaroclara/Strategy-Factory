package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentFactory paymentFactory = new PaymentFactory();

        while (true) {
            System.out.println("\nEscolha a forma de pagamento: \n" +
                    "1 - Pix\n" +
                    "2 - Cartão de Crédito\n" +
                    "3 - Boleto Bancário\n" +
                    "0 - Sair\n");

            System.out.println("Opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 0) {
                System.out.println("Encerrando!");
                break;
            }

            System.out.println("Insira o valor da transação: ");
            double amount = sc.nextDouble();

            try {
                PaymentStrategy paymentStrategy = paymentFactory.createPaymentStrategy(opcao);

                PaymentProcessor paymentProcessor = new PaymentProcessor(paymentStrategy);
                paymentProcessor.process(amount);
            } catch (IllegalArgumentException i) {
                System.out.println(i.getMessage());
            }
        }
}
}