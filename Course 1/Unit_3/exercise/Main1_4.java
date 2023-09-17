package Unit_3.exercise;

import java.util.Scanner;

public class Main1_4 {
    public static void main(String[] args) {

        // 3-1, 3-2 Book 클래스 및 메서드 생성
        // 3-3, 3-4 MessageText 클래스 및 메서드 생성
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 책의 정보를 입력하세요 : ");

        String firstBookTitle = sc.next();
        String firstBookAuthor = sc.next();

        Book firstBook = new Book(firstBookTitle, firstBookAuthor);

        System.out.print("두 번째 책의 정보를 입력하세요 : ");

        String secondBookTitle = sc.next();
        String secondBookAuthor = sc.next();

        Book secondBook = new Book(secondBookTitle, secondBookAuthor);

        firstBook.printBook();
        secondBook.printBook();

        System.out.println("첫 번째 책의 가격을 입력하세요 : ");

        int price = sc.nextInt();

        firstBook.setPrice(price);

        System.out.println("가격을 포함하여 첫 번째 책의 정보를 출력합니다. ");

        firstBook.printBookPrice();

        // 3-6
        Book book = Book.keyboardInput(sc);

        book.printBook();

        MessageText messageText = MessageText.keyboardInput(sc);

        messageText.printMessageText();

        book.windowBook();

    }
}


