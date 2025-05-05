class Vehicle
{
    //instance variables 
    private String make;
    private String model;
    private int year;

    //default constrcutor 
    public Vehicle()
    {
        System.out.println("\nInside vehicle default constructor.");
        make = "My Make";
        model = "My Model";
        year = 1970;
    }

    //parameterized constructor
    public Vehicle(String make, String model, int year)
    {
        System.out.println("\nInside vehicle constructors with parameters.");
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake()
    {
        return make;
    }

    public void setMake(String mk)
    {
        //set instance variable to parameter value
        make = mk;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String md)
    {
        //set instance variable to parameter value
        model = md;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int y)
    {
        //set instance variable to parameter value
        year = y;
    }

    public void print()
    {
        System.out.println("Make: " + make + ",Model: " + model + ",Year: " + year);
    }


}

 

