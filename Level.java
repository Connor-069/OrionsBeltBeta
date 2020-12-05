import greenfoot.*;
import java.util.List;
import java.util.ArrayList;

public abstract class Level extends World
{

    String[] map;

    public Level()
    {
        super(1700, 900, 1);
        designLevel();
        for (int i=0; i<map.length; i++) for (int j=0; j<map[i].length(); j++)
            {
                int kind = "ObhdkBsK".indexOf(""+map[i].charAt(j));
                if (kind < 0) continue;
                Actor actor = null;
                if (kind == 0) actor = new Orion();
                if (kind == 1) actor = new Box();
                if (kind == 2) actor = new Harpy();
                if (kind == 3) actor = new Door();
                if (kind == 4) actor = new Key();
                if (kind == 5) actor = new Boar();
                if (kind == 6) actor = new Scorpio();
                addObject(actor, 16+j*32, 16+i*32);
            }
    }

    public void designLevel() {}

    public void nextLevel() {}
}
