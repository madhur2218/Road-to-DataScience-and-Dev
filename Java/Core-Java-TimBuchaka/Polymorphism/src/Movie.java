public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    //This kind of method is called factory method which returns instances
    //Factory helps to obtain an object whithout having to know the details without having to create an object
    public static Movie getMovie(String type, String title) {
        char key = Character.toUpperCase(type.charAt(0));
        return switch (key) {
            case 'A' -> new Adventure(title);
            case 'B' -> new Comedy(title);
            case 'C' -> new ScienceFiction(title);
            default  -> new Movie(title);
        };
    }

    public void watchMovie(){
        String instanceType = this.getClass().getName();
        System.out.println(title + " is a "+ instanceType + " type film !");
    }




}
