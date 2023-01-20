
package benito.menu;
import benito.listas.ListVehiculos;
import benito.operaciones.*;
import benito.usuarios.Cliente;
import benito.usuarios.Vendedor;
import com.mycompany.sac.benito.SACBenito;
import java.util.Scanner;
import benito.vehiculos.Vehiculo;
import java.util.ArrayList;

public class MenuCliente {
    private Cliente cliente;
    ListVehiculos enter = new ListVehiculos(); 
    ArrayList<Vehiculo> vehiculos = enter.cargarVehiculos();
    
    
    public MenuCliente(Cliente c) {
        this.cliente = c;
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------------");
        System.out.println("      BIENVENIDO, "+cliente.getName1()+ " " + cliente.getLastname1() + "      ");
        System.out.println("---------------------------------------");
        
        System.out.println("\t    OPCIONES:");
        System.out.println("    1) CONSULTAR STOCK");
        System.out.println("    2) ESTADO SOLICITUDES DE COTIZACION");
        System.out.println("    3) ESTADO SOLICITUDES DE COMPRA");
        System.out.println("    4) MANTENIMIENTO");
        System.out.println("    5) CERRAR SESION");
        
        
        
        System.out.println();
        
        Validacion val = new Validacion(); //Clase que realiza validaciones en menus
        int opcion = val.Validacion(1, 5);
        
        switch(opcion) {
            case 1:
                ConsultarStock();
                EscogerVehiculo();
                MenuCliente lecturainfo = new MenuCliente(cliente); // Retorna al Menu Principal (Cliente)
                break;
            case 2:
                EstadoSolicitudCotizacion();
                MenuCliente lecturainfo1 = new MenuCliente(cliente);
                break;
            case 3:
                EstadoSolicitudCompra();
                MenuCliente lecturainfo2 = new MenuCliente(cliente);
                break;
            case 4:
                System.out.println("En construccion");
                break;
            case 5:
                SACBenito.Inicio(); // Cierra sesion y vuelve al Login  
        }
          
    }
    
    public void ConsultarStock() {
        System.out.println("Tenemos a disposicion los siguientes vehiculos\n");
        int i = 0;
        for(Vehiculo v : vehiculos) { // Recorro el Arraylist vehiculos para muestreo
            i ++;
            System.out.println("\n" + i +") "+ v.toString());
        }
    }
    
    public void EscogerVehiculo() {
        System.out.println("Escoga el vehiculo que desea cotizar, (0 para salir): ");
        Validacion val = new Validacion();
        int opcion = val.Validacion(0, vehiculos.size());
        
        
        if(opcion == 0) {
            MenuCliente lecturainfo = new MenuCliente(cliente); 
        }
        else { 
            opcion -=1; // Opcion del cliente -1, arreglo empieza con indice 0
            String option = opcion +"";
            Escritura write = new Escritura();
            write.EscrituraCliente(option+","+cliente.getName1()+" "+cliente.getLastname1()+","+cliente.getUser());
            // Envio a traves de un archivo la opcion escogida, nombres y apellidos del cliente y usuario
        }
        
        System.out.println("Su solicitud de cotizacion fue enviado correctamente");
        Vendedor vescogido = VendedorAleatorio(); // Muestro el vendedor que debe aprobar la solicitud
        System.out.println("VENDEDOR encargado: "+vescogido.getName1()+" "+vescogido.getLastname1());
    
    }
    public Vendedor VendedorAleatorio() {
        Aleatorio al = new Aleatorio();
        Vendedor vescogido = al.VendedorAleatorio();
        
        
        return vescogido;
    }
    
    public void EstadoSolicitudCotizacion() {
        
        Lectura read = new Lectura();
        String [] respuestas = read.RespuestaVendedor();
        if(cliente.getUser().equals(respuestas[3])) { 
            int respuesta = Integer.parseInt(respuestas[0]);
        
            switch(respuesta) {
                case 1:
                    String [] opc = read.RespuestaCliente();
                    int opcionCliente = Integer.parseInt(opc[0]);
            
                    System.out.println("Fue APROBADA su SOLICITUD");
            
                    System.out.println("Se muestran demas Especificaciones del vehiculo\n");
                    System.out.println(vehiculos.get(opcionCliente).toStringTodo());
                    System.out.println("Vendedor calificador: "+respuestas[2]);
                    SolicitarCompra();
                    break;
            
                case 2:
                    System.out.println("Fue RECHAZADA su SOLICITUD");
                    System.out.println("Motivo descrito por el vendedor "+respuestas[2]+": "+respuestas[1]);
                    break;
            }
                  
        }
        
        else {
            System.out.println("Vacio");
        }
        
    }
    
    public void SolicitarCompra() {
        System.out.println("¿DESEA SOLICITAR COMPRA?  1) SI   2) NO");
        Validacion val = new Validacion();
        int opcion = val.Validacion(1, 2);
        String option = opcion +"";
        
        System.out.println("Su respuesta ha sido registrada exitosamente");
        if(opcion == 1) {
            System.out.println("Se envio su solicitud al supervisor");
        }
        
        Escritura write = new Escritura();
        write.EscrituraClienteOpcionCompra(option+","+cliente.getName1()+" "+cliente.getLastname1()+","+cliente.getUser());
    }
    
    public void EstadoSolicitudCompra() {
        
        Lectura read = new Lectura();
        String [] respuestas = read.RespuestaSupervisor();
        if(cliente.getUser().equals(respuestas[3])) {
            int respuesta = Integer.parseInt(respuestas[0]);
        
            switch(respuesta) {
                case 1:
                    String [] opc = read.RespuestaCliente();
                    int opcionCliente = Integer.parseInt(opc[0]);
            
                    System.out.println("Su compra ha sido APROBADA");
            
                    System.out.println("Se muestran Especificaciones del vehiculo AQUIRIDO\n");
                    System.out.println(vehiculos.get(opcionCliente).toStringTodo());
                    System.out.println("Supervisor calificador: "+respuestas[2]);
                    
                    System.out.println("Puede acercarse al taller de la concesionaria BENITO para"
                            + " retirarlo cuando guste");
                    break;
            
                case 2:
                    System.out.println("Fue RECHAZADA su SOLICITUD DE COMPRA");
                    System.out.println("Motivo descrito por el supervisor "+respuestas[2]+": "+respuestas[1]);
                    break;
            }
                  
        }
        
        else {
            System.out.println("Vacio");
        }
        
    }
         
}
