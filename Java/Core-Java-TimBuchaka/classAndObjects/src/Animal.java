public class Animal {
    public String name;
    public String species;
    public int age;
    public int weight;
    public String color;

    public Animal(int age, String color, String name, String species, int weight) {
        this.age = age;
        this.color = color;
        this.name = name;
        this.species = species;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
