package rocks.zipcodewilmington.p06292018Friday;

/**
 * @author leon on 6/29/18.
 */
public abstract class BankAccount {

    private final Long id;
    private final Double interest;
    private String owner;
    private Double balance;

    public BankAccount(Long id, String owner, Double balance, Double interest) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
        this.interest = interest;
    }

    abstract void accrueInterest();


    public Long getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getInterest() {
        return interest;
    }
}
