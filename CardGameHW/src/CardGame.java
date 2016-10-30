import java.util.*;


public class CardGame {
    public static void main(String[] args){

    	firstCustomMethod(args);
    	
    	
    }
       
    public static void firstCustomMethod(String[] args){
    	Scanner input = new Scanner(System.in);
    	
    	int thisVariable = 0;
    	
    while (thisVariable<1){
    	System.out.println("Type (1) to start this game.");
		int start=input.nextInt();
    	
		
		
		 if (start==1){
			gameCustomMethod(args);}
    }
		}
    	
    
    
    public static void gameCustomMethod(String[] args){
    	 //initialize everything
        int[] cardDeck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        List<String> pickedCards = new ArrayList<String>();

        //initialize the cards
        for(int i = 0; i< cardDeck.length; i ++)
            cardDeck[i] = i;

        //shuffle the cards
        for(int i = 0; i < cardDeck.length; i++){

            //generate an index randomly
            int index = (int)(Math.random() * cardDeck.length);
            int temp = cardDeck[i];
            cardDeck[i] = cardDeck[index];
            cardDeck[index] = temp;
        }

        //display the four cards
        for(int i = 0; i < 4; i++){
            String suit = suits[cardDeck[i] / 13];
            String rank = ranks[cardDeck[i] % 13];
            System.out.println(rank + " of " + suit);
            pickedCards.add(rank);
        }

        //create variable for Ace, King, Queen, Jack
        int Ace, Jack, Queen, King;

        //Assign a point vale to each
        int[] points = {Ace = 1, Jack = 11, Queen = 12, King = 13};

        //add the cards together and show sum
        int sum = 0;
        int jack = 11;
        int queen = 12;
        int king = 13;
        int ace = 1;
        Iterator<String> iterator = pickedCards.iterator();
        while(iterator.hasNext()) {

            String rank = iterator.next();
            System.out.println(rank);
            if(rank.equalsIgnoreCase("Jack")){
            sum = sum+jack;
        }
        else if(rank.equalsIgnoreCase("Queen")){
            sum = sum+queen;
        }
        else if(rank.equalsIgnoreCase("King")){
            sum = sum+king;
        }
        else if(rank.equalsIgnoreCase("Ace")){
            sum = sum+ace;
        } 
        else {
            sum = sum+Integer.parseInt(rank);
        }
    }
    System.out.println("Sum of picked cards is : "+sum + "\n");
    
    
}
    
}
    
    