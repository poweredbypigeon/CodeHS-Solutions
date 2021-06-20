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

/* 
Perfect Rock Paper Scissors AI: (ELO 3000) from r/ProgrammerHumor 

String userGuess = readLine("Choose one of rock, paper or scissors: ");

if (userGuess.equals("rock")) {
    System.out.println("Computer guessed paper. Computer wins!");
} else if (userGuess.equals("paper")) {
    System.out.println("Computer guessed scissors. Computer wins!");
} else if (userGuess.equals("scissors")) {
    System.out.println("Computer guessed rock. Computer wins!");
} else {
    System.out.println("Response was unintelligible. Computer wins!")
}

*/
