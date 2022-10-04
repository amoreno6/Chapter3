package Flight;

public class Bird 
{
    private String type;
    //no argument constructor

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
