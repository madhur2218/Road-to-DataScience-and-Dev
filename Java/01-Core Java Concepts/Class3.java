class Dog{
    String name; 
    String breed; 
    String color;
    int age;
    
    
    
    public Dog( String name,String breed , String color, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
    
    public String getName() { return name; }
 
    // method 2
    public String getBreed() { return breed; }
 
    // method 3
    public int getAge() { return age; }
 
    // method 4
    public String getColor() { return color; }

}


public class Class3 {
    public static void main(String[] args) {
        
        Dog d1 = new Dog("hello", "hi", " hello ", 12) ;
        System.out.println(d1.getAge());


    }
}
