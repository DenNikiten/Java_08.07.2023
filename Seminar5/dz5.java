// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена
// с разными телефонами, их необходимо считать, как одного человека с разными телефонами.
// Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.*;

public class dz5{

    // Метод addContact, с помощью которого можно добавить контакт в телефонную книгу
    public static void addContact(String name, int phoneNumber, Map<String, List<Integer>> map){
        if (map.containsKey(name)) {
            List<Integer> list = map.get(name);
            list.add(phoneNumber);
        } else {
            List<Integer> list = new ArrayList<>();
            list.add(phoneNumber);
            map.put(name, list);
        }

    }
    // Метод printContacts, с помощью которого можно напечатать отсортированный
    // список контактов по убыванию числа телефонов
    public static void printContacts(Map<String, List<Integer>> map){
        ArrayList<Map.Entry<String, List>> list = new ArrayList(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, List>>() {
            @Override
            public int compare(Map.Entry<String, List> o1, Map.Entry<String, List> o2) {
                return o2.getValue().size() - o1.getValue().size();
            }
        });
        for (Map.Entry<String, List> entry: list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

    public static void main(String[] args) {
        Map<String, List<Integer>> phoneBook = new HashMap<>();
        addContact("Mamontov", 927452227, phoneBook);
        addContact("Vasiliev", 922222222, phoneBook);
        addContact("Vasiliev", 992222222, phoneBook);
        addContact("Hugin", 922226221, phoneBook);
        addContact("Mamontov", 922221223, phoneBook);
        addContact("Kropotkin", 922232225, phoneBook);
        addContact("Mamontov", 922222229, phoneBook);
        addContact("Mamontov", 922222227, phoneBook);
        addContact("Hugin", 925629222, phoneBook);
        addContact("Hugin", 925629282, phoneBook);
        printContacts(phoneBook);
    }
}
