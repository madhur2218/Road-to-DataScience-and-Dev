public class Animal {
    private String name;
    private String species;
    private int age;
    private int weight;
    private String color;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setSpecies(String species){
        this.species=species;
    }

    public String getSpecies(){
        return species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
                ", species='" + species + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
