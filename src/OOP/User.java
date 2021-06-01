package OOP;

public class User {
    public int id;
    public String username;
    private String password;
    public String email;
    private boolean isLoggedIn = false;

    public User() {};

    public String getPassword() {
        return password;
    }
    public String setPassword(String password) {
       return this.password = password;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }


    public void descibeUser() {
        System.out.println("Username: " + this.username);
        System.out.println("Password: " + this.password);
        System.out.println("Email: " + this.email);
    }

    public static void main(String[] args) {
        User testUser = new User();
        testUser.id = 1;
        testUser.username = "jperez";
        testUser.password = "password123";
        testUser.email = "jperez4432@gmail.com";

        System.out.println("Username: " + testUser.username);
        System.out.println("Password: " + testUser.password);
        System.out.println("Email: " + testUser.email);

User user2 = new User("codeup-dude", "gocodeup", "codeup@email.com");

        System.out.println("Username" + user2.username);
        System.out.println("Password" + user2.password);
        System.out.println("Email" + user2.email);

    }
}
