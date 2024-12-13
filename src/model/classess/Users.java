package model.classess;

public class Users {
    private int id_Users;
    private String name;
    private String email;
    private String password;

    public Users(int id_Users, String name, String email, String password) {
        this.id_Users = id_Users;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Users () {
        
    }
    
    public int getId_Users() {
        return id_Users;
    }
    public void setId_Users(int id_Users) {
        this.id_Users = id_Users;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
