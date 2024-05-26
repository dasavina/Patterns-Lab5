package Part1;
class User {
    private String username;
    private String email;
    private String password;
    private String address;

    public User(String username, String email, String password, String address) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public boolean isAdmin() {
        return username.contains("admin");
    }
}
