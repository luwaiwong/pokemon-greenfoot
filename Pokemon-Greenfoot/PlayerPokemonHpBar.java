import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerPokemonHpBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerPokemonHpBar extends Battle
{
    /**
     * Act - do whatever the PlayerPokemonHpBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage image = new GreenfootImage("images/BattleImages/HPPlayer.png");
    int a =0;
    public PlayerPokemonHpBar(){
        setImage(image);
    }
    
    public void act()
    {
        a++;
        if(a>=2){
            if(getY() > 370){
                a=0;
                setLocation(getX(), getY() - 1);
            }
        }
    }
}