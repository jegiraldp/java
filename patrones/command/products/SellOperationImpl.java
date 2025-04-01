package command.products;

public class SellOperationImpl implements iOperation{

    private Product product;
    private int amount;

    @Override
    public void execute() {
        this.product.sell(this.amount);
    }

    public SellOperationImpl(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    
    
}
