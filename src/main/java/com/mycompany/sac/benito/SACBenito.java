
package com.mycompany.sac.benito;
import benito.operaciones.*;
import benito.usuarios.*;
import benito.menu.*;

public class SACBenito {

    public static void main(String[] args) {
        SACBenito.Inicio();

    }
    
    public static void Inicio() {
        Login inicio = new Login(); 
        Usuario conectado = inicio.Login(); // Retorna el objeto usuario que inicio sesion
        VerificarTipoUsuario(conectado);
    }
    
    
    public static Usuario VerificarTipoUsuario (Usuario u) {
        if(u instanceof Cliente ) {
            Cliente c = (Cliente)u;
            MenuCliente lecturainfo = new MenuCliente(c); // Abro el menu de TipoUsuario
            return null;
        } 
        
        if(u instanceof Vendedor) {
            Vendedor v = (Vendedor)u;
            MenuVendedor lecturainfo2 = new MenuVendedor(v);
            return null;
        }
        
        if(u instanceof JefeTaller) {
            JefeTaller j = (JefeTaller)u;
            MenuJefeTaller lecturainfo3 = new MenuJefeTaller(j);
        }
        
        if(u instanceof Supervisor) {
            Supervisor s = (Supervisor)u;
            MenuSupervisor lecturainfo4 = new MenuSupervisor(s);
        }
        
        return null;
    }
        
    
}
