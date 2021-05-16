package za.ac.cput;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

class ListsTest {
@Test
//This test adds elements to the list
    void addTest(){
    List<Integer> pl = new ArrayList<>();
    pl.add(0);
    pl.add(1);
    pl.add(2);
    pl.add(3);
    System.out.println("The numbers are :" + pl);
    assertEquals(4,pl.size());
}
@Test
    void removeTest(){
    //This test adds elements then removes the element 1 from the list
   List<Integer> pl = new ArrayList<>();
    pl.add(0);
    pl.add(1);
    pl.add(2);
    pl.add(3);
    pl.remove(1);
    System.out.println("The numbers are :" + pl);
    assertEquals(3,pl.size());
}
@Test
// This test checks if the element 2 is in the list
    void containsTest(){
    List<Integer> pl = new ArrayList<>();
    pl.add(0);
    pl.add(1);
    pl.add(2);
    pl.add(3);
    boolean ans = pl.contains(2);

    if (ans) {
        System.out.println("The list contains 2");
    }else {
        System.out.println("The list does not contains 2");
    }
    assertEquals(4,pl.size());
}
}