package Unit_3.exercise;

import java.util.Scanner;
import javax.swing.*;

// 3-1, 3-2
public class Book {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printBook(){
        System.out.println("제목 : " + this.title);
        System.out.println("저자 : " + this.author);
    }

    public void printBookPrice(){
        System.out.println("제목 : " + this.title + ", 저자 : " + this.author + ", 가격 : " + price);
    }

    public void windowBook(){
        String windowMessage = "title : " + title + ", author : " + author;
        JOptionPane.showMessageDialog(null, windowMessage);
    }

    public static Book keyboardInput(Scanner sc){
       // Scanner sc = new Scanner(System.in);
        System.out.println("책 제목을 입력하세요. ");
        String title = sc.next();
        System.out.println("책 저자를 입력하세요. ");
        String author = sc.next();

        return new Book(title, author);
    }

   public String getTitle(){
        return this.title;
   }

   public String getAuthor(){
        return this.author;
   }

   public void setAuthor(String author){
        this.author = author;
   }

   public int getPrice(){
        return this.price;
   }

    public void setPrice(int price) {
        this.price = price;
    }

}
