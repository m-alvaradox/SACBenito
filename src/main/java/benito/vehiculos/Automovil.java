
package benito.vehiculos;

public class Automovil extends Vehiculo {
    private int asientos;
    private int llantas = 6;
    private boolean convertible;
    private boolean retrocamara;
    
    public Automovil(String marca, String modelo, int anio, Motor motor, double precio,
                     int asientos, boolean convertible, boolean retrocamara) {
    super(marca,modelo,anio,motor,precio);
    this.asientos = asientos;
    this.convertible = convertible;
    this.retrocamara = retrocamara;
 
    }
    
    @Override
    public String toStringTodo() { // Retorno toString con SI/NO en vez de true/false
        String resp = "";
        if(convertible == true) {
            resp = "SI";
        }
        else {
            resp = "NO";
        }
        String resp2 = "";
        if(retrocamara == true) {
            resp2 = "SI";
        }
        else {
            resp2 = "NO";
        }
        
        
        return super.toStringTodo() + " Asientos: "+asientos+" Llantas: "+llantas+ 
                " Convertible: "+resp+" Camara Retro: "+resp2;
    }
    
    
    
}
