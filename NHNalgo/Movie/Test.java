public class Test {

    public static void main(String[] args){
        Movie oppi = new Movie();
        oppi.script = 10;
        oppi.acting = 9;
        oppi.direction = 10;

        System.out.println("Oppi : " +oppi.rating());

        Movie con = new Movie();
        con.script = 10;
        con.acting = 9;
        con.direction = 8;

        System.out.println("Con : " + con.rating());


       // System.out.println();

        Movie movie = new Movie();

       // movie.movieRating(10,2,4);

        System.out.println("movieRating : " + movie.movieRating(10,2,4));
        
    }
}
