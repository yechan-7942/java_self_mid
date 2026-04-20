package PS.J031.model;

public class Information {
    private String userid;
    private String password;
    private String name;

    public Information(String userid, String password, String name) {
        this.userid = userid;
        this.password = password;
        this.name = name;
    }

    public boolean check(){
        return password.length() >=3;
    }
    public String getPassword() {
        return password.substring(0,2) + "*".repeat(password.length()-2);
    }

    public void print(){
        System.out.println("Userid: " + userid);
        System.out.println("Password: " + password);
        System.out.println("Name: " + name);
    }




}
