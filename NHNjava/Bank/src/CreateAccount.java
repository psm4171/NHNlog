import java.math.BigDecimal;
import java.util.Scanner;

class CreateAccount {

    public long accountNumber;
    public String ownerName;
    public BigDecimal balance;

    private static long nextAccountNumber;

    public static BankAccount createNewBankAccount(long accountNumber, String ownerName, BigDecimal balance) {
        BankAccount newAccount = new BankAccount();
        newAccount.setData(accountNumber, ownerName, balance);

        return newAccount;
    }

    public static void printBankAccount(BankAccount account) {
        System.out.println("Account Number: " + account.getNumber());
        System.out.println("Owner Name: " + account.getOwnerName());
        System.out.println("Balance: " + account.getBalance());
    }

//    public static void TestDeposit(BankAccount var0){
//        Scanner var1 = new Scanner(System.in);
//        System.out.print("Enter amount to deposit: ");
//        BigDecimal var2 = new BigDecimal(var1.next());
//        var0.deposit(var2);
//    }

    public static void TestWithDraw(BankAccount account){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to deposit: ");
        BigDecimal amount = new BigDecimal(sc.next());
        if(!account.withDraw(amount)){
            System.out.println("Insufficient funds");
        }

    }

    public static void TestDeposit(BankAccount account) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        BigDecimal amount = new BigDecimal(scanner.next());
        account.deposit(amount);
    }


    public static void TestDeposit(BankAccount var0)

    public static void main(String[] args) {
        BankAccount bankAccount = CreateAccount.createNewBankAccount(1, "Vesper Lind", new BigDecimal("0.0"));
        printBankAccount(bankAccount);
    }


}