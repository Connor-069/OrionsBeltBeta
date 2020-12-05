import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground extends Actor
{
    /**
     * Creates a long platform for the main actor.
     */
    public Ground()
    {
        GreenfootImage platform = new GreenfootImage("platformImg.png");
        GreenfootImage image = new GreenfootImage(1040, platform.getHeight());
        int w=platform.getWidth();
        for (int offset=0; offset<1040; offset+=w) image.drawImage(platform, offset, 0);
        setImage(image);
    }
}
