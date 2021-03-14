public class MidpointKarel extends SuperKarel
{
    public void run()
    {
        int i = 0;
        while (frontIsClear()) 
        {
            move();
            i++;
        }
        int directions = (i - 1) / 2;
        turnAround();
        while (frontIsClear()) 
        {
            move();
            i++;
        }
        turnAround();
        for (int i = 0; i < directions; i++) 
        {
            move();
        }
        putBall();
    }
}
