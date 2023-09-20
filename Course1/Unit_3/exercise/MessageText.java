package Unit_3.exercise;

import java.util.Scanner;

// 3-3
public class MessageText {

    private String code;
    private String text;

    public MessageText(String code, String text){
        this.code = code;
        this.text = text;
    }

    public static MessageText keyboardInput(Scanner sc){
        System.out.println("받는 사람의 이름과 메시지를 입력하세요. ");
        String code = sc.nextLine();
        String text = sc.nextLine();

        return new MessageText(code, text);
    }

    public void printMessageText(){
        System.out.println("이름 : " + getCode());
        System.out.println("메시지 : " + getText());
    }


    public String getCode(){
        return this.code;
    }


    public String getText(){
        return this.text;
    }

    @Override
    public String toString() {
        return "받는 사람 : '" + code + '\'' +
                ", 메세지 : '" + text + '\'';
    }
}
