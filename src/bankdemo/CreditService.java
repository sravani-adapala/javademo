package bankdemo;

public class CreditService {
    int balence;
    public int credit(String accountNumber,int amount){
        int localBalence=0;
        String localaccountNumber="1234 1234 1234";
        if (localaccountNumber.equals(accountNumber)){
            balence=balence+amount;
        }
        localBalence=balence;
        return balence;
    }
}
