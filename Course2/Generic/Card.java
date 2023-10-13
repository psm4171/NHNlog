public class Card {
    private int suit;
    private int value;

    public Card(int suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public boolean equalsObj(Object obj){

        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Card other = (Card) obj;
        if(suit == other.suit && value == other.value) {
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        Card card1 = new Card(2, 10);
        Card card2 = new Card(4, 10);

        boolean equalCheck  = card1.equalsObj(card2);

        System.out.println(equalCheck);
    }
}
