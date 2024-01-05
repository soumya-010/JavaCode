import java.util.ArrayList;
import java.util.List;

public class LearnCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String> ();

        list.add("Soumya");
        list.add("Shubham");
        list.add("Raj");
        list.add("Rahul");

        for(String name : list) {
            System.out.print(name + " ");
        }
        System.out.println("\n");

        list.remove(2); //When passing integer as argument, it removes the element at that index
        list.remove("Raj"); //When passing string (object) as argument, it removes the element which matches the object value

        for(String name : list) {
            System.out.print(name + " ");
        }
    }
}
