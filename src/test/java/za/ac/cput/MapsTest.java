package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class MapsTest {
@Test
    void mapsAdd(){
    HashMap<Integer, String> ml = new HashMap<Integer, String>(3);
    ml.put(1, "Lists");
    ml.put(2, "Sets");
    ml.put(3, "Maps");
    System.out.println("Values of ml" + ml);
    assertEquals(3 ,ml.size());
}

@Test
    void removeMaps(){
    HashMap<Integer, String> ml = new HashMap<Integer, String>(3);
    ml.put(1, "Lists");
    ml.put(2, "Sets");
    ml.put(3, "Maps");
    System.out.println("Values of ml" + ml);
    ml.remove(1);
    assertEquals(2, ml.size());
}
@Test
    void containsTest(){

}
}