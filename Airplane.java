/** Class: Airplane.java
*@author Adrian Moreno
* Course: ITEC 2150
* Written: 10/4/2022
*
* This class – Flight subclass, contains information about airplanes
*//

package Flight;

public class Airplane 
{
    private String model;
    private int year;
    
    
  public Airplane(String model, int year) 
    {
        this.model = model;
        this.year = year;
    }
    //getters and setters for new variables
    public String getModel() 
    {
        return model;
    }

    public void setModel(String model) 
    {
        this.model = model;
    }
    
    public int getYear()
    {
        return year;
    }

    public void setYear(int year) 
    {
        this.year = year;
    }
  
    //implements Fly method amd Movement methods
    public String fly()
    {
        return("I'm on an airplane that relies on an engine to fly.");
    }
    public String walk()
    {
        return("I tax on my wheels.");
    }
    public String jump()
    {
        return("I cannot jump.");
    }
    
    public String toString()
    {
        return ("Airplane [Model= " + model + ", Year = " + year + " ]:");
    }
}
