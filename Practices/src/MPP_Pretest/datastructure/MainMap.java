package MPP_Pretest.datastructure;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
        Map<String, Integer> ecuadorianPeople = new HashMap<>();
        ecuadorianPeople.put("Mayra", 33);
        ecuadorianPeople.put("Mayra", 35);
        ecuadorianPeople.put("Jimmy", 34);
        System.out.println(ecuadorianPeople);

        System.out.println(ecuadorianPeople.get("Mayra"));
    }
}
