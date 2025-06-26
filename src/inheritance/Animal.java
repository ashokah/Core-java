package inheritance;

class Animal {
    void eat()
    {
        System.out.println("eating");
    }
}
class Cat extends Animal
{
    float f = 5.0f;
    void walk()
    {
        System.out.println("walking");
    }
}
class Babycat extends Animal
{
    void drive()
    {
        System.out.println("driving");
    }
}
