import PaymentGatewayPackage.HDFCPaymentGateway;
import PaymentGatewayPackage.ICICIPaymentGateway;
import PaymentGatewayPackage.IPaymentGateway;
import PaymentModePackage.CardPayment;
import PaymentModePackage.NetbankingPayment;
import PaymentModePackage.PaymentMode;

public class BridgeDPProgram {
    public static void main(String[] args) {
        // Payment through ICICI gateway using Card
        IPaymentGateway iciciPaymentGateway= new ICICIPaymentGateway();
        PaymentMode iciciCardPayment= new CardPayment(iciciPaymentGateway);
        iciciCardPayment.doPayment();

        // Payment through ICICI gateway using Net Banking
        iciciCardPayment= new NetbankingPayment(iciciPaymentGateway);
        iciciCardPayment.doPayment();

        // Payment through HDFC gateway using Card
        IPaymentGateway hdfcGateway= new HDFCPaymentGateway();
        PaymentMode hdfcCardPayment= new CardPayment(hdfcGateway);
        hdfcCardPayment.doPayment();

        PaymentMode hdfcNetPayment= new NetbankingPayment(hdfcGateway);
        hdfcNetPayment.doPayment();
    }
}