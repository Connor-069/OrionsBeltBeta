import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends Level
{
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
            "                 bbbbbbbbbbbbbbbbbbb                 ",
            "     bbbbbbb                             bbbbbb      ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb"
        };
    }

    public void transitionToNextLevel()
    {

    }

    public Level3()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Brazier brazier = new Brazier();
        addObject(brazier,1646,780);
        Brazier brazier2 = new Brazier();
        addObject(brazier2,46,787);

        Scorpio scorpio = new Scorpio();
        addObject(scorpio,865,813);
        
        Orion orion = new Orion();
        addObject(orion,836,652);
    }
}
