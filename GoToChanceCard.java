public class GoToChanceCard extends ChanceCards {
    public GoToChanceCard(String name){
        super(name);
    }

    @Override
    public void action(Player P,PropertySquare PS) throws BankruptException {
        int oldLocation= P.getLocation();
        PS.landOn(P);
        if(P.getLocation()<oldLocation)
            P.receive(2);


    }
}
