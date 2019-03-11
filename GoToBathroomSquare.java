public class GoToBathroomSquare extends MonopolySquare {
    public GoToBathroomSquare(String name,int location) {
        super(name);
        this.location=location;
    }

    @Override
    public void landOn(Player P) throws BankruptException {
        P.updateLocation(10);
        P.pay(3);
        LC.addTo(3);
    }
}