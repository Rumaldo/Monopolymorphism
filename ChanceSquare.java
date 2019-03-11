public class ChanceSquare extends MonopolySquare {
    public ChanceSquare(String name, int location) {
        super(name);
        this.location = location;
    }

    @Override
    public void landOn(Player P) throws BankruptException {
        P.updateLocation(this.location);
    }
}