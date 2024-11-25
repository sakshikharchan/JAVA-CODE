class Employee {
    private int id;
    private String name;

    public void updateEmployee(String name, int id) {
        name = name; // Does nothing (local 'name' assigned to itself)
        id = id;     // Does nothing (local 'id' assigned to itself)
    }

    public void display() {
        System.out.println("Name: " + name + ", ID: " + id); // Always prints null, 0
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.updateEmployee("Alice", 101); // Attempt to update fields
        emp.display(); // Output: Name: null, ID: 0
    }
}
