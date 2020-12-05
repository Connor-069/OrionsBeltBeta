import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Level
{
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public void designLevel()
    {

        map = new String [] {
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                      bbbbbbbbbbb                    ",
            "                                                     ",
            "              d                                      ",
            "                                   bbbbb             ",
            "           bbbbbbb                                k  ",
            "                                                     ",
            "                                           bbbbbbbbbb",
            "                                                     ",
            "                                    bbbbb            ",
            "                                                     ",
            "   b                         bbbbb                   ",
            "   b     bbbb                                        ",
            "   bbb            bbbbbbb                            ",
            "     b                                               ",
            "     b                                               ",
            "     bbbbbbbbb                                       ",
            "                                                     ",
            "                bbbbbbbbbbb    bbbbb                 ",
            "                                                     ",
            "                                                     ",
            "                                       bbbbb         ",
            "                                                     ",
            "                                                     ",
            "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb"                                                 
        };
    }

    public void nextLevel()
    {
        Greenfoot.setWorld(new Level2());
    }
}