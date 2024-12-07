package PaymentGatewayPackage;

// Concrete Implementor
public class ICICIPaymentGateway implements IPaymentGateway
{
    public ICICIPaymentGateway(){
    }
    @Override
    public void paymentProcessor(String paymentMode) {
        System.out.println("Payment processing through ICICI gateway using "+paymentMode);
    }
}
