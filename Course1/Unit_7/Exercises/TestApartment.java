package Exercises;

public class TestApartment {
    public static void main(String[] args) {
        Apartment apt = new Apartment(15, "Apartment");
        apt.addResident("김가나");
        apt.addResident("박다라");
        apt.addResident("오마바");

        System.out.println(apt);

        System.out.println("거주자 1명이 퇴거했습니다. ");
        apt.removeResident(1);
        System.out.println(apt);
        apt.removeResident(2);
        System.out.println(apt);
        apt.removeResident(3);

        System.out.println(apt);

    }
}
