public class PropertySquare extends MonopolySquare {
    private int cost;
    private boolean hasBooth;
    public boolean isMonopoly;
    private Player owner;
    private String color;

    public PropertySquare(int location,String name, String color, int cost) {
        super(name);
        this.location = location;
        isMonopoly = false;
        hasBooth = false;
        this.color = color;
        this.cost = cost;


    }
    public String getColor(){
        return this.color;
    }
    public Player getOwner(){
        return this.owner;
    }
    @Override
    public void landOn(Player P) throws BankruptException {
        P.updateLocation(this.location);
        if (hasBooth == false) {
            P.pay(cost);
            P.useBooth();
            this.hasBooth = true;
            this.owner = P;
            for (int i = 0; i < P.hand.size(); i++) {
                if (P.hand.get(i).color == this.color) {
                    this.isMonopoly = true;
                    this.cost *= 2;
                }
            }
            P.hand.add(this);

        } else {
            if (this.owner != P) {
                P.pay(cost);
                this.owner.receive(cost);
            }

        }

    if(P.getBalance()<0){
        throw new BankruptException("You are Bankrupt!");
    }
    }
}
