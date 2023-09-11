//public class BankAccount {
//    static int accountNumber;
//
//    public int balance;
//    public String ownerName;
//    public int interestRate;
//
//}



//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import java.math.*;

public class BankAccount {
    public long accountNumber;
    public String ownerName;
    public BigDecimal balance;

    private static long nextAccountNumber;

    //
    // add getNumber method here.
    //
    public long getNumber(){
        return this.accountNumber;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public BigDecimal getBalance(){
        return this.balance;
    }

    public static long nextNumber(){
        return nextAccountNumber++;
    }


    //
    // add setData method here.
    //

    public void setData(long accountNumber, String ownerName, BigDecimal balance){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public BigDecimal deposit(BigDecimal amount){
        this.balance = this.balance.add(amount);
        return this.balance;
    }

/*    withDraw 메소드는 BigDecimal 파라미터를 사용하고 balance에서 주어진 금액을 공제.
    계정의 잔고 보다 많은 금액이 출금되면 안되므로, 인출이 가능한지 여부를 먼저 체크하고,
    인출이 성공했는지 여부를 나 타내는 boolean 값을 반환

   */

    public boolean withDraw(BigDecimal amount){
        if(amount.compareTo(this.balance) == 1 || amount.compareTo(this.balance) == 0) {
            return false;
        }
        else {
            balance = balance.subtract(amount);
            return true;
        }
    }

}

