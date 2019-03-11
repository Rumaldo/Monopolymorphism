public class LooseChangeSquare extends MonopolySquare {
    public LooseChangeSquare(String name,int location) {
        super(name);
        this.location=location;
    }

    @Override
    public void landOn(Player P) throws BankruptException {
        P.updateLocation(this.location);
        P.receive(LC.getBalance());
        LC.empty();
    }
}
