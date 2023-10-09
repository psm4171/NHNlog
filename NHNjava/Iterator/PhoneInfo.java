import java.util.ArrayList;
import java.util.Iterator;

public class PhoneInfo {
    private String name;
    private int age;
    public PhoneInfo(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void showInfo(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }

    public static void main(String[] args) {
        ArrayList <PhoneInfo> list = new ArrayList<>();
        list.add(new PhoneInfo("홍길동", 20));
        list.add(new PhoneInfo("김소월", 22));
        list.add(new PhoneInfo("박승민", 26));

        Iterator<PhoneInfo> iterator = list.iterator();
        PhoneInfo info = null;

        System.out.println("Iterator를 사용하여 출력과 삭제를 동시 실행 ");
        while(iterator.hasNext()){
            info = iterator.next();
            info.showInfo();

            if("김소월".compareTo((info.getName())) == 0) {
                iterator.remove();
            }
        }

        System.out.println("삭제 후 출력 결과");
        iterator = list.iterator();
        while(iterator.hasNext()){
            info = iterator.next();
            info.showInfo();
        }
    }
}
