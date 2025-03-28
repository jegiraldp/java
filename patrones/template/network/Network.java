package template.network;

public abstract class Network {

    String userName;
    String password;


    public Network() {
    }

    public boolean post(String msg){
        if(logIn(this.userName, this.password)){
            boolean r = sendData(msg);
            logOut();
            return r;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(String data);
    abstract void logOut();

    
    
}
