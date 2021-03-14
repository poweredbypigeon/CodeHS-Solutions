public class DoubleTennisBallsKarel extends SuperKarel
{
    public void run()
    {
        move();
        while (ballsPresent()) 
        {
            oneTwo();
        }
        move();
        turnAround();
        while (ballsPresent()) 
        {
            oneOne();
        }
        move();
        move();
        turnAround();
        
    }
    private void oneTwo() 
    { // remove one ball from (1, 0) facing east and put 2 in (2, 0)
        takeBall();
        move();
        putBall();
        putBall();
        turnAround();
        move();
        turnAround();
    }
    private void oneOne() 
    { // remove one ball from (1, 0) facing west and put 1 in (2, 0)
        takeBall();
        move();
        putBall();
        turnAround();
        move();
        turnAround();
    }
}
