public class Adventure extends Movie{

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("....%s%n".repeat(3),"Pleasant scene !", "Pleasant music !","Something bad happens !!");
    }

    public void watchAdventure(){
        System.out.println("I am watchning adventure movie !!");

    }
}
