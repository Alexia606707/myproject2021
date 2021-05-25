package fju.car;

import java.util.HashMap;
import java.util.Map;

public class MapTester {
    public static void main(String[] args) {
        Map<String, String> students = new HashMap<>();
        students.put("999", "Hank");
        students.put("001", "Ha");
        students.put("002", "Han");
        students.put("003", "Hank");
        String name = students.get("001");
        System.out.println(name);
    }
}
