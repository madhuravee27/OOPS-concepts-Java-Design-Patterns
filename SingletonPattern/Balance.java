class Balance {

	private static Balance firstInstance = null; //>>Fill in the Keywords
 	private int balance;
	
 	public static setBalance { //>> Fill in the header for the missing routine
 		this.balance = balance;
 	}

 	public static Balance getInstance (){
		if (firstInstance == null) { //>> Fill in the condition
  			firstInstance = new Balance(10000);
  		}
  		return firstInstance;
  	}

  	public void withdraw (int amount){
	  if (balance>amount)
		balance -= amount;
  	  else
  		System.out.println("Insufficient balance");
  	}

  	public void deposit (int amount){
		balance += amount;
  	}

  	public int getBalance (){
		return balance;
  	}
}
