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
        System.out.println(ageByPersonName.get("Jack"));
        System.out.println(ageByPersonName);

        Set<Map.Entry<String,Integer>> ageNameSet = ageByPersonName.entrySet();
        for(Map.Entry<String,Integer> entry:ageNameSet){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        for(String personName:ageByPersonName.keySet()){
            System.out.println(personName+" -> "+ageByPersonName.get(personName));
        }

        List<Integer> integerList = Arrays.asList(1,1,1,1,2,3,4,5);
        Map<Integer,Integer> frequencyByNumber = new HashMap<>();

        for(Integer i:integerList){
            if(frequencyByNumber.containsKey(i)){
                int val = frequencyByNumber.get(i)+1;
                frequencyByNumber.put(i,val);
            } else {
                frequencyByNumber.put(i,1);
            }
        }

        System.out.println(frequencyByNumber);

        List<String> nameList = Arrays.asList("Rando","Rando","Rando", "Arben","Goni");
        Map<String,Integer> frequencyByName = new HashMap<String,Integer>();
        for(String name: nameList){
            if(frequencyByName.containsKey(name)){
                int val = frequencyByName.get(name)+1;
                frequencyByName.put(name,val);
            } else {
                frequencyByName.put(name,1);
            }
        }
        System.out.println(frequencyByName);
    }


}
