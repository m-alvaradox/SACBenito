
package benito.operaciones;

import java.util.Scanner;

public class Validacion {
    
    public int Validacion(int entre, int hasta ) {
        Scanner input = new Scanner(System.in);
        boolean validacion = false;
        int opcion = 0; 
        while(validacion == false) {
            System.out.print("Entrada: ");
            opcion = input.nextInt();
            
            if(opcion >=entre && opcion <=hasta) {
                validacion = true;
            }
            else {
                System.out.println("Estimado usuario, su entrada es incorrecta, "
                        + "vuelva a intentar :(");
            }
        }
        return opcion;  
    }
    
}
