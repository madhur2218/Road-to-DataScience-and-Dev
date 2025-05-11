

//This is challenge problem
public class Customer {
    private String name;
    private double credentials;
    private String email;

    public Customer(){
        this("nobody","nobody@nobody.com");
        System.out.println("this is non parametrised constructor");
    }

    public Customer(String name, String email){
        this(name,12.312d,email);
        System.out.println("Constructor with 3 parameters passed");
    }

    public Customer(String name, double credentials, String email) {
        System.out.println("this is parametrised constructor");
        this.name = name;
        this.credentials = credentials;
        this.email = email;
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

    public double getCredentials() {
        return credentials;
    }

    public void setCredentials(double credentials) {
        this.credentials = credentials;
    }
}
