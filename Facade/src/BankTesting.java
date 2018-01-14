public class BankTesting {
    public static void main(String[] args) {
        BankingApp bankingApp = new BankingApp(12345678, 1234);

       bankingApp.withdrawCash(1200);
       bankingApp.depositCash(2000);
        bankingApp.withdrawCash(200);

    }
}
