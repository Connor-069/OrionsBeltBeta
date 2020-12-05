import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scorpio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scorpio extends Enemies
{
    
    public int steps;
    public int speed = 3;
  
    public void act() 
    {
        patrolArea();
        steps = (steps+1)%300;
    }
    private void patrolArea()
    {
        if (getObjectsInRange(200, Key.class).isEmpty())  
        {
            if (steps == 0) speed = -speed;
            move(speed);
        }
    }
}
