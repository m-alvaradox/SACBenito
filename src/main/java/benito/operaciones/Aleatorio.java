
package benito.operaciones;

import benito.listas.ListUsuarios;
import benito.usuarios.Vendedor;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;

public class Aleatorio {
    Random rd = new Random();
    ListUsuarios enter1 = new ListUsuarios();
    ArrayList<Vendedor> lvendedores = enter1.cargarVendedores(); // Genero lista solo vendedores
                                                                 // Definido en clase ListUsuarios
    
    public Vendedor VendedorAleatorio() { 
        int numeroaleatorio = rd.nextInt(lvendedores.size());
        
        try {
            FileWriter fichero = new FileWriter("VendedorAleatorio.txt"); 
            fichero.write(lvendedores.get(numeroaleatorio).getUser());
            fichero.close(); // Escribo el vendedor escogido en un archivo
        }
        
        catch (Exception ex) { ex.printStackTrace(); }
        
        return lvendedores.get(numeroaleatorio);
        
    }
    
    public String LeerVendedorAleatorio() {
        String uservendedoraleatorio = "";
        try {
            FileReader lector = new FileReader ("VendedorAleatorio.txt"); // Lectura del vendedor escogido
            BufferedReader BR = new BufferedReader(lector);
            uservendedoraleatorio = BR.readLine();
        }
        
        catch (Exception ex) { ex.printStackTrace(); }
        
        return uservendedoraleatorio;
        
    }
    
    
            
    
    
}
