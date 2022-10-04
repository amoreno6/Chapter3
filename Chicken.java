/** Class: Chicken.java
*@author Adrian Moreno
* Course: ITEC 2150
* Written: 10/4/2022
*
* This class – Subclass for FarmAnimal, contains information about a chicken.
*//

package FarmAnimals;


public class Chicken extends FarmAnimal 
{
    private String sound;

    
    public Chicken(String name, String gender, double weight, int age, String sound) 
    {
        super(name, gender, weight, age);
        this.sound = sound;
    }
    
    public String getSound() 
    {
        return sound;
    }

    public void setSound(String sound) {
    
        this.sound = sound;
    }
    
    // toString Override
    public String toString()
    {
        return ("Chicken " + sound + " " + super.toString());
    }

    // Feed schedule method
    public String feedLoadingSchedule() 
    {
        return "8am-4pm";
    }
}
