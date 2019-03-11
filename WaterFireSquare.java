public class WaterFireSquare extends MonopolySquare {
    int cost=2;
    public WaterFireSquare(String name,int location) {
        super(name);
        this.location=location;
    }

    @Override
    public void landOn(Player P) throws BankruptException {
        P.updateLocation(this.location);
        P.pay(cost);
        L.addTo(cost);
    }
}
