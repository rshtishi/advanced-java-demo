package collections;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {

        List<Grade> gradeList = new ArrayList<>();
        gradeList.add(new Grade(5));
        gradeList.add(new Grade(5));
        gradeList.add(new Grade(5));

        Set<Grade> gradeSet = new HashSet<>();
        gradeSet.addAll(gradeList);
        System.out.println(gradeList);
        Iterator<Grade> gradeIterator = gradeSet.iterator();
        while(gradeIterator.hasNext()){
            System.out.println(gradeIterator.next());
        }

        Set<String> stringSet = new HashSet<>();
        stringSet.add("John");
        stringSet.add("Jimie");
        stringSet.add("Jack");
        stringSet.add("Jack");
        System.out.println(stringSet);

        Set<String> stringTreeSet = new TreeSet<>(new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        stringTreeSet.add("John");
        stringTreeSet.add("Jim");
        stringTreeSet.add("Jack");
        stringTreeSet.add("Jack");
        System.out.println(stringTreeSet);

        Set<String> stringLinkedHashSet = new LinkedHashSet<>();
        stringLinkedHashSet.add("John");
        stringLinkedHashSet.add("Jim");
        stringLinkedHashSet.add("Jack");
        stringLinkedHashSet.add("Jack");
        System.out.println(stringLinkedHashSet);
    }
}
