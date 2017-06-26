package Generics;

/**
 * Created by vdabcursist on 23/06/2017.
 */
public class Cat implements Comparable<Cat>{
    private String name;
    private int lives;

    public Cat(String name, int lives) {
        this.name = name;
        this.lives = lives;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;

        Cat cat = (Cat) o;

        if (lives != cat.lives) return false;
        return name != null ? name.equals(cat.name) : cat.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + lives;
        return result;
    }

    @Override
    public String toString() {
        return "cat{"+"name=" + name + '\''+lives + "}";
    }

    @Override
    public int compareTo(Cat o) {
        Cat that = (Cat)o;
        return this.lives-that.getLives();
    }
}




