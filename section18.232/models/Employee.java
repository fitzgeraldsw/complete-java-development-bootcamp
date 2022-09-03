package models;
public class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        if (name == null || name.isBlank() || position == null || position.isBlank()) {
            throw new IllegalArgumentException("name or position cannot be null/blank");
        }
        this.name = name;
        this.position = position;
    }

    // copy constructor does nto need to throw an exception; constructor already checked
    public Employee(Employee source) {
        this.name = source.name;
        this.position = source.position;
    }

    public String getName() {
        return name;
    }
    
    public String getPosition() {
        return position;
    }

    public String toString() {
        return "\tName: " + name + "\tPosition: " + this.position + "\n";
    }
}