package za.ac.cput;
import java.util.*;
public class Sets {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();


        set.add("This");
        set.add("is");
        set.add("a");
        set.add("set");

        System.out.println("Set: " + set);


        set.remove("set");



        System.out.println("Set after removing elements: "
                + set);
        boolean ans = set.contains("This");

        if (ans) {
            System.out.println("The list contains This");
        }else {
            System.out.println("The list does not contains This");
        }
    }
}


