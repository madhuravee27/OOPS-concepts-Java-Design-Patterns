class FamilyMember {
    Balance b; //>> Fill in the blank
    String name;
    public FamilyMember (String name) {
        this.name = name;
        b = Balance.getInstance(); //>> Fill in the blank
    }

    public void withdraw (int val) {b.withdraw(val); //>> Fill in the blank
    }
    public void deposit (int val) {
        b.deposit(val); //>> Fill in the blank
    }
    public int getBalance() {
        return b.getBalance(); //>> Fill in the blank
    }


}