package Unit_3.exercise;

import java.util.Scanner;
public class Main7_8 {
    public static void main(String[] args){

        // 3-7 : TextBooks, University of Bolzano, Novles 클래스 및 메서드 생성
        // 3-8
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 책의 제목을 입력하세요.");
        String firstBookTitle = sc.nextLine();

        System.out.println("첫 번째 책의 저자를 입력하세요.");
        String firstBookAuthor = sc.nextLine();

        System.out.println("첫 번째 책의 교과목을 입력하세요.");
        String firstBookCourse = sc.nextLine();

        System.out.println("첫 번째 책의 해당 학부를 입력하세요.");
        String firstBookFaculty = sc.nextLine();

        FUBTextbook fubTextbook = new FUBTextbook(firstBookTitle, firstBookAuthor, firstBookCourse, firstBookFaculty);

        fubTextbook.printBook();

        System.out.println("두 번째 책의 제목을 입력하세요.");
        String secondBookTitle = sc.nextLine();

        System.out.println("두 번째 책의 저자를 입력하세요.");
        String secondBookAuthor = sc.nextLine();

        Book secondBook = new Book(secondBookTitle, secondBookAuthor);

        System.out.println("두 번째 책의 주제를 입력하세요. ");
        String type = sc.nextLine();

        Novels novles = new Novels(secondBook.getTitle(), secondBook.getAuthor(), type);

        secondBook.printBook();
        novles.printBook();

        System.out.println("첫 번째 책의 가격을 입력하세요 : ");

        int price = sc.nextInt();

        fubTextbook.setPrice(price);

        System.out.println("가격을 포함하여 첫 번째 책의 정보를 출력합니다. ");

        fubTextbook.printBookPrice();


    }
}
