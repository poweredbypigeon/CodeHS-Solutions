public class RacingKarel extends SuperKarel
{
    public void run()
    {
        for (int i = 0; i < 4; i++) 
        {
            oneFourth();
        }
    }
    private void oneFourth() // put down 8 balls, then completes one lap of the square.
    {
        pickBalls();
        while (frontIsClear()) 
        {
            move();
        }
        turnLeft();
    }
    private void pickBalls() // just here because I needed to define a method.
    {
        for (int i = 0; i < 8; i++) 
        {
            putBall();
        }
    }
}
