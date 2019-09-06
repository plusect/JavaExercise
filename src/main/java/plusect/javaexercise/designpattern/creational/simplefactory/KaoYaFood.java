package plusect.javaexercise.designpattern.creational.simplefactory;

public class KaoYaFood extends Food {
    private String Duck;
    private String spicy;
    private String salt;

    public String getDuck() {
        return Duck;
    }

    public void setDuck(String duck) {
        Duck = duck;
    }

    public String getSpicy() {
        return spicy;
    }

    public void setSpicy(String spicy) {
        this.spicy = spicy;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
