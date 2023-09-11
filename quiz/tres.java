public class tres extends dos{
    public int z;
    public tres(int x, int y, int z) {
        super(x,y);
        this.z=z;
        System.out.print(z);
    }

    public static void main(String[] args) {
        tres obj = new tres(1,2,3);
    }
}
