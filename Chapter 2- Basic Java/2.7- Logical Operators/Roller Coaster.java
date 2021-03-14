public class RollerCoaster extends ConsoleProgram
{
    public void run()
    {
        boolean tallEnough = readBoolean("tallEnough");
        boolean oldEnough = readBoolean("oldEnough");
        if ((tallEnough && oldEnough)) 
        {
            System.out.println("true");
        } 
        else 
        {
            System.out.println("false");
        }
    }
}
