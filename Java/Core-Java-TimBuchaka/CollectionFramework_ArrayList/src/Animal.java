import java.util.ArrayList;

public class Animal {
    String name;
    String species;
    int age;
    ArrayList<String> color;

    public Animal(int age, ArrayList<String> color, String name, String species) {
        this.age = age;
        this.color = color;
        this.name = name;
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getColor() {
        return color;
    }

    public void setColor(ArrayList<String> color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", color=" + color +
                '}';
    }
}
