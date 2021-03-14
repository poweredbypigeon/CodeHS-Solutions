public class GuessTheNumber extends ConsoleProgram
{
    public void run()
    {
        int secretNumber = 6;
        
        System.out.println("I");
        System.out.println("S");
        
        // Initialize variables to track the 40 yard dash times

        // Loop and a half to continually prompt the user for more input
        while(true)
        {
            // Input a new 40 yard dash time
            int num = readInt("Enter your guess: ");
            
            // User input the SENTINEL value, end the loop
            if(num == secretNumber)
            {
                System.out.println("Correct!");
                break;    
            } 
            else 
            {
                System.out.println("Try again!");
            }
        }
    }
}
