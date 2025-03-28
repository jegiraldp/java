package decorator.files;

public class FileDataSource implements iDataSource{
    private String file;
    private String contenido;
   
    public FileDataSource(String file) {
        this.file = file;
        this.contenido="";
    }

    @Override
    public void writeData(String data) {
      contenido=data;
    }

    @Override
    public String readData() {
      return contenido;
    }

    public String getFile() {
        return this.file;
    }

}