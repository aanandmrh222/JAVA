class Account {
    public String name;
    protected String email;
    private String password;

    // Getters and Setters
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class AK_46_GetterSetter {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.name = "XYZ";
        acc.email = "xyz@gmail.com";
        acc.setPassword("XYZ123");

        System.out.println(acc.getPassword());
    }
}
