public class Movie {
    static int script; // 클래스 변수
    int acting; // 인스턴스(멤버) 변수  --> static과는 별개
    int direction;

    public static int movieRating(int s, int a, int d){
        // Movie.movieRating(), 객체가 아닌 클래스 이름으로 사용,

        return s + a +d;
    }

    public Movie(){

    }

     int rating(){
        //static int rating(), return script + acting + direction; // 메서드에서 정적변수와 인스턴스(멤버) 변수는 별개
         return script + acting + direction;
    }

}
