class Main
{
    public static void main(String args[])
    {
    //call static void methods
    Methods.getRequirements();

    //java style String[ myArray
    //c++ style String myArray[]
    //call createArray() method in Methods class
    //returns initialized array, areay size determined by user
    String[] userArray = Methods.createArray(); //java style array 

    //prints pseudo-randomly generatednumbers, determind by number user inputs 
    Methods.copyArray(userArray); //pass array 
    }
}