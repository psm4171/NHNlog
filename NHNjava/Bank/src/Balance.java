public class Balance {
    private int balance;

    public Balance(int balance){
        this.balance = balance;
    }

    public int add(int b1, int b2){
        return b1 + b2;
    }

    public int getBalance(){
        return balance;
    }

    public Balance add(Balance value){
        return new Balance(this.balance + value.getBalance());
    }

    public int compareTo(Balance value){
        return this.balance - value.getBalance();
    }


}
