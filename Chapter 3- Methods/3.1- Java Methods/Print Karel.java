public class PrintJava extends ConsoleProgram
{
    // You need to write 'printE()' method below
    public void run()
    {
        printK();
        System.out.println();
        printA();
        System.out.println();
        printR();
        System.out.println();
        printE();
        System.out.println();
        printL();
    }
    
    private void printK()
    {
        System.out.println("*   * ");
        System.out.println("* *   ");
        System.out.println("**    ");
        System.out.println("* *   ");
        System.out.println("*   * ");
    
    }
    
    private void printA()
    {
        System.out.println("*****");
        System.out.println("*   *");
        System.out.println("*****");
        System.out.println("*   *");
        System.out.println("*   *");
    }
    
    private void printR()
    {
        System.out.println("*****");
        System.out.println("*   *");
        System.out.println("****");
        System.out.println("*    *");
        System.out.println("*     *");
    }
    
    private void printE()
    {
        // make sure to put a tab and a space after the single asterisks here.
        System.out.println("*****");
        System.out.println("*    ");
        System.out.println("*****");
        System.out.println("*    ");
        System.out.println("*****");
    }
    
    private void printL()
    {
        System.out.println("*    ");
        System.out.println("*    ");
        System.out.println("*    ");
        System.out.println("*    ");
        System.out.println("*****");   
        
    }
}
