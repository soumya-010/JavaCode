import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.AbstractMap.SimpleEntry;

public class LearnSort {
    public static void main(String[] args) {
        // Creating an array of pairs

        ArrayList<Map.Entry<Integer, String>> players = new  ArrayList<Map.Entry<Integer, String>> ();
        players.add(new SimpleEntry<>(9, "Suarez"));
        players.add(new SimpleEntry<>(9, "Messi"));
        players.add(new SimpleEntry<>(10, "Neymar"));

        players.sort(Comparator.<Map.Entry<Integer, String>, Integer> comparing(Map.Entry::getKey).thenComparing(Map.Entry::getValue));

        for (Map.Entry<Integer, String> player : players) {
            System.out.println(player.getKey() + ": " + player.getValue());
        }

        players.sort(Comparator.comparing(Map.Entry::getValue));

        for (Map.Entry<Integer, String> player : players) {
            System.out.println(player.getKey() + ": " + player.getValue());
        }
    }
}