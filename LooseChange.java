public class LooseChange {

	private int balance;

	public LooseChange(){
		balance = 0;
	}

	public void addTo(int amount){
		balance= balance+amount;
	}
	public void empty(){
		balance=0;
	}
	public int getBalance(){

	    return this.balance;
	}

	}

	/*Add some methods here*/
	// This is how my brother always cheated -- snitching money from the
	// loose change.   I'm not bitter.

