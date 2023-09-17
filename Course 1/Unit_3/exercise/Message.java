package Unit_3.exercise;
public class Message {
    private String toNumber; // 전화할 번호
    private String sentNumber; // 발신자 번호
    private MessageText messageText;

    public Message(MessageText messageText, String toNumber, String sentNumber) {
        this.messageText = messageText;
        this.toNumber = toNumber;
        this.sentNumber = sentNumber;
    }

    public Message(MessageText messageText, String sentNumber){
        this.messageText = messageText;
        this.sentNumber = sentNumber;
    }

    public Message(MessageText messageText){
        this.messageText = messageText;
    }

    public void setUpdate(String newNumber){
        toNumber = newNumber; // 메시지의 전화번호를 업데이트
    }

   public void printMessage(){
       System.out.println("메시지를 출력합니다. ");
       System.out.println(messageText);
       System.out.println("받는 사람의 전화번호 :  "+ toNumber + ", 보내는 사람의 전화번호 : " + sentNumber);
   }
}
