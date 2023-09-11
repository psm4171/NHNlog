//public class Main {
//    public static void main(String[] args) {
//
//        BankAccount account1 = new BankAccount(); // 클래스로 접근하는
//        BankAccount.accountNumber = 103;
//        account1.balance = 100;
//        account1.ownerName = "James";
//
//        BankAccount account2 = new BankAccount();
//        BankAccount.accountNumber = 145;
//        account2.balance = 100;
//        account2.ownerName = "Petter";
//
//        BankAccount account3 = new BankAccount();
//        BankAccount.accountNumber = 99;
//        account3.balance = 100;
//        account3.ownerName = "Harry";
//
//
//        System.out.println("3의 보유금 : " + account3.balance );
//
//
//    }
//}

import java.math.BigDecimal;
import java.util.*;
public class Main {
    public static void printBankAccount(BankAccount account) {
        System.out.println("Account Number: " + account.getNumber());
        System.out.println("Owner Name: " + account.getOwnerName());
        System.out.println("Balance: " + account.getBalance());
    }

    public static void main(String[] args) {
        BigDecimal b = new BigDecimal(0);
        BankAccount bankAccount = CreateAccount.createNewBankAccount(1, "Vesper Lind", new BigDecimal("0.0"));
        printBankAccount(bankAccount);
    }
}