package za.ac.cput;

import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetsTest {
    @Test
//This test adds elements to the Set
    void addTest(){
        Set<Integer> sl = new HashSet<>();
        sl.add(0);
        sl.add(1);
        sl.add(2);
        sl.add(3);
        System.out.println("The numbers are :" + sl);
        assertEquals(4,sl.size());
    }
    @Test
    void removeTest(){
        //This test adds elements then removes the element 1 from the Set
        Set<Integer> sl = new HashSet<>();
        sl.add(0);
        sl.add(1);
        sl.add(2);
        sl.add(3);
        sl.remove(1);
        System.out.println("The numbers are :" + sl);
        assertEquals(3,sl.size());
    }
    @Test
// This test checks if the element 2 is in the Set
    void containsTest(){
        Set<Integer> sl = new HashSet<>();
        sl.add(0);
        sl.add(1);
        sl.add(2);
        sl.add(3);
        boolean ans = sl.contains(2);

        if (ans) {
            System.out.println("The Set contains 2");
        }else {
            System.out.println("The Set does not contains 2");
        }
        assertEquals(4,sl.size());
    }
}