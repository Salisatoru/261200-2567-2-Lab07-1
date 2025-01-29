import java.util.*;

class Student {
    public int id;
    public String name;

    public Student(int i, String n) {
        this.id = i;
        this.name = n;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

class Car {}

public class CollectionExample {
    public static void main(String[] args) {
        // Example: equals() and hashCode()
        Student s1 = new Student(1, "Peter");
        Student s3 = new Student(1, "Peter");

        System.out.println("s1.equals(s1): " + s1.equals(s1));
        System.out.println("s1.equals(s3): " + s1.equals(s3));

        // Array example
        Car[] cars2 = new Car[10];
        for (int i = 0; i < cars2.length; i++)
            cars2[i] = new Car();

        // ArrayList example
        List<String> aList = new ArrayList<>(Arrays.asList(args));
        Collections.shuffle(aList, new Random());
        System.out.println("Shuffled ArrayList: " + aList);

        // HashSet example
        Set<String> hSet = new HashSet<>(Arrays.asList("OOP", "GG", "EZ", "F", "not", "drop", "GG"));
        System.out.println("HashSet: " + hSet);

        // TreeSet example
        SortedSet<String> sSet = new TreeSet<>(Arrays.asList("OOP", "GG", "EZ", "F", "not", "drop", "GG"));
        System.out.println("TreeSet: " + sSet);

        // Directly adding data to HashMap
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Robert", "BLACK");
        hashMap.put("Mark", "WHITE");
        hashMap.put("Pedro", "YELLOW");
        hashMap.put("Cole", "BLUE");
        hashMap.put("Juliet", "BLUE");
        hashMap.put("Romeo", "GREEN");
        hashMap.put("Adam", "RED");
        hashMap.put("Eve", "BLUE");

        System.out.println("HashMap (Unordered): " + hashMap);
        System.out.println("Favorite Colors:");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Convert HashMap to TreeMap (to sort by keys)
        TreeMap<String, String> treeMap = new TreeMap<>(hashMap);
        System.out.println("TreeMap (Sorted by Key): " + treeMap);

        // Comparison
        System.out.println("HashMap does not maintain order, while TreeMap sorts keys.");

        // Stack example
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack (LIFO): " + stack);
        System.out.println("Stack Pop: " + stack.pop()); // Removes top
        System.out.println("Stack After Pop: " + stack);
    }
}
