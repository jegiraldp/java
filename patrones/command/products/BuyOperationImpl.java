package command.products;

public class BuyOperationImpl implements iOperation{

    private Product product;
    private int amount;

    @Override
    public void execute() {
       this.product.buy(this.amount);
    }

    public BuyOperationImpl(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    
    
}
