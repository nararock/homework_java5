import java.util.ArrayList;
import java.util.HashMap;

public class task1 {
    public static HashMap<String, ArrayList<String>> phoneBook = new HashMap<String, ArrayList<String>>();

    static void addNote(String name, String number) {
        if (phoneBook.containsKey(name)) {
            ArrayList<String> temp = phoneBook.get(name);
            temp.add(number);
        } else {
            ArrayList<String> numbers = new ArrayList<String>();
            numbers.add(number);
            phoneBook.put(name, numbers);
        }
    }

    public static void main(String[] args) {
        addNote("Прасковья Анненкова", "111-11-11");
        addNote("Прасковья Анненкова", "121-21-21");
        addNote("Прасковья Анненкова", "131-31-31");
        addNote("Мария Волконская", "222-22-22");
        addNote("Александра Давыдова", "333-33-33");
        addNote("Камилла Ивашева", "444-44-44");
        addNote("Камилла Ивашева", "441-41-41");
        System.out.print(phoneBook);
    }
}