
package benito.usuarios;

import java.util.ArrayList;

public class Supervisor extends Usuario {
  private ArrayList<String> certificadosac;

  public Supervisor(String user, String password, String name1, String name2, 
                    String lastname1, String lastname2, ArrayList<String> certificadosac) {
    super(user,password,name1,name2,lastname1,lastname2);
    this.certificadosac = certificadosac;
  }
  
}
