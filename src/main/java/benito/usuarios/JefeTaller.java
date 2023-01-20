
package benito.usuarios;

import java.util.ArrayList;

public class JefeTaller extends Usuario {
  private ArrayList<String> certificadostec;

  public JefeTaller(String user, String password, String name1, String name2, 
                    String lastname1, String lastname2, ArrayList<String> certificadostec) {
    super(user,password,name1,name2,lastname1,lastname2);
    this.certificadostec = certificadostec;
  }
}
