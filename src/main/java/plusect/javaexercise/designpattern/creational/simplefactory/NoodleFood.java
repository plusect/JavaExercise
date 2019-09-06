package plusect.javaexercise.designpattern.creational.simplefactory;


public class NoodleFood extends Food {
    private String salt;
    private String noodle;

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getNoodle() {
        return noodle;
    }

    public void setNoodle(String noodle) {
        this.noodle = noodle;
    }
}
