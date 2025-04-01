package command.products;

public class InicioProductos {

    public static void main(String[] args) {
        
        Product product = new Product(123,"glass", 100);
        System.out.println(product.toString());
        
        iOperation buy = new BuyOperationImpl(product, 20);
        iOperation sell = new SellOperationImpl(product, 5);

        Invoker invoker = new Invoker();
        invoker.addOperation(buy);
        invoker.addOperation(sell);
        invoker.doOperations();

    }
    
}
