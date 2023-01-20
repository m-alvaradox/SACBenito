
package benito.vehiculos;

public class Camion extends Vehiculo {
    private double carga;
    private int llantas = 6;
    private int ejes = llantas/2;
    
    public Camion(String marca, String modelo, int anio, Motor motor, double precio,
                  double carga) {
        super(marca,modelo,anio,motor,precio);
        this.carga = carga;
    }
    
    @Override
    public String toStringTodo() {
        return super.toStringTodo() + " Capacidad Carga: "+carga+" kg Llantas: "+llantas+ "Ejes: "+ejes;
    }
     
}
