package collections;

import java.security.KeyStore;
import java.util.*;

public class MapExample {

    public static void main(String[] args){
        System.out.println("HashMap Example");

        Map<String,Integer> ageByPersonName = new HashMap<>();
        ageByPersonName.put("John",18);
        ageByPersonName.put("Jim",20);
        ageByPersonName.put("Jack",21);
        ageByPersonName.put("Jack",22);
        System.out.println(ageByPersonName);

        ageByPersonName = new LinkedHashMap<>();
        ageByPersonName.put("John",18);
        ageByPersonName.put("Jim",20);
        ageByPersonName.put("Jack",21);
        ageByPersonName.put("Jack",22);
        System.out.println(ageByPersonName);

        ageByPersonName = new TreeMap<>();
        ageByPersonName.put("John",18);
        ageByPersonName.put("Jim",20);
        ageByPersonName.put("Jack",21);
        ageByPersonName.put("Jack",22);
        System.out.println(ageByPersonName);

        Set<Map.Entry<String,Integer>> ageNameSet = ageByPersonName.entrySet();
        for(Map.Entry<String,Integer> entry:ageNameSet){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
