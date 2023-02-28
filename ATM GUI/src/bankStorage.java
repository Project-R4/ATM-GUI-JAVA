
public class bankStorage {

    private static final bankStorage bankO = new bankStorage();

    private double balance = 1000;
    

    public static bankStorage getInstance() {
        return bankO;

    }

    public double getBal() {
        return balance;
    }

    public void setBal(double balance) {
        this.balance = balance;
    }
    
    private bankStorage() {
    }

    

}
