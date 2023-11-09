package min.chapter3.exercise;

public class Main7 {
    public static void main(String[] args) {
        boolean[] used;

        int count = 0;
        used = new boolean[365];

        while(true){
            int birthday = (int)(Math.random() * 365);
            count++;

            System.out.printf("%d 번 사람이 가진 생일은 %d\n", count, birthday);

            if(used[birthday])
                break;

            used[birthday] = true;
        }

        System.out.println();
        System.out.println("중복된 생일이 다음 " +count+ "번 시도 이후 발견됨. ");

    }
}
