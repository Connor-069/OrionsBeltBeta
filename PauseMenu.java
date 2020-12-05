import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PauseMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PauseMenu extends World
{

    /**
     * Constructor for objects of class PauseMenu.
     * 
     */
    public PauseMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1700, 900, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        QuitButton quitButton = new QuitButton();
        addObject(quitButton,1089,667);
        ResumeButton resumeButton = new ResumeButton();
        addObject(quitButton,1089,400);
    }
}
