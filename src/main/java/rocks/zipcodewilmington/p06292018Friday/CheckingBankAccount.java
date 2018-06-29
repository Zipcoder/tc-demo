package rocks.zipcodewilmington.p06292018Friday;

/**
 * @author leon on 6/29/18.
 */
public class CheckingBankAccount extends BankAccount {
    public CheckingBankAccount(Long id, String owner, Double balance) {
        super(id, owner, balance, 3.0);
    }

    void accrueInterest() {
        super.setBalance(super.getBalance() + super.getInterest() * 10);
    }
}
