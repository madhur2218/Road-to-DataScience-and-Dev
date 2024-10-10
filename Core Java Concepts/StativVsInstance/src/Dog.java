public class Dog {
    private  static String name;
    private String surName;
    private int a;
    private int b;


//    public Dog(String name) {
//        this.name = name;
//    }
    public  String getName() {
        return name;
    }

    public  void setName(String name) {
        Dog.name = name;
    }

    public  String getsurName() {
        return surName;
    }

    public void setsurName(String surName) {
        this.surName = surName;
    }

}
