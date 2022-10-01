public class OOPs 
{
    public static void main(String[] args) 
    {
        person p1 = new person();
        p1.name = "Khush";
        p1.age = 17;

        // person p2 = new person(31, "Harsh");

        // System.out.println(p1.age +" "+ p1.name);
        // System.out.println(p2.age +" "+ p2.name);

        // p1.eat();
        // p2.walk();
        // p2.walk(2);
        // System.out.println(person.count);

        developer d1 = new developer(30, "Raj");
        d1.walk();
    }      
}

class developer extends person 
{
    public developer(int age, String name)
    {
        super(age, name);
    }

    void walk()
    {
        System.out.println("developer "+ name +" is walking");
    }
}

class person
{
    String name;
    int age;
    static int count;

    public person()             // constructor
    {
        // count++;
        // System.out.println("creating an object");
    }

    public person(int age, String name)     // constructor
    {
        this();
        this.name = name;
        this.age = age;
    }

    void walk()
    {
        System.out.println(name +" is walking");
    }
    void eat()
    {
        System.out.println(name +" is eating");
    }

    void walk(int steps)
    {
        System.out.println(name +" walked "+ steps +" steps");
    }

    void doWork()
    {
        System.out.println("person is working");
    }
}
