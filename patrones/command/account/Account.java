package command.account;

public class Account {

    private int id;
    private double amount;


    public Account(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public void withdraw(double amount){
        this.amount= this.amount-amount;
        System.out.println("Withdraw Ok..("+amount+")\nAccount :"+id+". Current Amount: "+this.amount);
    }

    public void deposit(double amount){
        this.amount=this.amount+amount;
        System.out.println("Deposit Ok..("+amount+")\nAccount :"+id+". Current Amount: "+this.amount);
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", amount=" + amount + "]";
    }
}
