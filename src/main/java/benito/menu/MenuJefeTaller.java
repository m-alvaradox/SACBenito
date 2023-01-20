
package benito.menu;

import benito.listas.ListVehiculos;
import benito.operaciones.Lectura;
import benito.operaciones.Validacion;
import benito.usuarios.JefeTaller;
import benito.vehiculos.Vehiculo;
import com.mycompany.sac.benito.SACBenito;
import java.util.ArrayList;
import java.util.Scanner;


public class MenuJefeTaller {
    private JefeTaller jefetaller;
    ListVehiculos enter = new ListVehiculos(); 
    ArrayList<Vehiculo> vehiculos = enter.cargarVehiculos();
    
    public MenuJefeTaller(JefeTaller j) {
        this.jefetaller = j;
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------------");
        System.out.println("      BIENVENIDO, "+jefetaller.getName1()+ " " + jefetaller.getLastname1() + "      ");
        System.out.println("---------------------------------------");
        
        System.out.println("\t    OPCIONES:");
        System.out.println("    1) ENTREGAR VEHICULOS NUEVOS");
        System.out.println("    2) ADMINISTRAR VEHICULOS EN MANTENIMIENTO");
        System.out.println("    3) CERRAR SESION");
        
        System.out.println();
        
        Validacion val = new Validacion();
        int opcion = val.Validacion(1, 3);
        
        switch(opcion) {
            case 1:
                EntregarVehiculo();
                MenuJefeTaller lecturainfo = new MenuJefeTaller(jefetaller);
                break;
            case 2:
                MantenimientoVehiculo();
                MenuJefeTaller lecturainfo1 = new MenuJefeTaller(jefetaller);
                break;
            case 3:
                SACBenito.Inicio();
                
        }
    }
    
    public void EntregarVehiculo() {
        Lectura read = new Lectura();
        Lectura read1 = new Lectura();
        String [] respuestas = read.RespuestaSupervisor();
        String [] opc = read1.RespuestaCliente();
        int respuesta = Integer.parseInt(respuestas[0]);
        int opcionCliente = Integer.parseInt(opc[0]);
        
        switch(respuesta) {
                case 1:
                    System.out.println("USTED DEBE ENTREGAR EL SIGUIENTE VEHICULO: ");
                    System.out.println(vehiculos.get(opcionCliente).toString());
                    String retornoCliente = opc[1];
                    System.out.println("BENEFICIARIA: "+ retornoCliente);
                    System.out.println("CONFIRMAR ENTREGA: 1)SI  2)SALIR");
                    Validacion val = new Validacion();
                    int opcion5 = val.Validacion(1, 2);
                    if(opcion5 == 1) {
                        System.out.println("ENTREGA CONFIRMADA");
                    }
                    break;
                    
                case 2:
                    System.out.println("No hay elementos que mostrar por ahora");
                    break;
    
        }
    }
    
    public void MantenimientoVehiculo() {
        System.out.println("En construccion");
        
    }
    
}
