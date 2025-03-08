package org.example;

public class PixPayment implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        String codigoPix = "8923409703";
        System.out.println("Você slecionou o pagamento por Pix!");
        System.out.println("O valor a ser transferido é: " + amount);
        System.out.println("Utilize a seguinte chave Pix: " + codigoPix);
    }
}
