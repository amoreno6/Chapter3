/** Class: FarmAnimal.java
*@author Adrian Moreno
* Course: ITEC 2150
* Written: 10/4/2022
*
* This class – Contains information about ffarm animals as well as a method for their scheduled feeding. Acts as the superclass for all subclasses
*/  

package FarmAnimals;
import java.util.Scanner;
public abstract class FarmAnimal 
{
  // 4 attributes 
    private String name;
    private String gender;
    private double weight;
    private int age;
  
    //no argument constructor
  
    public FarmAnimal(String name, String gender, double weight, int age)
    {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }
    //getters and setters for the 4 variables
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }
    
    public String getGender() 
    {
        return gender;
    }

    public void setGender(String gender) 
    {
        this.gender = gender;
    }
   
    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight) 
    {
        this.weight = weight;
    }

    public int getAge() 
    {
        return age;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }
// toString Override
    
    public String toString()
    {
        return "[name=" + name + ", gender=" + gender +, weight=" + weight + ", age=" + age + " ]";
               
    }
  // abstract method
    public abstract String feedLoadingSchedule();

    public abstract String getSound();
}
  
 
