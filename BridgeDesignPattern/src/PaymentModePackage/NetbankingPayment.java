package PaymentModePackage;

import PaymentGatewayPackage.IPaymentGateway;

public class NetbankingPayment extends PaymentMode
{
    public NetbankingPayment(IPaymentGateway iPaymentGateway) {
        super(iPaymentGateway);
    }

    @Override
    public void doPayment() {
        this.iPaymentGateway.paymentProcessor("Net Banking");
    }
}
