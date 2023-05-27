
package benito.listas;

import benito.usuarios.*;
import java.util.ArrayList;

public class ListUsuarios {
    
    public ArrayList<Usuario> cargarUsuarios() {
        ArrayList<Usuario> lusuarios = new ArrayList<>();
        lusuarios.add(new Cliente("pi","1234","MICHAEL","ANDRES","PENA","ROCA",
                              "0930565786","TECNICO",60000));
    
        lusuarios.add(new Cliente("pchavez","567","PAULINA","ANDREA","CHAVEZ","MONROY",
                              "0930565486","ESTILISTA",50000));

        lusuarios.add(new Vendedor("mrojas","567","MAURICIO","ALBERTO","ROJAS","HERNANDEZ",
                              "0930565486"));
    
        lusuarios.add(new Vendedor("atomala","777","ALDO","PEPE","TOMALA","GONZALEZ",
                              "0930548766"));
        
        ArrayList<String> cacad = new ArrayList<>();
        cacad.add("MBA");
        cacad.add("Diplomado en Contaduria Publica");
        lusuarios.add(new Supervisor("mmiranda","2222","MARCOS","BENITO","MIRANDA","TORRES",cacad));
        
        ArrayList<String> ctec = new ArrayList<>();
        ctec.add("Diplomado en Hidraulica");
        ctec.add("Certificado en Seguridad Industrial");
        lusuarios.add(new JefeTaller("hperez","3333","HERNAN","ROBERTO","PEREZ","LIMONES",ctec));
        
        
        
        return lusuarios;
    }
    
    public ArrayList<Vendedor> cargarVendedores() {
        ArrayList<Usuario> lusuarios = cargarUsuarios();
        ArrayList<Vendedor> lvendedores = new ArrayList<>();
        
        for(Usuario u : lusuarios) {
            if(u instanceof Vendedor) {
                Vendedor v = (Vendedor)u;
                lvendedores.add(v);  
            }   
        }
        return lvendedores;
        
    }
    
}
