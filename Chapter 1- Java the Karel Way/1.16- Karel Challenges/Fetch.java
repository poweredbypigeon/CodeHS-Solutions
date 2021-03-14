public class FetchKarel extends SuperKarel
{
    // obligatory comment!
    public void run()
    {
        getThere();
        takeBall();
        turnAround();
        getBack();
        turnAround();
        putBall();
    }
    private void getThere()
    {
        move();
        turnLeft();
        for (int i = 0; i < 4; i++) 
        {
            move();
        }
        turnRight();
        move();
    }
    
    private void getBack()
    {
        move();
        turnLeft();
        for (int i = 0; i < 4; i++) 
        {
            move();
        }
        turnRight();
        move();
    }
}
