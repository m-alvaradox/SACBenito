
package benito.operaciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Lectura {
    
    
    public String[] RespuestaCliente() { // Retorno la respuesta del cliente Cotizacion
        String opcionretorno = "";
        String [] parts = new String[3];
        try {
            FileReader lector = new FileReader ("OpcionCliente.txt");
            BufferedReader BR = new BufferedReader(lector);
            opcionretorno = BR.readLine();
            
            parts = opcionretorno.split(",");
        }
        
        catch (Exception ex) { ex.printStackTrace(); }
        
        return parts;
        
    }
    
    public String[] RespuestaCompra() { // Retorno la respuesta del cliente Compra
        String opcionretorno = "";
        String [] parts = new String[3];
        try {
            FileReader lector = new FileReader ("OpcionClienteCompra.txt");
            BufferedReader BR = new BufferedReader(lector);
            opcionretorno = BR.readLine();
            
            parts = opcionretorno.split(",");
        }
        
        catch (Exception ex) { ex.printStackTrace(); }
        
        return parts;
        
    }
    
    public String [] RespuestaVendedor() { // Retorno la respuesta del vendedor Cotizacion
        String opcionretorno = "";
        String [] parts = new String[4];
        try {
            FileReader lector = new FileReader ("RespuestaVendedor.txt");
            BufferedReader BR = new BufferedReader(lector);
            opcionretorno = BR.readLine();
            
            parts = opcionretorno.split(",");
            
        }
        
        catch (Exception ex) { ex.printStackTrace(); }
        
        
        return parts;
        
    }
    
    public String [] RespuestaSupervisor() { // Retorno la respuesta del vendedor Compra
        String opcionretorno = "";
        String [] parts = new String[4];
        try {
            FileReader lector = new FileReader ("RespuestaSupervisor.txt");
            BufferedReader BR = new BufferedReader(lector);
            opcionretorno = BR.readLine();
            
            parts = opcionretorno.split(",");
            
        }
        
        catch (Exception ex) { ex.printStackTrace(); }
        
        
        return parts;
        
    }
    
}
