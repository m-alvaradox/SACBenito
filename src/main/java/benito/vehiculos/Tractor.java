
package benito.vehiculos;

public class Tractor extends Vehiculo {
    private boolean agricola;
    private Transmision trans;
    private Motor motor = Motor.DIESEL;
    
    public Tractor (String marca, String modelo, int anio, Motor motor, double precio,
                        boolean agricola, Transmision trans){
        super(marca,modelo,anio,motor,precio);
        this.agricola = agricola;
        this.trans = trans;
        this.motor = Motor.DIESEL;
        
    }
    
    @Override
    public String toStringTodo() { // Retorno toString con SI/NO en vez de true/false
        String resp = "";
        if(agricola == true) {
            resp = "SI";
        }
        else {
            resp = "NO";
        }
        return super.toStringTodo() + " Motor: "+motor+" Agricola: "+resp+" Transmision: "+trans;
    }
  
}
