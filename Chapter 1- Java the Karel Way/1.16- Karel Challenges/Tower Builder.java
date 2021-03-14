public class TowerBuilderKarel extends SuperKarel
{
    public void run()
    {
        // calculate steps
        int steps = 0;
        while (frontIsClear()) 
        {
            steps++;
            move();
        }
        turnAround();
        while (frontIsClear()) 
        {
            move();
        }
        turnAround();
        int iter = ((steps - 1) / 2); // (steps + 1) - 2
        int remSteps = steps - (2 * iter);
        for (int i = 0; i < iter; i++) 
        {
            buildTower();
            move();
            move();
        }
        buildTower();
        // was stuck here in how many remaining steps to move until...
        while (frontIsClear()) 
        {
            move();
        }
        
    }
    private void buildTower() 
    {
        turnLeft();
        for (int i = 0; i < 3; i++) 
        {
            putBall();
            move();
        }
        turnAround();
        for (int i = 0; i < 3; i++) 
        {
            move();
        }
        turnLeft();
    }
    private void safeMove() 
    {
        move();
        move();
    }
}
