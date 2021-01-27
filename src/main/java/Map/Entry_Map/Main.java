package Map.Entry_Map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("0", 0);
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry);
        }
    }

}
