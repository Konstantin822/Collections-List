package homework;

import homework.phonebook.Phonebook;
import homework.phonebook.Record;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add(new Record("Bob", "023-456-789"));
        phonebook.add(new Record("Accounting", "066-666-666"));
        phonebook.add(new Record("John", "053-446-219"));
        phonebook.add(new Record("Jane", "078-469-123"));
        phonebook.add(new Record("Bob", "092-567-231"));

        phonebook.find("John");
        phonebook.findAll("Bob");

        System.out.println();

        List<String> list1 = Arrays.asList("Box", "Apple", "Orange", "Python", "Java",
                "Table", "Chair", "Java", "Onion", "Box");
        String string = "Java";
        int count = Stuff.countOccurance(list1, string);
        System.out.println("Word " + string + " occurs: " + count + " times");
        System.out.println();

        Stuff.calcOccurance(list1);

        System.out.println();

        int[] array = {1, 2, 3, 4};
        List<Integer> list2 = Stuff.toList(array);
        System.out.println("Was array: " + Arrays.toString(array));
        System.out.println("Now list: " + list2);

        System.out.println();

        List<Integer> list3 = Arrays.asList(1, 2, 3, 3, 4, 5, 6, 5, 6, 8, 9);
        List<Integer> unique = Stuff.findUnique(list3);
        System.out.println("Unique elements: " + unique);

        System.out.println();

        List<Map<String, Object>> result = Stuff.findOccurance(list1);
        for (Map<String, Object> map : result) {
            System.out.println("Name: " + map.get("name") + ", Occurrence: " + map.get("occurrence") );
        }
    }
}
