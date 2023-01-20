
package benito.usuarios;

public class Usuario {
  private String user;
  private String password;
  private String name1;
  private String name2;
  private String lastname1;
  private String lastname2;
  
  public Usuario(String user, String password, String name1, 
                 String name2, String lastname1, String lastname2){
      this.user = user;
      this.password = password; 
      this.name1 = name1;
      this.name2 = name2;
      this.lastname1 = lastname1;
      this.lastname2 = lastname2;
  
  }
   
    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getName1() {
        return name1;
    }

    public String getLastname1() {
        return lastname1;
    }
    
    
  
  
}
