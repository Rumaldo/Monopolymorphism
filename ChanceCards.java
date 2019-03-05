public abstract class ChanceCards {
    protected String name;
    public ChanceCards(String n){
        name = n;
    }
    @Override
    public String toString() {
        return name;
    }

    public abstract void action(Player P,PropertySquare PS) throws BankruptException;{

    }
}
