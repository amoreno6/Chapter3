/** Class: Duck.java
*@author Adrian Moreno
* Course: ITEC 2150
* Written: 10/4/2022
*
* This class – Subclass for FarmAnimal, contains information about a Duck.
*//

package FarmAnimals;

public class Duck extends FarmAnimal
{
    private String sound;

    public Duck(String name, String gender, double weight, int age, String sound)
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
    
    public String toString()
    {
        return (super.toString() + "\n" + "Sound: " + sound);
    }

    public String feedLoadingSchedule() 
    {
        return("8am-12pm-6pm");
    }
}
