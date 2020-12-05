import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Harpy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Harpy extends Enemies
{
    public void act()
    {
        movement();
        attack();
        harpyHit();
    }

    public void movement()
    {
        move(2);

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

    public void harpyHit()
    {
        Actor Bullet = getOneIntersectingObject(Bullet.class);

        if(Bullet != null)
        {
            getWorld().removeObject(Bullet);
            getWorld().removeObject(this);
            Greenfoot.playSound("HarpyDeath.wav");
        }
    }

    public void gameOver()
    {
        World gameOver = new gameOver();
        Greenfoot.setWorld(gameOver);
    }
}

