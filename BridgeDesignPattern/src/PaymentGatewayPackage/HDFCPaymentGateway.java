package PaymentGatewayPackage;

// Concrete Implementor
public class HDFCPaymentGateway implements IPaymentGateway{
    public HDFCPaymentGateway(){
    }
    @Override
    public void paymentProcessor(String paymentMode) {
        System.out.println("Payment processing through HDFC gateway using "+paymentMode);
    }
}
