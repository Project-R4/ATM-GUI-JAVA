
public class AccountNumber {
    private static final AccountNumber acc = new AccountNumber();

    private String account;
    

    public static AccountNumber getInstance() {
        return acc;

    }

    public String getAcc() {
        return account;
    }

    public void setAcc(String account) {
        this.account = account;
    }
    
    private AccountNumber() {
    }

}
