package PaymentModePackage;

import PaymentGatewayPackage.IPaymentGateway;

public abstract class PaymentMode
{
    IPaymentGateway iPaymentGateway;
    public PaymentMode(IPaymentGateway iPaymentGateway){
        this.iPaymentGateway=iPaymentGateway;
    }
    public abstract void doPayment();
}
