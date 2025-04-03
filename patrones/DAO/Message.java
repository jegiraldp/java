package DAO;

public class Message {

    private int code;
    private String message;
    String autor;

    
    public Message(int code, String message, String autor) {
        this.code = code;
        this.message = message;
        this.autor = autor;
    }

    public Message() {
    }
    
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Message [code=" + code + ", message=" + message + ", autor=" + autor + "]";
    }

    

    
}
