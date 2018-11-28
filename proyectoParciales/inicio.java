import java.io.*;

public class inicio {
    static BufferedReader br;
    static String op;
    static listaEstudiantes listaEs;
    static estudiante student;
    
   static boolean bnd;
    
    public static void main(String[] a) throws IOException{
        bnd=false;
        br = new BufferedReader(new InputStreamReader(System.in));
        listaEs = new listaEstudiantes();
        inicia();
            
    }//main
    
    static void inicia() throws IOException{
        
        System.out.print(menu.general());
        op= br.readLine();
        
        switch (op) {
        
            case "1":
            iniciaMenuReportes();
            break;    
            
            case "2":
            System.out.print("Usuario =>");
            String u= br.readLine();
            u=u.trim();
            System.out.print("Clave =>");
            String c= br.readLine();
            c=c.trim();
        
            if(login.validar(u, c)){
                               
                iniciaMenuAdmin();
                
            }else{
                System.out.println("ATENCIÓN: Usuario no permitido");
                inicia();
            }//if validar
            break;
            
            case "99":
             salir();
            break; 
                
            default:
            System.out.println("Error !!!" );
            inicia();
             break;                
        }//switcht
        
     
    }//inicia
    
    static void iniciaMenuAdmin() throws IOException{
            System.out.print(menu.admin());
            op= br.readLine();
            switch (op) {
            case "1":
           iniciaMenuEstudiantes();
            break;    
            
            case "2":
            
            iniciaMenuDocentes();
            break; 
            
            case "3":
            
            iniciaMenuCursos();
            break; 
                
            case "4":
            
            iniciaMenuGrupos();
            break; 
                
            case "5":
            
            iniciaMenuParciales();
            break; 
                
            case "9":
                inicia();
            break; 
            
            case "99":
            salir();
            break; 
                
            default:
            System.out.println("Error !!!" );
            iniciaMenuAdmin();
             break;                
        }//switcht
        
    
    }//inicia
    
    static void iniciaMenuEstudiantes() throws IOException{
            
            int cod=0, ced=0;
            String nom="off";
   
            System.out.print(menu.adminEstudiantes());
            op= br.readLine();
            
            switch (op) {
            case "1":
                try{
            if(bnd){
                    System.out.print("Documento =>");
                    ced=Integer.parseInt(br.readLine());
                    if((student=listaEs.buscar(ced))!=null){
                        System.out.println("Datos de estudiante:");
                        System.out.println("Documento: "+student.getCedula());
                        System.out.println("Nombre: "+student.getNombre());
                    iniciaMenuEstudiantes();
                    }else{
                    System.out.println("¡¡ Error: Estudiante NO existe !!");    
                    iniciaMenuEstudiantes();
                    }//sino buscar
                    
                }else{
                    System.out.println("No hay registros");
                    iniciaMenuEstudiantes();
                }
            }catch(Exception e){
                    System.out.println("Error !!!");
                    iniciaMenuEstudiantes();
                }
            break;    
            
            case "2":
                if(bnd){
                    System.out.println(listaEs.printList());
                    iniciaMenuEstudiantes();
                }else{
                    System.out.println("No hay registros");
                    iniciaMenuEstudiantes();
                }
            
            break; 
            
            case "3":
                try{
                System.out.print("Documento =>");
                ced=Integer.parseInt(br.readLine());
                System.out.print("Nombre =>");
                nom=br.readLine();
                if(listaEs.existe(ced)){
                    System.out.println("Error: Estudiante ya está registrado con ese documento");
                    iniciaMenuEstudiantes();
                }else{
                listaEs.nuevo(ced, ced, nom);
                System.out.println("\n ¡¡¡ Estudiante Registrado !!! ");
                bnd=true;
                iniciaMenuEstudiantes();
                }//else
                }catch(Exception e){
                    System.out.println("Error !!!");
                    iniciaMenuEstudiantes();
                }
            break; 
                
            case "4":
                 try{
            if(bnd){
                    System.out.print("Documento de estudiante a editar =>");
                    ced=Integer.parseInt(br.readLine());
                    if((student=listaEs.buscar(ced))!=null){
                        System.out.print("Nuevo nombre => ");
                        String nuevoN= br.readLine();
                        listaEs.editar(student.getCodigo(),nuevoN);
                        System.out.println("¡¡ Estudiante actualizado !!"); 
                    iniciaMenuEstudiantes();
                    }else{
                    System.out.println("¡¡ Error: Estudiante NO existe !!");    
                    iniciaMenuEstudiantes();
                    }//sino buscar
                    
                }else{
                    System.out.println("No hay registros");
                    iniciaMenuEstudiantes();
                }
            }catch(Exception e){
                    System.out.println("Error !!!");
                    iniciaMenuEstudiantes();
                }
            break;
                
            case "9":
                iniciaMenuAdmin();
            break; 
            
            case "99":
             salir();
            break; 
                
            default:
            System.out.println("Error !!!" );
            iniciaMenuEstudiantes();
             break;                
        }//switcht
        
    
    }//inicia

    static void iniciaMenuDocentes() throws IOException{
        System.out.print(menu.adminDocentes());
            op= br.readLine();    
        switch (op) {
            case "1":
            System.out.print(menu.adminEstudiantes());
            break;    
            
            case "2":
            System.out.print(menu.adminDocentes());
            break; 
            
            case "3":
            System.out.print(menu.adminCursos());
            break; 
                
            case "4":
            System.out.print(menu.adminGrupos());
            break; 
                
            case "9":
                iniciaMenuAdmin();
            break; 
            
            case "99":
             salir();
            break; 
                
            default:
            System.out.println("Error !!!" );
            iniciaMenuDocentes();
             break;                
        }//switcht
    }//inicia

    static void iniciaMenuCursos() throws IOException{
        System.out.print(menu.adminCursos());
            op= br.readLine(); 
            switch (op) {
            case "1":
            System.out.print(menu.adminEstudiantes());
            break;    
            
            case "2":
            System.out.print(menu.adminDocentes());
            break; 
            
            case "3":
            System.out.print(menu.adminCursos());
            break; 
                
            case "4":
            System.out.print(menu.adminGrupos());
            break; 
                
            case "9":
                iniciaMenuAdmin();
            break; 
            
            case "99":
             salir();
            break; 
                
            default:
            System.out.println("Error !!!" );
            iniciaMenuCursos();
             break;                
        }//switcht
    }//inicia

    static void iniciaMenuGrupos() throws IOException{
        System.out.print(menu.adminGrupos());
            op= br.readLine(); 
            switch (op) {
            case "1":
            System.out.print(menu.adminEstudiantes());
            break;    
            
            case "2":
            System.out.print(menu.adminDocentes());
            break; 
            
            case "3":
            System.out.print(menu.adminCursos());
            break; 
                
            case "4":
            System.out.print(menu.adminGrupos());
            break; 
                
                case "5":
            System.out.print(menu.adminGrupos());
            break;
                
            case "9":
                iniciaMenuAdmin();
            break; 
            
            case "99":
             salir();
            break; 
                
            default:
            System.out.println("Error !!!" );
            iniciaMenuGrupos();
             break;                
        }//switcht
    }//inicia
    
    static void iniciaMenuParciales() throws IOException{
        System.out.print(menu.adminParciales());
            op= br.readLine();     
        switch (op) {
            case "1":
            System.out.print(menu.adminEstudiantes());
            break;    
            
            case "2":
            System.out.print(menu.adminDocentes());
            break; 
            
            case "3":
            System.out.print(menu.adminCursos());
            break; 
                
            case "4":
            System.out.print(menu.adminGrupos());
            break; 
                
            
            case "9":
                iniciaMenuAdmin();
            break; 
            
            case "99":
             salir();
            break; 
                
            default:
            System.out.println("Error !!!" );
            iniciaMenuParciales();
             break;                
        }//switcht
    }//inicia

    static void salir(){
        System.out.println("\n\nPrograma Finalizado");
                System.exit(0);
        }
    
    static void iniciaMenuReportes() throws IOException{
            System.out.print(menu.reportes());
            op= br.readLine();
            switch (op) {
            case "1":
           iniciaMenuEstudiantes();
            break;    
            
            case "2":
            
            iniciaMenuDocentes();
            break; 
            
            case "3":
            
            iniciaMenuCursos();
            break; 
                
            case "4":
            
            iniciaMenuGrupos();
            break; 
                
            case "5":
            
            iniciaMenuParciales();
            break; 
                
            case "9":
                inicia();
            break; 
            
            case "99":
            salir();
            break; 
                
            default:
            System.out.println("Error !!!" );
            iniciaMenuReportes();
             break;                
        }//switcht
        
    
    }//inicia
}//class
