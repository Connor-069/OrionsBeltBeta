import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TutorialWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialWorld extends SWorld
{
    /**
     * Creates a scrolling world using a main actor, a background, some obstacles, and a non-scrolling score.
     */
    public TutorialWorld()
    {    
        super(1600, 900, 1, 1000); // scroll world constructor call; last parameter is scroll width
        // in the following statement, the main actor is placed in the center of the window
        setMainActor(new Orion(), 250, 300); // the int parameters are centered window x and y ranges
        // to start the main actor elsewhere
        mainActor.setLocation(100, 675);
        GreenfootImage bg = new GreenfootImage("Background.png");
        setScrollingBackground(bg); // set the scolling background image
        // add other scrollable objects normally
        addObject(new Ground(), 200, 725);
        addObject(new Box(), 20, 685);
        // use of the following also adds scrollable objects
        addObject(new Box(), 380, 685, true); // the boolean determines scrollable state
        // use the following for non-scrollable objects
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Harpy harpy = new Harpy();
        addObject(harpy,511,607);
    }
}
