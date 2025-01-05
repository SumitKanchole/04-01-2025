 import java.util.*;
 interface PaymentGateway {
    void processPayment(double amount);
 }
 class CreditCardPayment implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Credit card amount will be "+amount);
    }
 }
 class UPIPayment implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("UPI payment amount will be "+amount);
    }
 }
 class B1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
    double amount = sc.nextDouble();

        PaymentGateway pp = new CreditCardPayment();
        pp.processPayment(amount);

        pp = new UPIPayment();
        pp.processPayment(amount);
    }
 }