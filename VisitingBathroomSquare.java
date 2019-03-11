public class VisitingBathroomSquare extends MonopolySquare {
    public VisitingBathroomSquare(String name,int location) {
        super(name);
        this.location=location;
    }

    @Override
    public void landOn(Player P) throws BankruptException {
        P.updateLocation(this.location);
    }
}