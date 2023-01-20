
package benito.menu;

import benito.listas.*;
import benito.operaciones.*;
import benito.usuarios.Usuario;
import benito.usuarios.Vendedor;
import benito.vehiculos.Vehiculo;
import com.mycompany.sac.benito.SACBenito;
import java.util.ArrayList;
import java.util.Scanner;


public class MenuVendedor {
    private Vendedor vendedor;
    ListVehiculos enter = new ListVehiculos(); 
    ArrayList<Vehiculo> vehiculos = enter.cargarVehiculos();
    ListUsuarios enter1 = new ListUsuarios(); 
    ArrayList<Usuario> usuarios = enter1.cargarUsuarios();
    
    public MenuVendedor (Vendedor v) {
        this.vendedor = v;
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------------");
        System.out.println("      BIENVENIDO, "+vendedor.getName1()+ " " + vendedor.getLastname1() + "      ");
        System.out.println("---------------------------------------");
        
        System.out.println("\t    OPCIONES:");
        System.out.println("    1) VER SOLICITUDES");
        System.out.println("    2) ADMINISTRAR VEHICULOS EN MANTENIMIENTO");
        System.out.println("    3) CONSULTAR STOCK");
        System.out.println("    4) CERRAR SESION");
        
        System.out.println();
        
        Validacion val = new Validacion();
        int opcion = val.Validacion(1, 4);
        
        switch(opcion) {
            case 1:
                VerSolicitudes();
                break;
            case 2:
                MantenimientoVehiculos();
                break;
            case 3:
                ConsultarStock();
                MenuVendedor lecturainfo = new MenuVendedor(vendedor);
            case 4:
                SACBenito.Inicio();
                
        }
        
    }
    
    public void VerSolicitudes() {
        Aleatorio a1 = new Aleatorio();
        String uservendedoraleatorio = a1.LeerVendedorAleatorio();
        if(vendedor.getUser().equals(uservendedoraleatorio)) {
            System.out.println("SOLICITUD DE COTIZACION DE CLIENTE");
            Lectura read = new Lectura();
            String [] opc = read.RespuestaCliente();
            int opcionCliente = Integer.parseInt(opc[0]);
            
            String retornoCliente = opc[1];
            String retornoUser = opc[2];
            System.out.println("Cliente: "+ retornoCliente);
        
            System.out.println("Vehiculo solicitado:");
            System.out.println(vehiculos.get(opcionCliente).toString());
           
            System.out.println("¿DESEA APROBAR LA SOLICITUD?");
            System.out.println("1) SI  2) NO");
        
            Validacion val = new Validacion();
            int opcion = val.Validacion(1, 2);
        
            String justificacion = " ";
            if(opcion == 2) {
                System.out.print("MOTIVO DEL RECHAZO DE SOLICITUD: ");
                Scanner sc1 = new Scanner (System.in);
                justificacion = sc1.nextLine();
            }
        
            String option = opcion +"";
            Escritura write = new Escritura();
            String retornavendedor = vendedor.getName1()+" "+vendedor.getLastname1();
            write.EscrituraVendedor(option, justificacion,retornavendedor,retornoUser);
            
        
        
            System.out.println("GRACIAS POR TU RESPUESTA");
        
            MenuVendedor lecturainfo = new MenuVendedor(vendedor);
        }
        else {
            System.out.println("No tiene solicitudes pendientes por ahora");
            MenuVendedor lecturainfo = new MenuVendedor(vendedor);
               }
        
    }
    
    public void MantenimientoVehiculos() {
        
    }
    
    public void ConsultarStock() {
        System.out.println("Los vehiculos en STOCK son los siguientes: ");
        int i = 0;
        for(Vehiculo v : vehiculos) {
            i ++;
            System.out.println("\n" + i +") "+ v.toStringTodo());
        }
        
    }
    
    
    
}
