package rocks.zipcodewilmington.p06292018Friday;

/**
 * @author leon on 6/29/18.
 */
public class InvestmentBankAccount extends BankAccount {

    public InvestmentBankAccount(Long id, String owner, Double balance, Double interest) {
        super(id, owner, balance, 0.0);
    }

    void accrueInterest() {
        super.setBalance(super.getBalance() + super.getInterest() * 2);
    }
}
