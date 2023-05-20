package functional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExerciseMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 20);
        map.put("Javascript", 15);
        map.put("PHP", 10);

        printOldWay(map);
        printNewWay(map);
    }

    private static void printOldWay(Map<String, Integer> map) {
        StringBuilder stringBuilder = new StringBuilder();
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            stringBuilder.append("Key: ").append(entry.getKey())
                    .append(",")
                    .append("Value: ").append(entry.getValue())
                    .append(",")
                    .append("\n");
        }
        String result = stringBuilder.toString();
        System.out.println(result);
    }

    private static void printNewWay(Map<String, Integer> map) {
        List<String> list = map.entrySet().stream().map( (entry) ->{
                    return String.format("Key: %s, Value: %s",entry.getKey(),entry.getValue());
                }).collect(Collectors.toList());
        System.out.println(String.join(",\n",list));
    }
}
