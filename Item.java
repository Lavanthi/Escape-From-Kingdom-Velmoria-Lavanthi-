/*
This class represents all items in the game(purple diamond, bleu key,purple key,wand,spellbook)
*/
public class Item {
    //instance variables
    private String name;
    private String description;

    //constructor
    public Item(String a, String d){
        name=a;
        description= d;
    }

    //gettter methods
    public String getName(){return name;}
    public String getDescription() {return description;}
}
