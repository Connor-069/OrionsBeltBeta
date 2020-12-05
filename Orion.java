import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Orion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orion extends Actor
{
    final int jSpeed = 20; // the initial 'jump' speed
    int ySpeed = 0, xSpeed = 0; // the initial vertical and horizontal speeds
    boolean aboutFace; // the direction (left or right) the actor is facing
    boolean onGround; // the state of the actor being set on an object or not
    private boolean hasKey = false;

    

    /** 
     * Checks for changes in direction and moves the main actor.
     */
    public void act()
    {
        getDirection();
        move();
        pauseGame();
        if (!hasKey)
            hasKey = getOneIntersectingObject(Key.class) != null;
        if (getOneIntersectingObject(Door.class) != null && hasKey)
            nextLevel();
       
    }  
    public void nextLevel()
    {
        Greenfoot.setWorld(new Level2());
    }

    /**
     * Moves the actor with appropriate image.  Checks for obstacles and adjusts
     * the position of the actor accordingly.
     */
    private void move()
    {
        ySpeed++; // adds gravity
        if (xSpeed != 0 && onGround) xSpeed += aboutFace ? 1 : -1; // add friction
        setLocation(getX()+xSpeed/10, getY() + ySpeed / 2);
        // check for change in horizontal direction
        if ((xSpeed > 0 && aboutFace) || (xSpeed < 0 && !aboutFace)) 
        {
            getImage().mirrorHorizontally();
            aboutFace = !aboutFace;
        }

        // check for obstacles
        onGround = false; // initialize value
        // check below the actor
        while (getOneObjectAtOffset(0, getImage().getHeight()/2+1, Actor.class) != null)
        {
            setLocation(getX(), getY()-1); 
            onGround = true; 
            ySpeed = 0;
        }
        // check above the actor
        while (getOneObjectAtOffset(0, -getImage().getHeight()/2-1, Actor.class) != null) 
        {
            setLocation(getX(), getY()+1);
            ySpeed = 0;
        }
        // check to right of actor
        while (getOneObjectAtOffset(getImage().getWidth()/2+1, 0, Actor.class) != null)
        {
            setLocation(getX()-1, getY());
            xSpeed = 0;
        }
        // check to left of actor
        while (getOneObjectAtOffset(-getImage().getWidth()/2-1, 0, Actor.class) != null)
        {
            setLocation(getX()+1, getY());
            xSpeed = 0;
        }
        if ("f".equals(Greenfoot.getKey()))
        {
            Actor bullet = new Bullet();
            if (aboutFace) bullet.turn(180);
            getWorld().addObject(bullet, getX(), getY());
            bullet.move(32);

        }
    }

    /**
     * Determines any changes in horizontal and vertical speeds for the actor.
     */
    private void getDirection()
    {
        // if (!onGround) return; // if not mid-air changes allowed
        // sets requested direction of move, or continues in current direction
        if (Greenfoot.isKeyDown("a") && xSpeed > -50) xSpeed -= 2; // check left
        if (Greenfoot.isKeyDown("d") && xSpeed < 50) xSpeed += 2; // check right
        if (Greenfoot.isKeyDown("space") && onGround) // check jump
        {
            ySpeed -= jSpeed; // add jump speed
        }
    }

    public void pauseGame()
    {
        if (Greenfoot.isKeyDown("p"))
            Greenfoot.setWorld(new PauseMenu());

    }

    
}
