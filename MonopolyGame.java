import java.util.Random;

public class MonopolyGame {
	private MonopolySquare[] board;
	private Random dice;
	private LooseChange lc;
	private ChanceDeck chanceCardDeck;


    public void play(){
    board[0]= new GoSquare("GoSquare",0);
    board[1]= new ChanceSquare("? Square",1);
    board[2]= new PropertySquare(2,"Mediterranean Avenue","Purple",1);
    board[3]= new PropertySquare(3,"Baltic Avenue","Purple",1);
    board[4]= new ChanceSquare("? Square",4);
    board[5] = new RailRoadSquare("Reading Railroad",5);
    board[6] = new PropertySquare(6,"Oriental Avenue","White",2);
    board[7] = new PropertySquare(7,"Vermont Avenue","White",2);
    board[8] = new WaterFireSquare("Fire Works Show",8);
    board[9] = new ChanceSquare("? Square",9);
    board[10] = new VisitingBathroomSquare("Visiting Bathroom",10);
    board[11] = new PropertySquare(11,"St. Charles Place","Magenta",2);
    board[12] = new PropertySquare(12,"States Avenue","Magenta",2);
    board[13] = new RailRoadSquare("Pennsylvania Railroad",13);
    board[14] = new PropertySquare(14,"St. James Place","Orange",3);
    board[15] = new PropertySquare(15,"New York Avenue","Orange",3);
    board[16] = new LooseChangeSquare("Rich Uncle Pennybags loose Change",16);
    board[17] = new ChanceSquare("? Square",17);
    board[18] = new PropertySquare(18,"Indiana Avenue","Red",3);
    board[19] = new PropertySquare(19,"Illinois Avenue","Red",3);
    board[20] = new ChanceSquare("? Square",20);
    board[21] = new RailRoadSquare("B. & O. Railroad",21);
    board[22] = new PropertySquare(22,"Atlantic Avenue","Yellow",4);
    board[23] = new PropertySquare(23,"Marvin Gardens","Yellow",4);
    board[24] = new WaterFireSquare("Water Show",24);
    board[25] = new ChanceSquare("? Square",25);
    board[26] = new GoToBathroomSquare("Go to the Bathroom",26);
    board[27] = new PropertySquare(27,"Pacific Avenue","Green",4);
    board[28] = new PropertySquare(28,"Pennsylvania Avenue","Green",4);
    board[29] = new RailRoadSquare("Short Line",29);
    board[30] = new PropertySquare(30,"Park Place","Blue",5);
    board[31] = new PropertySquare(31,"BoardWalk","Blue",5);
    }
}
