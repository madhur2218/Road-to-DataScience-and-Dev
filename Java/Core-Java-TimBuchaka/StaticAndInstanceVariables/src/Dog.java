public class Dog {
    private static String name;
    private String age;

    public Dog(String name) {
        Dog.name = name;
    }

    public void description(){
        System.out.println("name is "+ Dog.name);
    }
}
