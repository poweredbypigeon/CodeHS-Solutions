public class Pizza
{
    private String type;
    private String toppings;
    private int size;
    public Pizza (String theType, String theToppings, int theSize) {
        type = theType;
        toppings = theToppings;
        size = theSize;
    }
    public String toString() {
        return type + " pizza with toppings " + toppings + " and size " + size + "ordered.";
    }
    // Write your class here!   
}
