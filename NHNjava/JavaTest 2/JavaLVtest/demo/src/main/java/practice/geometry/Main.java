package practice.geometry;

import java.util.Scanner;
import main.java.practice.geometry.cubeSurfaceArea;
import main.java.practice.geometry.BoxSurfaceArea;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double area1 =0.0;

        double n, a, b, c;

        n = sc.nextDouble();

        cubeSurfaceArea cs = new cubeSurfaceArea(n);

        System.out.println("정육면체(Cube) 겉넓이 : " + cs.getCubeArea());

        System.out.println("정사각형(Square) 넓이 : " + cs.getSquare());

        a = sc.nextDouble();
        b = sc.nextDouble();

        cubeSurfaceArea cs1 = new cubeSurfaceArea(a, b);

        System.out.println("직사각형(Rectangle) 넓이 : " + cs1.getRectangle());


        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        cubeSurfaceArea cs2 = new cubeSurfaceArea(a, b, c);
    

        System.out.println("직육면체의(Box) 겉넓이 : " + cs2.getBox());

    }
}