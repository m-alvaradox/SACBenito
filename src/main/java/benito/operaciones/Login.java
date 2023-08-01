
package benito.operaciones;
import benito.usuarios.*;
import benito.listas.ListUsuarios;
import java.util.*;

public class Login {
    
    
     public Usuario Login() {
         
         ListUsuarios enter = new ListUsuarios();
         ArrayList<Usuario> usuarios = enter.cargarUsuarios();
         Scanner sc = new Scanner(System.in);
         boolean validacion = false;
         
         System.out.println("""
                            --------------------------------------- 
                            \tCONSECIONARIA BENITO 
                            ---------------------------------------""");
        System.out.println();
         
         
         while(validacion == false) {
             System.out.print("Usuario: ");
             String user = sc.nextLine();
             System.out.print("Clave: ");
             String password = sc.nextLine();
             
             for(Usuario u : usuarios) {
                 if(u.getUser().equals((user))) {
                     if(u.getPassword().equals(password)) {
                         System.out.println("Log in correcto");
                         return u;
                     }
                 }       
             }
             
             System.out.println("Usuario y/o clave incorrecta");
             System.out.println();
         }
         return null;
     }
     
}
        

