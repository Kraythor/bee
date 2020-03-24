import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bee extends Actor
{
    /**
     * Act - do whatever the bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 20;
    public void act() 
    {
        // Add your action code here.
        move(speed);
        if(getX()> 530)
        {
            setRotation(90);
            if(getY()> 330)
            {
                setRotation(180);   
            }
        }
        if(getX()< 70)
        {
            setRotation(270);
            if(getY()< 70)
            {
                setRotation(0);
            }
        } 
        

    }    
}
