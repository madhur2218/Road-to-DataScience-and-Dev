abstract  class Base {
    public Base(){
        System.out.println("i am constructor of base class");
    }

    public void sayHello(){
        System.out.println("hello");
    }

    abstract public void greet();
}
