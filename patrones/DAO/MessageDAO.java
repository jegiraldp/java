package DAO;

import java.util.ArrayList;
import java.util.List;

public class MessageDAO {

    static List<Message> theList = new ArrayList<>();

    public static void createMessage(Message message){
        System.out.println(ConnectionBD.getConnection());
        System.out.println("Insert into table message in database: "+message.getMessage());
        theList.add(message);

    }

    public static List<Message> selectAllMessage(){
        System.out.println(ConnectionBD.getConnection());
        System.out.println("Do Select * from table");
        return theList;
    }

    public static void deleteMessage(int code){
        for (Message message : theList) {
            if(message.getCode()==code){
                System.out.println("Delete from Database where "+message.getCode());
                theList.remove(code);
            }
        }
    }

    public static void updateMessage(Message message){
        for (Message msg : theList) {
            if(msg.getCode()==message.getCode()){
                msg.setMessage(message.getMessage());
                System.out.println("Update table set message "
                +message.getMessage()+"where code ="+message.getCode());
            }
        }
    }

    
    
}
