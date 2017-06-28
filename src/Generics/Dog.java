package Generics;

/**
 * Created by vdabcursist on 23/06/2017.
 */
public class Dog {
    private String name;
    private String thricks;

    public Dog(String name, String thricks) {
        this.name = name;
        this.thricks = thricks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThricks() {
        return thricks;
    }

    public void setThricks(String thricks) {
        this.thricks = thricks;
    }
}
