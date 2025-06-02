public class Comedy extends Movie{

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("....%s%n".repeat(3),"Something funny happens  !", "Something more funny happens !!", "Happy ending !!");
    }

    public void watchComedy(){
        System.out.println("I am watchning comedy movie !!");

    }
}
