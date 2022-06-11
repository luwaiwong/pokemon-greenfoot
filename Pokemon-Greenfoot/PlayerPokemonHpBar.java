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
    boolean addedTextBar = false;
    private int maxHealth = 300; 
    private int curHealth = 300;
    SuperStatBar hpBar;
    public PlayerPokemonHpBar(){
        setImage(image);
    }
    
    public void act()
    {
        if(getY() > 370){
            setLocation(getX(), getY() - 3);
        }
        if(getY() <= 370){
            
            if(!addedTextBar){
                hpBar = new SuperStatBar(maxHealth, curHealth, this, 100, 8, 0, Color.GREEN, Color.BLACK, false, Color.BLACK, 1);
                getWorld().addObject(hpBar, 0, 0);
                //getWorld().addObject(new TextBar(), 300, 465);
                addedTextBar = true;
                
            }
            curHealth--;
            hpBar.update(curHealth);
        }
        
        //hpBar.update(curHealth);
        /*
         *
         * if(getY() == 370){
         *      addLabels -> for name, level, health
           }
         */
    }
    
    public void updateHealth(int health){
        curHealth = health;
        // TODO: Update stat bar because i have no idea how the fuck to do that
    }
    
    public void updateHealth(int health, int max){
        curHealth = health;
        maxHealth = max;
        // TODO: Update stat bar because i have no idea how the fuck to do that
    }
    
}