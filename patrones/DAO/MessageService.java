package DAO;

import java.util.List;
import java.util.Scanner;

public class MessageService {
    static int code =0;
        
    public static void createMessage(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your message");
        String msg = sc.nextLine();
        System.out.println("Write your name");
        String name = sc.nextLine();

        Message message = new Message();
        message.setCode(code);
        message.setMessage(msg);
        message.setAutor(name);

        MessageDAO.createMessage(message);
        code++;
        
    }

    public static void listMessage(){
        List<Message> theList= MessageDAO.selectAllMessage();
        theList.forEach(System.out::println);
    }

    public static void deleteMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write code to delete");
        int code = sc.nextInt();
        MessageDAO.deleteMessage(code);
       

    }

    public static void editMessage(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Write code to Edit");
        int code = scn.nextInt();
        System.out.println("Write New Message");
        String newMessage = scn.next();
        System.out.println(newMessage);
       
        MessageDAO.updateMessage(new Message(code,newMessage,null));
    }


    
}
