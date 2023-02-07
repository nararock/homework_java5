import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class task2 {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<>();

        String[] nameStrings = { "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                "Мария Федорова", "Марина Светлова", "Иван Савин", "Мария Рыкова", "Марина Лугова",
                "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов" };

        for (String name : nameStrings) {
            String[] temp = name.split(" ");
            if (myMap.containsKey(temp[0])) {
                int tempInt = myMap.get(temp[0]);
                tempInt += 1;
                myMap.put(temp[0], tempInt);
            } else {
                myMap.put(temp[0], 1);
            }
        }

        TreeMap<Integer, ArrayList<String>> tree = new TreeMap<>(Comparator.reverseOrder());
        for (Entry<String, Integer> entry : myMap.entrySet()) {
            if (tree.containsKey(entry.getValue())) {
                tree.get(entry.getValue()).add(entry.getKey());
            } else {
                ArrayList<String> tempArray = new ArrayList<>();
                tempArray.add(entry.getKey());
                tree.put(entry.getValue(), tempArray);
            }

        }

        System.out.print(tree);
    }

}
