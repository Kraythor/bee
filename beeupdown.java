import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class beeupdown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class beeupdown extends Actor
{
    /**
     * Act - do whatever the beeupdown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(20);
        if(getY() < 70)
        {
            turn(46);
        }
        if(getY() > 330)
        {
            turn(-46);
        }
    }    
}
