
package benito.operaciones;

import java.io.FileWriter;

public class Escritura {
    
    public void EscrituraCliente(String w) { // Escribe la opcion del Cliente Cotizacion
        try {
            FileWriter fichero = new FileWriter("OpcionCliente.txt");
            fichero.write(w);
            fichero.close();
        }
        
        catch (Exception ex) { ex.printStackTrace(); }
        
    }
    
    public void EscrituraClienteOpcionCompra(String e){ // Escribe la opcion del Cliente Compra
        try {
            FileWriter fichero = new FileWriter("OpcionClienteCompra.txt");
            fichero.write(e);
            fichero.close();
        }
        
        catch (Exception ex) { ex.printStackTrace(); }
        
    }
    
    public void EscrituraVendedor(String w, String w1, String w2, String w3) { // Escribe la opcion del Vendedor cotizacion
        try {
            FileWriter fichero = new FileWriter("RespuestaVendedor.txt");
            fichero.write(w+","+w1+","+w2+","+w3);
            fichero.close();
        }
        
        catch (Exception ex) { ex.printStackTrace(); }
        
    }
    
    public void EscrituraSupervisor(String w, String w1, String w2, String w3) { // Escribe la opcion del Vendedor compra
        try {
            FileWriter fichero = new FileWriter("RespuestaSupervisor.txt");
            fichero.write(w+","+w1+","+w2+","+w3);
            fichero.close();
        }
        
        catch (Exception ex) { ex.printStackTrace(); }
        
    }
    
    
}
