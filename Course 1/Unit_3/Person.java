package Unit_3;

public class Person {
   private String name;
   private String residence;

   private int value; // 인스턴스 변수

   public String getName(){
       return this.name;
   }

   public String getResidence(){
       return this.residence;
   }

   public void setResidence(String newResidence){
       this.residence = newResidence;
   }

    public void setValue(int value) {
        // 인스턴스 변수 'value'와 동일한 이름의 지역 변수 'value'를 생성
        this.value = value; // 'this'를 사용하여 인스턴스 변수를 참조
    }

    public void printValue() {
        int value = 42; // 동일한 이름의 지역 변수 생성
        System.out.println("지역 변수 value: " + value); // 지역 변수 출력
        System.out.println("인스턴스 변수 value: " + this.value); // 'this'를 사용하여 인스턴스 변수 출력
    }

    public Person(String n){
       name = n;
       residence = null;
    }

    public static void main(String[] args){
        Person p1 = new Person("철수");
        //Person p2 = new Person("영희", "서울");
        p1.setResidence("Roma");

        System.out.println(p1.getResidence());

        System.out.println(p1.getName());

        p1.setValue(10);
        p1.printValue();

    }

}
