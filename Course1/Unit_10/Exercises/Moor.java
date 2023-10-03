package Exercises;
import java.util.Random;

// Exercise 10-7.
public class Moor {
    private int rows;
    private int colmns;
    private boolean [][] moor;



    public Moor(int rows, int colmns, double probability){
        this.rows = rows;
        this.colmns = colmns;
        this.moor = new boolean[rows][colmns];
        randomMoor(probability);
    }


    private void randomMoor(double probability){
        Random ran = new Random();
        for(int r = 0; r < moor.length; r++){
            for(int c = 0; c < moor[0].length; c++){
                moor[r][c] = ran.nextDouble() < probability;
            }
        }
    }


    public int getRows() {
        return moor.length;
    }

    public int getColmns() {
        return moor[0].length;
    }

    public boolean land(int r, int c){
        return (r >= 0) && (r < moor.length) && (c >= 0) && (c < moor[0].length) && moor[r][c];
    }


    public String toString(){
        String res = "";
        for(int r = 0; r < moor.length; r++){
            for(int c = 0; c < moor[0].length; c++){
                res = res + (moor[r][c] ? "*" : "o");
            }
            res = res + '\n';
        }
        return res;
    }

}

