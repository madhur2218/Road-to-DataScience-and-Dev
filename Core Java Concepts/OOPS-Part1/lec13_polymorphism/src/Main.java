import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Movie theMovie = new Adventure("Star wars");
//        theMovie.watchMovie();
//
//        Movie themovie = Movie.getMovie("Science","Star wars");
//        themovie.watchMovie();

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter (A for Adventure, C for Comedy, S for science fiction and Q to quit)");
            String type = sc.nextLine();

            if("Qq".contains(type)){
                System.out.println("Quitting");
                break;
            }

            System.out.println("Enter movie title");
            String title = sc.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();
        }


    }
}