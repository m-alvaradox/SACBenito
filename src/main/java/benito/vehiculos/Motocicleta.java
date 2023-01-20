
package benito.vehiculos;

public class Motocicleta extends Vehiculo {
    private CategoriaMoto tipomoto;
    private int llantas = 2;
    
    public Motocicleta (String marca, String modelo, int anio, Motor motor, double precio,
                        CategoriaMoto tipomoto){
        super(marca,modelo,anio,motor,precio);
        this.tipomoto = tipomoto;
        
    }
    
    @Override
    public String toStringTodo() {
        return super.toStringTodo() + " Categoria Moto: "+tipomoto+" Llantas: "+llantas;
    }
    
}
