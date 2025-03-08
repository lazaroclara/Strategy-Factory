package org.example;

public class BoletoPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        String codigoBoleto = "34191.75009 01234.567890 12345.678901 8 91234567890000";
        System.out.println("Você slecionou o pagamento por Boleto!");
        System.out.println("O valor a ser transferido é: " + amount);
        System.out.println("Utilize o seguinte código do boleto: " + codigoBoleto);
    }
}
