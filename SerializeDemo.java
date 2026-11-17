import java.io.*;
import java.util.*;

class Employee implements Serializable {
    String name;
    int age;

    Employee(String n, int a) {
        name = n;
        age = a;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + "}";
    }
}

public class SerializeDemo {
    public static void serialize(List<Employee> list, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(list);
            System.out.println("Serialized successfully.");
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Employee> deserialize(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (List<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
            return new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("John", 30),
            new Employee("Jane", 25),
            new Employee("Budi", 28)
        );

        String file = "emp.ser";
        serialize(employees, file);

        List<Employee> restored = deserialize(file);
        restored.forEach(System.out::println);
    }
}
