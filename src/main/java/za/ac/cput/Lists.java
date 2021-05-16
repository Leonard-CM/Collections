package za.ac.cput;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<Integer> pl = new ArrayList<>();
        pl.add(0);
        pl.add(1);
        pl.add(2);
        pl.add(3);

        pl.remove(0);

        boolean ans = pl.contains(2);

        if (ans) {
            System.out.println("The list contains 2");
        }else {
            System.out.println("The list does not contains 2");
        }
        // use contains() to check if the element
        // 5 exits or not
        ans = pl.contains(5);

        if (ans) {
            System.out.println("The list contains 5");
        } else {
            System.out.println("The list does not contains 5");
        }
    }
}








