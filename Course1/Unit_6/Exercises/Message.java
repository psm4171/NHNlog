package Exercises;

public class Message {
    private String sender;
    private String receiver;
    private String text;

    public Message(String sender, String receiver, String text){
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
    }

    public String getSender(){
        return this.sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return this.receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void swap(){
        String tmp = sender;
        sender = receiver;
        receiver = tmp;
    }

    public void eliminationBlank(){
        text = text.trim().replaceAll("\\s+", " ");
    }

    private static boolean isVowel(char ch) {
            char lowerCh = Character.toLowerCase(ch);
            return lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u';
    }

    public static String removeVowels(String input) {
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (!isVowel(ch)) {
                result.append(ch);
            }
        }

        return result.toString();
    }


    @Override
    public String toString() {
        return "Sender : " + sender + " / Receiver : " + receiver + " / Text : " + text;
    }

}
