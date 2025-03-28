package template.network;

public class Facebook extends Network{

    public Facebook(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    boolean logIn(String userName, String password) {
        System.out.println("Validating...");
        System.out.println("Username : "+this.userName);
        System.out.print("Password : ");
        for (int i = 0; i < password.length(); i++) {
            System.out.print("*");            
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;

    }

    @Override
    boolean sendData(String data) {
        boolean msgPosted=true;
        if(msgPosted){
            System.out.println("\n"+data+" was posted on Facebook");
            return true;
        }else{
            return false;
        }
        
    }

    @Override
    void logOut() {
       System.out.println("Logout from Facebook");
    }
    
}
