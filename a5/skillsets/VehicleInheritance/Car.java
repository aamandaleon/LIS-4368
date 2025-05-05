class Car extends Vehicle
{
    //instance variables 
    private float speed;

    //default constructor 
    public Car()
    {
        //super must be the first element in constructor that calls constructor in superclass
        super(); //call super() only in constructor 
        System.out.println("\nInside car default constructor.");
        //super(); will generate error 
        speed = 100;
    }

    //parameterized constructor
    public Car(String m, String d, int y, float s)
    {
        super(m, d, y);
        System.out.println("\nInside car constructor with parameters.");
        speed = s;
    }

    //getter/seter methods(accessor/mutator methods)
    public double getSpeed()
    {
        return speed;
    }

    public void setSpeed(float s)
    {
        speed = s;
    }

    //subclass can override (replace) inherited method
    //overriden method must have same signature (same name, prameter list, and return type)
    public void print()
    {
        super.print();
        System.out.println(", Speed: " + speed);
    }
}

