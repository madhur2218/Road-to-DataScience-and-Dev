import java.util.Collections;
import java.util.List;

public class Animal {
    private String name;
    private List<String> color;
    private int weight;
    private int age;
    private String species;

    public Animal(int age, List<String> color, String name, String species, int weight) {
        this.age = age;
        this.color = color;
        this.name = name;
        this.species = species;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getColor() {
        return color;
    }

    public void setColor(List<String> color) {
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", species='" + species + '\'' +
                '}';
    }
}
