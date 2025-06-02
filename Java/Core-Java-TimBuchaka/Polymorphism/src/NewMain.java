public class NewMain {
    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A","JAWS");
        movie.watchMovie();

        Adventure jaws = (Adventure)Movie.getMovie("C","JAWS"); // HERE WE WILL GET EXCEPTION AT RUN-TIME
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C","Aeroplanee");
        /// comedy.watchMovie(); // this will give error
        Movie watchComedy = (Movie) comedy;  // here we are casting comedy Object to Movie
        watchComedy.watchMovie();

        var Airplane = Movie.getMovie("C","Ship");

    }
}
