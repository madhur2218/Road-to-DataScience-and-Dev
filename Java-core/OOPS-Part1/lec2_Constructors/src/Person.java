public class Person {
    private String name;
    private int age;
    private int rollNo;
    private boolean isAlive;


   public Person(){
       this("madhur",24);
       System.out.println("no args constructor called");
   }

   public Person(String name, int age){
       this(name,age,123,false);
       System.out.println("Constructor with 2 args called");
   }

    public Person(String name, int age, int rollNo, boolean isAlive) {
        System.out.println("all args constructor called");
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
