package org.example;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void process(double amount){
        if(paymentStrategy == null){
            System.out.println("Nenhuma forma de pagamento foi selecionada!");
            return;
        }
        paymentStrategy.processPayment(amount);
    }
}
