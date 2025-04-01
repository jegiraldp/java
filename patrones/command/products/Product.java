package command.products;

public class Product {

    private int code;
    private String name;
    private int stock;

    public Product(int code, String name, int stock) {
        this.code = code;
        this.name = name;
        this.stock=stock;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

   

    @Override
    public String toString() {
        return "Product [code=" + code + ", name=" + name + ", stock=" + stock + "]";
    }

    public void sell(int amount){
        this.stock-=amount;
        System.out.println(this.name+" sold: "+amount+" item: - New stock: "+this.stock);

    }
    public void buy(int amount){
        this.stock+=amount;
        System.out.println(this.name+" bought: "+amount+" item: - New stock: "+this.stock);

    }

    public int getStock() {
        return stock;
    }
    

    
}
