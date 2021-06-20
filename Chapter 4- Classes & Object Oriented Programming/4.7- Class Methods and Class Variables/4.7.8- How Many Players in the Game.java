public class Player 
{
    // Static Variables
    // ...
    public static int totalPlayers;
    
    public static int maxPlayers = 10;
    
    // Public Methods
    public Player() 
    {
        totalPlayers++;
        // Some code here...
    }
    
    public static boolean gameFull() {
        return (totalPlayers >= maxPlayers);
    }
    
    // Static Methods 
    // ...
}
