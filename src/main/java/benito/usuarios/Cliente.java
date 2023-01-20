
package benito.usuarios;


public class Cliente extends Usuario {
    private String id;
    private String ocupacion;
    private double ingreso;


    public Cliente(String user, String password, String name1, 
                 String name2, String lastname1, String lastname2, 
                 String id, String ocupacion, double ingreso) {
        super(user,password,name1,name2,lastname1,lastname2);
        this.id = id;
        this.ocupacion = ocupacion;
        this.ingreso = ingreso;
    }
    
    
}
