
package benito.usuarios;

public class Vendedor extends Usuario {
  private String id;

  public Vendedor(String user, String password, String name1, String name2, 
                  String lastname1, String lastname2, String id) {
    super(user,password,name1,name2,lastname1,lastname2);
    this.id = id;
  }
  
  
  
}
