package DAO;

import java.util.Scanner;

public class InicioDAO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op=0;

        do {
            System.out.println("--- Menu ---");
            System.out.println("Message App DAO");
            System.out.println("1. Create Message");
            System.out.println("2. List Message");
            System.out.println("3. Edit Message");
            System.out.println("4. Delete Message");
            System.out.println("5. Exit");

            op=sc.nextInt();

            switch (op) {
                case 1:
                    MessageService.createMessage();
                    break;
                case 2:
                    MessageService.listMessage();
                    break;
                case 3:
                    MessageService.editMessage();
                    break;
                 case 4:
                    MessageService.deleteMessage();   
                    break;
            
                default:
                    break;
            }

        } while (op!=5);


    }
    
}
