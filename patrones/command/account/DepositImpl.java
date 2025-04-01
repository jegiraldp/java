package command.account;

public class DepositImpl implements iOperation {

    private Account account;
    private double amount;

    @Override
    public void execute() {
        this.account.withdraw(this.amount);
    }

    public DepositImpl(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    
    
    
}
