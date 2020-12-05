import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends Level
{
    
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public void designLevel()
    {

        map = new String [] {
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                             k       ",
            "     bbbbbbb                              bbbbbbb    ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb"                                                     
        };
    }
    public void nextLevel()
    {
        Greenfoot.setWorld(new Level3());
    }
}
