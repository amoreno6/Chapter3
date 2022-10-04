/** Class: Airplane.java
*@author Adrian Moreno
* Course: ITEC 2150
* Written: 10/4/2022
*
* This class – Tests flight classes and methods as well as movement methods
*//

 package Flight;
import java.util.ArrayList;
public class ThingsThatFly 
{
    public static void main(String[] args) 
    {
        ArrayList<Airplane> plane = new ArrayList<>();
        plane.add(new Airplane("Boeing",2016));
        ArrayList<Bird> birds = new ArrayList<>();
        birds.add(new Bird("Eagle"));
        birds.add(new Bird("Hummingbird"));

        for(Airplane airplane : plane)
            System.out.println(airplane.toString()+"\n" + airplane.fly() + "\n" + airplane.walk()+ "\n"+ airplane.jump());

        for(Bird bird : birds)
            System.out.println(bird.toString() +"\n"+ bird.fly() + "\n" + bird.walk() + "\n" + bird.jump());

    }
}
