public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(this.title + " is a " + instanceType + " film");

    }

    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {   //this can be considered as factory design pattern
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}

//    public static Movie getMovie(String type, String title) {
//        char typeChar = type.toUpperCase().charAt(0);
//        switch (typeChar) {
//            case 'A':
//                return new Adventure(title);
//            case 'C':
//                return new Comedy(title);
//            case 'S':
//                return new ScienceFiction(title);
//            default:
//                return new Movie(title);
//        }




