package Q13;
import java.io.File; //provides input/output streams

class Main {
    public static void main (String[] args) 
    {
        //call static void methods 
        Methods.getRequirements();

        //returns file object if writeable 
        File myFile = Methods.fileWrite();
        if (myFile != null)
        {
            System.out.println("\nFile written to: " + myFile.getAbsolutePath());
        }

        Methods.fileRead(myFile);
    }
}
