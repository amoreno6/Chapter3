/** Class: Cow.java
*@author Adrian Moreno
* Course: ITEC 2150
* Written: 10/4/2022
*
* This class – Subclass for FarmAnimal, contains information about a cow.
*//

package FarmAnimals;

public class Cow extends FarmAnimal
{
    private String sound;
    
    public Cow(String name, String gender, double weight, int age, String sound) 
    {
      
        super(name, gender, weight, age);
        this.sound = sound;
    }
    
    public String getSound() 
    {
        return sound;
    }

    public void setSound(String sound) 
    {
        this.sound = sound;
    }

    public String feedLoadingSchedule()
    {
        return "6am-4pm";
    }
    
    public String toString() 
    {
        return ("Cow " + sound + " " + super.toString());
    }
}
