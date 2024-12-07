package PaymentModePackage;

import PaymentGatewayPackage.IPaymentGateway;

public class CardPayment extends PaymentMode
{

    public CardPayment(IPaymentGateway iPaymentGateway){
        super(iPaymentGateway);
    }

    @Override
    public void doPayment() {
        this.iPaymentGateway.paymentProcessor("Card");
    }
}
