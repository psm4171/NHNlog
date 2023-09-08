package main.java.practice.geometry;

public class cubeSurfaceArea {

    private static double n;
    static double area1 = 0.0;

    private static double area_box = 0.0;

    private static double a;
    private static double b;
    private static double c;


    public cubeSurfaceArea(double n){
        this.n = n;
    }

    public cubeSurfaceArea(double a, double b ){
        this.a = a;
        this.b = b;
       
    }

     public cubeSurfaceArea(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
       
    }

    public static double cube(double n){
         if(n <0) throw new IllegalArgumentException("양수 입력");
         return n * n * 6;
    }

    public static double getCubeArea(){
        area1 = n * n * 6;
        return area1;
    }

       public static double box(double a, double b, double c){
        if(a <0) throw new IllegalArgumentException("양수 입력");
        return 2 * a * b + 2 * a * c + 2 * c * b;
    }


     public static double getBox(){
        area_box = 2 * a * b + 2 * a * c + 2 * c * b;
        return area_box;
    }


    public static double square(double n){
        if(n <0) throw new IllegalArgumentException("양수 입력");
        return n * n;
    }

    public static double getSquare(){
        return n * n;
    }


    public static double rectangle(double a, double b){
        if(a < 0) throw new IllegalArgumentException("양수 입력");
        else if(b < 0) throw new IllegalArgumentException("양수 입력");

        return a * b;
    }

     public static double getRectangle(){
        return a * b;
    }

}