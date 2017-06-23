package be.vdab;

public class Cat implements Comparable {

    private String name;
    private int lives;

    public Cat(String name, int lives) {
        this.name = name;
        this.lives = lives;
    }

    public String getName() {
        return name;
    }

    public int getLives() {
        return lives;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            return false;
        }
        Cat that = (Cat)obj;
        return this.name.equals(that.name) &&  // strings niet vergelijken met == maar met .equals
                this.lives == that.lives;
    }

    public int hashCode (){
        return name.hashCode() * lives;
    }

    @Override
    public int compareTo(Object o) {
        Cat that = (Cat)o;
        return this.lives = that.lives;
    }

    @Override
    public String toString() {
        return "name: " + name + " - " +
                "lives: " + lives + '\n';
    }


}
