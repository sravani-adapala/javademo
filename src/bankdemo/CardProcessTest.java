package bankdemo;

public class CardProcessTest {
    public static void main(String[] args) {
        CardProcessService processService = new CardProcessService();
        CardDetails cardDetails = new CardDetails();
        cardDetails.cardNumber = "1234 1234 1234";
        cardDetails.pinNumber = "1234";
        System.out.println(cardDetails.hashCode());
        boolean loginStatus = processService.login(cardDetails);
        CreditService creditService = new CreditService();
        if (loginStatus) {
            int balence = creditService.credit("1234 1234 1234", 100);
            System.out.println(balence);
            System.out.println("CreditService hashcode" + creditService.hashCode());
            int balence2 = creditService.credit("1234 1234 1234", 100);
            System.out.println("CreditService creditService2" + creditService.hashCode());
            System.out.println(balence2);
        }
    }
}