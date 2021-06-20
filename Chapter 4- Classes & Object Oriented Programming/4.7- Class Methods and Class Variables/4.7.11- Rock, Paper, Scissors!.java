public class RockPaperScissors extends ConsoleProgram
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";
        
    private String getWinner(String user, String computer)
    {
        // Return the proper string for the result.
        String USER_PLAYER = "User wins!";
        String COMPUTER_PLAYER = "Computer wins!";
        String TIE = "Tie";
        if (user.equals("rock")) {
            if (computer.equals("paper")) {
                return COMPUTER_PLAYER;
            } else if (computer.equals("scissors")) {
                return USER_PLAYER;
            }
        } else if (user.equals("scissors")) {
            if (computer.equals("rock")) {
                return COMPUTER_PLAYER;
            } else if (computer.equals("paper")) {
                return USER_PLAYER;
            }
        } else if (user.equals("paper")) {
            if (computer.equals("scissors")) {
                return COMPUTER_PLAYER;
            } else if (computer.equals("rock")) {
                return USER_PLAYER;
        }
    }
    // Your code here
    return TIE;
}

    
    public void run()
    {
        String userGuess = "x";
        Randomizer r = new Randomizer();
        while (!userGuess.equals("")) {
            userGuess = readLine("Enter your choice (rock, paper, or scissors):");
            if (!userGuess.equals("")) { // an enter will apparently register as ""
                int cpuRaw = r.nextInt(1, 3);
                String cpuGuess = "";
                if (cpuRaw == 1) cpuGuess = "rock";
                if (cpuRaw == 2) cpuGuess = "scissors";
                if (cpuRaw == 3) cpuGuess = "paper";
                System.out.println("User: " + userGuess);
                System.out.println("Computer: " + cpuGuess);
                System.out.println(getWinner(userGuess, cpuGuess));   
            }
        }
        System.out.println("Thanks for playing!");
    }
}
