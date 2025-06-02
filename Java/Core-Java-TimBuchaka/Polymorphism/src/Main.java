import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Movie movie = new Movie("Stars wars");
        movie.watchMovie(); // run time instance of MOVIE variable is movie class

        Movie movie_adv = new Adventure("Stars wars"); // this is possible since Adventure is a type of movie, a subclass, this is called dunamic method dispatch
        //JVM decides at Runtime, method to run depends on runtime object and not on Variable type.
        //behaviour was run-time behaviour of Adventure and not Movie
        movie.watchMovie();

        Movie movie_com = new Comedy("Charlie Chaplin");
        movie_com.watchMovie();

        Movie static_movie = Movie.getMovie("B","HERA PHERI ");
        static_movie.watchMovie();

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter movie character for Adventure, comedy and science fiction and quit");
            String type = sc.nextLine();
            if("Qq".contains(type)){
                break;
            }

            System.out.println("Enter movie title: ");
            String titleOfMovie = sc.nextLine();
            Movie moviee = Movie.getMovie(type,titleOfMovie);
            moviee.watchMovie();
            break;
        }


    }
}