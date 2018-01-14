class WelcomeToBank {
    WelcomeToBank(){
        System.out.println("Welcome to ABC bank.");
    }
}

class AccountDetails{
    private int accountNumber = 12345678;

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean accountNumberValidity(int newAccountNumber){
        if(newAccountNumber == getAccountNumber())
            return true;
        else
            return false;
    }
}

class SecurityCode{
    private int codeNumber = 1234;

    public int getCodeNumber() {
        return codeNumber;
    }

    public boolean codeNumberValidity(int newCodeNumber){
        if(newCodeNumber == getCodeNumber())
            return true;
        else
            return false;
    }
}

class FundsCheck{
    private int fund = 1000;

    public int getFund(){
        return fund;
    }

    public void increaseFund(int amount){
        fund += amount;
    }

    public void decreaseFund(int amount){
        fund -= amount;
    }

    public boolean withdraw(int amount){
        if (getFund() > amount){
            return true;
        }
        else{
            return false;
        }
    }
}

class BankingApp{
    private int accountNumber;
    private int securityCodeNumber;

    AccountDetails accountDetails;
    FundsCheck fundsCheck;
    WelcomeToBank welcomeToBank;
    SecurityCode securityCode;

    BankingApp(int newAccountNumber, int newSecurityCodeNumber) {
        accountNumber = newAccountNumber;
        securityCodeNumber = newSecurityCodeNumber;

        welcomeToBank = new WelcomeToBank();

        accountDetails = new AccountDetails();
        securityCode = new SecurityCode();
        fundsCheck = new FundsCheck();
    }
    public void withdrawCash(int amount){
        if((accountDetails.accountNumberValidity(accountNumber))&&(securityCode.codeNumberValidity(securityCodeNumber))&&(fundsCheck.withdraw(amount))){
            fundsCheck.decreaseFund(amount);
            System.out.println("Current balance is "+fundsCheck.getFund());
        }

        else {
            System.out.println("Insufficient funds or wrong credentials!");
            System.out.println("Current balance is " + fundsCheck.getFund());
        }
    }

    public void depositCash(int amount) {
        if (accountDetails.accountNumberValidity(accountNumber) && (securityCode.codeNumberValidity(securityCodeNumber))) {
            fundsCheck.increaseFund(amount);
            System.out.println("Current balance is " + fundsCheck.getFund());
        }
        else
            System.out.println("Wrong credentials");
    }

}
