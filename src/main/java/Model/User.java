package Model;

public class User {
    protected int id;
    protected String username;
    protected String password;
    protected String userType;

    public User(String username, String password, String userType) {
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public String toString()
    {
        return username + " (" + password + ") " + userType;
    }
}