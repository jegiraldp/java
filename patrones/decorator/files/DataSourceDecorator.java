package decorator.files;

public abstract class DataSourceDecorator implements iDataSource {

    private iDataSource wrapee;
    

    public DataSourceDecorator(iDataSource source) {
        this.wrapee = source;
    }

    @Override
    public void writeData(String data) {
        wrapee.writeData(data);
    }

    @Override
    public String readData() {
        return wrapee.readData();
    }
   
}
