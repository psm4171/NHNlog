
package Exercises;

import java.util.ArrayList;
import java.util.List;

// Exercise 7.
public class Main9 {
   // private int[] traversal;
    private Moor moor;
    private boolean found;

    private static boolean[][] visited;

    private static List<Integer> traversal; // Exercisse 10-9.

    public Main9(Moor m){
        moor = m;
       // traversal = new int[moor.getColmns()];
        traversal = new ArrayList<>();
        visited = new boolean[moor.getRows()][moor().getColmns()];
        found = traverseMoor(moor, traversal);

    }

    public Moor moor(){
        return moor;
    }

    public boolean existTraversal(){
        return found;
    }

    public List<Integer> getTraversal() {
        return traversal;
    }

    public int length(){
        if(found)
            return traversal.size();
        else
            throw new RuntimeException("Traversal : traversal does not exist");
    }

    public int step(int i){
        if(found)
            return traversal.get(i);
        else
            throw new RuntimeException("Traversal : traversal does not exist");
    }


    private static boolean traverseMoor(Moor m, List<Integer> path){
        visited = new boolean[m.getRows()][m.getColmns()];
        for(int row = 0; row < m.getRows(); row++){
            if(searchTraversal(m, row, 0, path)) return true;
        }
        return false;
    }

    private static boolean searchTraversal(Moor m, int r, int c, List<Integer> path){
        if(!m.land(r, c) || visited[r][c])
            return false;
        else {
            visited[r][c] = true;
            path.set(c, r);
            if(c == m.getColmns()-1)
                return true;
            else
                return searchTraversal(m, r-1, c+1, path) ||
                        searchTraversal(m, r, c+1, path) ||
                        searchTraversal(m, r+1, c+1, path);
        }
    }

    @Override
    public String toString() {
        if (moor != null) {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < moor.getRows(); i++) {
                for (int j = 0; j < moor.getColmns(); j++) {
                    if (j == traversal.get(i)) {
                        result.append('#'); // 육지 지역
                    } else if (moor.land(i, j)) {
                        result.append('*'); // Traversal에 속한 육지 지역
                    } else {
                        result.append('o'); // 나머지 물 지역
                    }
                }
                result.append('\n'); // 각 행의 끝에 개행 문자 추가
            }

            return result.toString();
        } else {
            return "Traversal does not exist";
        }
    }

    public static void main(String[] args) {

        int r = 4;
        int c = 4;
        double probability = 2.0;
        // 예제 Moor 지형 생성
        Moor exampleMoor = new Moor(r, c, probability);

        // Traversal 생성
        Traversal traversal = new Traversal(exampleMoor);

        // Moor 지형을 출력
        System.out.println("Moor 지형:");
        System.out.println(exampleMoor);

        // Traversal을 출력
        System.out.println("Traversal 결과:");
        System.out.println(traversal.toString());


    }
}

