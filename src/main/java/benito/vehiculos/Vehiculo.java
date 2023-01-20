
package benito.vehiculos;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private Motor motor;
    private double precio;
    
    public Vehiculo(String marca, String modelo, int anio,
                    Motor motor, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.motor = motor;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getAnio() {
        return anio;
    }
    
    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio;
    }
    
    public String toStringTodo() { // Retorna todas las especificaciones del vehiculo
        return "Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio +", Precio: "+ precio;
    }
    
    
    
    
    
    
}
