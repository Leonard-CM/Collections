package za.ac.cput;
import java.util.*;
public class Maps {
    public static void main(String[] args)
    {
        HashMap<Integer, String> ml = new HashMap<Integer, String>(3);
        ml.put(1, "Lists");
        ml.put(2, "Sets");
        ml.put(3, "Maps");
        System.out.println("Values of ml" + ml);
    }
}
