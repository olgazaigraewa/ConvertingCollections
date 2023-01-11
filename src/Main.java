import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static Map<String,Integer>map=new HashMap<>();
    public static void main(String[] args) {

        ListMap listMap = new ListMap();
        System.out.println(listMap.keysAndValues());
        System.out.println("");

        System.out.println(listMap.convertCollection());
        System.out.println("");

        //Задание 2
        Map<Integer,String>map = new LinkedHashMap<>();
        map.put(1,"map1");
        map.put(2,"map2");
        map.put(3,"map3");
        map.put(4,"map4");
        map.put(5,"map5");
        map.put(6,"map6");
        map.put(7,"map7");
        map.put(8,"map8");
        map.put(9,"map9");
        map.put(10,"map10");

        for (Map.Entry<Integer,String>entry:map.entrySet()){
            System.out.printf("%d: %s%n", entry.getKey(), entry.getValue());
        }

        //Задача 3
        addMap("Понедельник", 1);
        addMap("Вторник", 2);
        addMap("Среде", 3);
        System.out.println(map);
        addMap("Среда", 3);
        addMap("Среда", 5);
        addMap("Четверг", 4);
        addMap("Пятница", 4);
        addMap("Пятница", 5);
        addMap("Суббота", 6);
        System.out.println(map);

    }
    public static void addMap(String string, Integer integer){
        if (map.containsKey(string)){
            if (integer== map.get(string)) {
                throw new RuntimeException("Такой объект уже есть!");
            }else {
                map.put(string,integer);
                System.out.println(map);
            }
            return;
        }
        map.put(string,integer);
        System.out.println(map);
    }
}