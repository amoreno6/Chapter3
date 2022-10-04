/** Class: Chicken.java
*@author Adrian Moreno
* Course: ITEC 2150
* Written: 10/4/2022
*
* This class – FarmAnimal application class. Tests all subclasses and superclass attributes and methods.
*//

package FarmAnimals;

import java.util.ArrayList;

public class MyFarm 
{
    public static void main(String[] args) 
    {
      //array creation
        ArrayList<FarmAnimal> animals = new ArrayList<>();

      //creating each object using the subclasses
        animals.add(new Duck("Donald","female",3.2,5,"Quack Quack"));
        animals.add(new Duck("Cheese","female",3.6,5,"Quack Quack"));
        animals.add(new Cow("Molly","female",1600.0,3,"Moo Moo"));
        animals.add(new Chicken("Albert", "male",1.6,2,"Cock-a-Doodle-do"));
        animals.add(new Chicken("Amelia","female",1.8,4,"Cluck Cluck"));
        animals.add(new Chicken("Dixie","female",1.7,4,"Cluck Cluck"));
        
        //prints array of farm animals 
        for(FarmAnimal animal : animals)
            System.out.println(animal.toString());

        for(FarmAnimal animal : animals)
            System.out.println(animal.getName() + ": " + animal.feedLoadingSchedule());
    }
}
