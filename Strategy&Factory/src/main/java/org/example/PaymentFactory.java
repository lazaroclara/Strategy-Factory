package org.example;

public class PaymentFactory {
    public PaymentStrategy createPaymentStrategy(int opcao) {
        switch (opcao){
            case 1:
                return new PixPayment();
            case 2:
                return new CreditCardPayment();
            case 3:
                return new BoletoPayment();
            default:
                throw new IllegalArgumentException("Método inválido!");
        }
    }
}
