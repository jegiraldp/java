package command.account;

public class WithdrawImp implements iOperation{

    private Account account;
    private double amount;

    @Override
    public void execute() {
        this.account.deposit(this.amount);
    }

    public WithdrawImp(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    

}
