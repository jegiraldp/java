package command.account;

public class InicioAccount {

    public static void main(String[] args) {
        Account account = new Account(123, 1000);
        System.out.println(account.toString());
        iOperation deposit = new DepositImpl(account, 50);
        iOperation withdraw = new WithdrawImp(account, 10);

        Invoker invoker = new Invoker();
        invoker.addOperation(deposit);
        invoker.addOperation(withdraw);
        invoker.doOperations();

    }
    
}
