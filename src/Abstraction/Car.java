package Abstraction;
//Abstraction is the process of hiding the implementation details and only showing the essential details or features
//to the user.
// it allows to focus on what an object does rather than how it does it.
// the unnecessary details are not displayed to the user.

public abstract class Car
{
     abstract void Engine();
     void CarNames(){
         System.out.println("BMW");
     }
}
