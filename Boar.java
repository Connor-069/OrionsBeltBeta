import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boar extends Enemies
{
    public void act()
    {
        movement();
        attack();
        boarHit();
    }
    
    public void movement()
    {
        move(4);
        if (getWorld().getObjects(Orion.class).isEmpty()) return; 
        Actor orion = (Actor)getWorld().getObjects(Orion.class).get(0); // gets reference to Orion
        turnTowards(orion.getX(), orion.getY()); // turn toward Orion
    }
    
    public void attack()
    {
        Actor Orion = getOneIntersectingObject(Orion.class);
        if (Orion != null)
        {
            World world = getWorld();
            world.removeObject(Orion);
            gameOver();
        }
    }
    public void boarHit()
    {
        Actor Bullet = getOneIntersectingObject(Bullet.class);
        
        if(Bullet != null)
        {  
            getWorld().removeObject(Bullet);
            getWorld().removeObject(this);
        }
    }
    
    public void gameOver()
    {
        World gameOver = new gameOver();
        Greenfoot.setWorld(gameOver);
    }
}
