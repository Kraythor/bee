import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        bee bee1=new bee();
        addObject(bee1,30,40);
        
        beeupdown beeupdown1=new beeupdown();
        addObject(beeupdown1,30,40);
        
        cursorbee cursorbee1=new cursorbee();
        addObject(cursorbee1,30,40);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
