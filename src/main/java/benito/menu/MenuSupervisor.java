
package benito.menu;

import benito.listas.*;
import benito.operaciones.*;
import benito.usuarios.*;
import benito.vehiculos.Vehiculo;
import com.mycompany.sac.benito.SACBenito;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuSupervisor {
    private Supervisor supervisor;
    ListVehiculos enter = new ListVehiculos(); 
    ArrayList<Vehiculo> vehiculos = enter.cargarVehiculos();
    ListUsuarios enter1 = new ListUsuarios(); 
    ArrayList<Usuario> usuarios = enter1.cargarUsuarios();
    
    public MenuSupervisor (Supervisor s) {
        this.supervisor = s;
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------------");
        System.out.println("      BIENVENIDO, "+supervisor.getName1()+ " " + supervisor.getLastname1() + "      ");
        System.out.println("---------------------------------------");
        
        System.out.println("\t    OPCIONES:");
        System.out.println("    1) SOLICITUDES DE COMPRA");
        System.out.println("    2) CERRAR SESION");
        
        System.out.println();
        
        Validacion val = new Validacion();
        int opcion = val.Validacion(1, 2);
        
        switch(opcion) {
            case 1:
                VerSolicitudCompra();
                MenuSupervisor lecturainfo = new MenuSupervisor(supervisor);
                break;
            case 2:
                SACBenito.Inicio();
                
        }
        
    }
    
    public void VerSolicitudCompra() {
        Lectura read = new Lectura();
            String [] opc = read.RespuestaCliente();
     
            int opcionCliente = Integer.parseInt(opc[0]);
            
            String retornoCliente = opc[1];
            String retornoUser = opc[2];
            System.out.println("Cliente: "+ retornoCliente);
        
            System.out.println("Vehiculo solicitado a comprar:");
            System.out.println(vehiculos.get(opcionCliente).toString());
           
            System.out.println("¿DESEA APROBAR LA SOLICITUD DE COMPRA?");
            System.out.println("1) SI  2) NO");
        
            Validacion val = new Validacion();
            int opcion = val.Validacion(1, 2);
        
            String justificacion = " ";
            if(opcion == 2) {
                System.out.print("MOTIVO DEL RECHAZO DE SOLICITUD: ");
                Scanner sc1 = new Scanner (System.in);
                justificacion = sc1.nextLine();
            }
            else {
           
            }
            
        
            String option = opcion +"";
            Escritura write = new Escritura();
            String retornasupervisor = supervisor.getName1()+" "+supervisor.getLastname1();
            write.EscrituraSupervisor(option, justificacion,retornasupervisor,retornoUser);
            
            
        
            System.out.println("GRACIAS POR TU RESPUESTA");
        
        
    }
    
    
}
