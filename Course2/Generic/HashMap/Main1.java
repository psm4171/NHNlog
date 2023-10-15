package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId", "1234");
        map.put("asdf","1111");
        map.put("asdf", "1234");

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter ID, PW");
            System.out.print("ID : ");
            String id = sc.nextLine().trim();

            System.out.print("PW : ");
            String pw = sc.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)){
                System.out.println("존재하지 않는 ID");
                continue;
            }

            if(!(map.get(id).equals(pw))){
                System.out.println("일치하지 않는 PW, 다시 입력하세요.");
                continue;
            }else {
                System.out.println("ID와 PW가 일치합니다. ");
                break;
            }

        }
    }
}
