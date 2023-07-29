import javax.swing.undo.AbstractUndoableEdit;
import java.util.*;

public class dz6 {
    public static void main(String[] args) throws Exception {
        Laptop laptop1 = new Laptop("Aser Extensa 15", 32, 512, "Windows", "white");
        Laptop laptop2 = new Laptop("Apple MacBook Air 13", 16, 256, "MacOS", "black");
        Laptop laptop3 = new Laptop("HP ProBook 445", 8, 512, "Windows", "black");
        Laptop laptop4 = new Laptop("Aser Extensa 15", 32, 512, "Windows", "white");
        Laptop laptop5 = new Laptop("Asus VivoBook", 32, 512, "Windows", "white");
        Laptop laptop6 = new Laptop("MSI GF63", 32, 512, "Windows", "white");
        Laptop laptop7 = new Laptop("Apple MacBook Air 13", 32, 512, "MacOS", "white");


        Set<Laptop> laptops = new HashSet<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        laptops.add(laptop6);
        laptops.add(laptop7);
        // System.out.println(laptop1.equals(laptop4));
        // System.out.println(laptops);
        filter(laptops);
    }
    public static void filter(Set<Laptop> laptops) {
        HashMap<String, String> userRequest = new HashMap<>();
        userRequest.put("1", "RAM");
        userRequest.put("2", "Объем жесткого диска");
        userRequest.put("3", "Операционная система");
        userRequest.put("4", "Цвет");

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите параметр необходимого ноутбука");
        System.out.println("Введите цифру, соответствующую необходимому критерию: ");
        System.out.println("1 - RAM");
        System.out.println("2 - Объем жесткого диска");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        String enterNumber = scan.nextLine();

        if(userRequest.containsKey(enterNumber)) {
            String criteria = userRequest.get(enterNumber);
            System.out.println("Введите значение " + criteria + ":");
            String enterValue = scan.nextLine();

            Boolean flag = true;
            switch (criteria) {
                case "RAM":
                    for(Laptop laptop: laptops) {
                        if(laptop.getRAM() == Integer.parseInt(enterValue)) {
                            System.out.println(laptop.toString());
                            flag = false;
                        }
                    }

                case "Объем жесткого диска":
                    for(Laptop laptop: laptops) {
                        if(laptop.getHDD() == Integer.parseInt(enterValue)) {
                            System.out.println(laptop.toString());
                            flag = false;
                        }
                    }

                case "Операционная система":
                    for(Laptop laptop: laptops) {
                        if(enterValue.equals(laptop.getOS())) {
                            System.out.println(laptop.toString());
                            flag = false;
                        }
                    }

                case "Цвет":
                    for(Laptop laptop: laptops) {
                        if(enterValue.equals(laptop.getColour())) {
                            System.out.println(laptop.toString());
                            flag = false;
                        }
                    }
            }

            if(flag) {
                System.out.println("По таким параметрам нет ноутбуков!");
            }

        }
        else {
            System.out.println("Некорректный ввод!");
        }

        scan.close();
    }
}

