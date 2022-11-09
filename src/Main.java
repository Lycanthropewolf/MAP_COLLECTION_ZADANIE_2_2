import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    static Map<Integer,String> map=new LinkedHashMap<>();
    public static void main(String[] args) {
        map.put(1,"ONE");
        map.put(2,"TWO");
        map.put(3,"THREE");
        map.put(4,"FOUR");
        map.put(5,"FIVE");
        map.put(6,"SIX");
        map.put(7,"SEVEN");
        map.put(8,"EIGHT");
        map.put(9,"NINE");
        map.put(10,"TEN");

        System.out.println(map);

    }
}