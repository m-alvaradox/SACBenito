
package benito.listas;
import java.util.ArrayList;
import benito.vehiculos.*;

public class ListVehiculos {
    public ArrayList<Vehiculo> cargarVehiculos() {
        ArrayList<Vehiculo> lvehiculos = new ArrayList<>();
        lvehiculos.add(new Automovil("AUDI","A3",2023,Motor.DIESEL,20000,4,false,true));
        lvehiculos.add(new Motocicleta("HONDA","SUPERCUB",1998,Motor.GASOLINA,15000,CategoriaMoto.SCOOTER));
        lvehiculos.add(new Camion("HINO","A72",2000,Motor.DIESEL,140000,120.5));
        lvehiculos.add(new Tractor("CHERCH","A12",1980,Motor.DIESEL,30000,true,Transmision.MECANICA));
        return lvehiculos;
    }
    
    
}
