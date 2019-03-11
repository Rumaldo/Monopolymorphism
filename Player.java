import java.util.ArrayList;

public class Player {
	private int bankAccount;
	private String name;
	private boolean isTurn;
	private int location;
	private  int booths;
	ArrayList<PropertySquare> hand;

	public Player(String n){
		name = n;
		bankAccount = 31;
		booths=12;
	}
	public int getBalance(){
		return bankAccount;
	}
	public void useBooth(){
		booths-=1;
	}
	public void addBooth(){
		booths+=1;
	}

	public void pay(int amount){
		bankAccount=bankAccount-amount;

	}
	public void receive(int amount){
		bankAccount=bankAccount+amount;
	}
	public int getLocation(){
		return this.location;
	}
	public void updateLocation(int location) {
		int oldLocation = this.location;
		this.location = location;
		if (oldLocation >= 27) {
			if (this.location <= 5) {
				this.bankAccount += 2;
			}
		}


	}
	/* you will add several methods to this class as needed.*/

	/* Whenever you adjust the location, don't forget to check
	to see if you passed "Go".   The instructions explicitly said
	that this was the responsiblity of the player, so this
	functionality belongs here.

	(unless you are told to go "directly" to location, i.e. jail/restroom)
	 */
}
