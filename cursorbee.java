import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cursorbee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cursorbee extends Actor
{
    /**
     * Act - do whatever the cursorbee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        // Add your action code here.
        int x=getX();
        int y=getY();
        if(Greenfoot.isKeyDown("left"))
        {
            x=x-10;
        }
        if(Greenfoot.isKeyDown("right"))
        {
            x=x+10;
        }
        if(Greenfoot.isKeyDown("up"))
        {
            y=y-10;
        }
        if(Greenfoot.isKeyDown("down"))
        {
            y=y+10;
        }
        setLocation(x,y);
    }    
}
