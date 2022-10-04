/** Class: Airplane.java
*@author Adrian Moreno
* Course: ITEC 2150
* Written: 10/4/2022
*
* This class – Extended from movement and flight classes, details attributes of a bird
*//
package Flight;

public class Bird 
{
    private String type;
 

    public Bird(String type) 
    {
        this.type = type;
    }
    //Getter and Setter for type
    public String getType() 
    {
        return type;
    }

    public void setType(String type) 
    {
        this.type = type;
    }
    public String fly()
    {
        return("I'm a bird who flaps wings to fly.");
    }
    public String walk()
    {
        return("I walk on my feet");
    }
    public String jump()
    {
        return("I jump by leaping from my feet");
    }
    
    public String toString()
    {
        return ("Bird [Type= " + type+ "]:");
    }
}
