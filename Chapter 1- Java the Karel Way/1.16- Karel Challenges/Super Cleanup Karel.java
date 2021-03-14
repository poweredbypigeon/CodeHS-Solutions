public class SuperCleanupKarel extends SuperKarel
{
    public void run()
    {
        // check amount of steps.
        int stepsEast = 0;
        while (frontIsClear()) 
        {
            stepsEast++;
            move(); 
        }
        turnAround();
        while (frontIsClear()) 
        {
            move(); 
        }
        turnAround();
        int stepsNorth = 0;
        turnLeft();
         while (frontIsClear()) 
         {
            stepsNorth++;
            move(); 
        }
        turnAround();
        while (frontIsClear()) 
        {
            move(); 
        }
        turnLeft();
        for (int i = 0; i < stepsNorth; i++) 
        {
            for (int j = 0; j < stepsEast; j++) 
            {
                remove();
                move();
            }
            remove();
            if (facingEast()) 
            {
                turnUp2();
            } 
            else 
            {
                turnUp();
            }
        }
        for (int j = 0; j < stepsEast; j++) 
        {
            remove();
            move();
        }
        remove();
        orientWest();
        while (frontIsClear()) 
        {
            move();
        }
        orientSouth();
        while (frontIsClear()) 
        {
            move();
        }
    }
    private void remove() 
    {
        if (ballsPresent()) 
        {
            takeBall();
        }
    }
    private void turnUp() 
    { // used to put Karel on a higher street if he is at leftmost avenue.
        turnRight();
        move();
        turnRight();
    }
    private void turnUp2() 
    { // used to put Karel on a higher street if he is at rightmost avenue.
        turnLeft();
        move();
        turnLeft();
    }
    private void orientWest() 
    {
        while (notFacingWest()) 
        {
            turnLeft();    
        }
    }
    private void orientSouth() 
    {
        while (notFacingSouth()) 
        {
            turnLeft();    
        }
    }
}
