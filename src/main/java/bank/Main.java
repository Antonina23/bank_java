package bank;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Nicole", 100);

        acc.printBalance();

        acc.deposit(100.00);
        acc.printBalance();

        acc.withdraw(50.00);
        acc.printBalance();
    }
}
