package decorator.files;

public class NoSpacesDecorator extends DataSourceDecorator{

    public NoSpacesDecorator(iDataSource source) {
        super(source);
        
    }

    @Override
    public String readData(){
        return encode(super.readData());
    }

    @Override
    public void writeData(String data){
        super.writeData(encode(data));
    }

    private String encode(String data){
        return data.replace(" ", "");
    }
    
}
